fun main() {
    val hTrabajadas = 40
    val precioHora = 5500
    val descImpuestos = 0.20
    val sueldoBase = hTrabajadas * precioHora
    val descuento = sueldoBase * descImpuestos
    val salarioNeto = sueldoBase - descuento
    println("El salario neto del trabajador es: $salarioNeto")
}