fun main() {
    val X = 48000
    val Y = 6
    val K = 42000

    val costoTotal = (X.toDouble() / 12) * Y


    val ganancia = K - costoTotal


    val porcentajeGanancia = (ganancia / costoTotal) * 100

    println("Porcentaje de ganancia obtenida: $porcentajeGanancia%")
}