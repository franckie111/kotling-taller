import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese el nombre del cliente")
    val nombreCliente = scanner.nextDouble()
    println("Ingrese el monto de la compra")
    val montoCompra = scanner.nextDouble()
    val descuento = when {
        montoCompra < 500 -> 0.0
        montoCompra < 1000 -> 0.05
        montoCompra < 7000 -> 0.11
        montoCompra < 15000 -> 0.18
        else -> 0.25
    }
val montoDescuento = montoCompra - (montoCompra * descuento)
println("Nombre del cliente: $nombreCliente")
println("Monto de la compra: $$montoCompra")
println("Descuento recibido: ${descuento * 100}%")
println("Monto a pagar: $$montoDescuento")
}