fun main() {
    val deudaTotal = 12775
    val primerPago = 100
    val diferenciaPagos = 125


    val numeroPagos = calcularNumeroPagos(deudaTotal, primerPago, diferenciaPagos)


    val ultimoPago = calcularUltimoPago(deudaTotal, primerPago, diferenciaPagos)


    println("Número de pagos: $numeroPagos")
    println("Monto del último pago: $ultimoPago")
}

fun calcularNumeroPagos(deudaTotal: Int, primerPago: Int, diferenciaPagos: Int): Int {
    val sumaDePagos = deudaTotal - primerPago
    val numeroPagos = sumaDePagos / diferenciaPagos + 1 s 1
    return numeroPagos
}

fun calcularUltimoPago(deudaTotal: Int, primerPago: Int, diferenciaPagos: Int): Int {
    val numeroPagos = calcularNumeroPagos(deudaTotal, primerPago, diferenciaPagos)
    val ultimoPago = primerPago + (numeroPagos - 1) * diferenciaPagos
    return ultimoPago
}
