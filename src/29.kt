fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese el salario mensual")
    val salMensual = scanner.nextDouble()
    println("Ingrese las ventas del departamento 1")
    val ventDepar1 = scanner.nextDouble()
    println("Ingrese las ventas del departamento 2")
    val ventDepar2 = scanner.nextDouble()
    println("Ingrese las ventas del departamento 3")
    val ventDepar3 = scanner.nextDouble()
    val ventTotal = ventDepar1 + ventDepar2 + ventDepar3
    val limIncen = ventTotal * 0.33
    val incenDepar1 = if (ventDepar1 > limIncen) salMensual * 0.20 else 0.0
    val incenDepar2 = if (ventDepar2 > limIncen) salMensual * 0.20 else 0.0
    val incenDepar3 = if (ventDepar3 > limIncen) salMensual * 0.20 else 0.0
    val totalIncen = incenDepar1 + incenDepar2 + incenDepar3
    val totalPagar = salMensual * 3 + totalIncen
    println("Los vendedores de los tres departamentos recibirán al finalizar el mes: $totalPagar")
}
