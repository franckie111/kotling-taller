fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese la distancia recorrida en kilometros: ")
    val distRecor = scanner.nextDouble()
    println("Ingrese el precio base")
    val precioBase = scanner.nextDouble()
    val montoAPagar = when {
        distRecor <= 300 -> precioBase
        distRecor<= 1000 -> precioBase + 200 * (distRecor - 300)
        else -> precioBase + 200 * (1000 - 300) + 150 * (distRecor - 1000)
    }
    println("El cliente debe pagar: Bs. $montoAPagar")
}