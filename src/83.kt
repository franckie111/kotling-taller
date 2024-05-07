fun main() {
    val CT = arrayOf("Centro1", "Centro2", "Centro3")
    val H = intArrayOf(20, 10, 15, 30, 25, 20)
    val TR = intArrayOf(5, 8, 3)

    val centroConMasRestaurantes = CT[TR.indexOf(TR.maxOrNull())]

    val totalHabitacionesPorCentro = H.asList().chunked(2)
    val totalHabitaciones = totalHabitacionesPorCentro.map { it.sum() }
    val centroConMasHabitaciones = CT[totalHabitaciones.indexOf(totalHabitaciones.maxOrNull()!!)]

    val centroDado = "Centro1"
    val indiceCentroDado = CT.indexOf(centroDado)
    val habitacionesCentroDado = totalHabitacionesPorCentro[indiceCentroDado].sum()

    println("a) El centro turístico con más restaurantes es: $centroConMasRestaurantes")
    println("b) El centro turístico con más habitaciones es: $centroConMasHabitaciones")
    println("c) El centro turístico '$centroDado' tiene $habitacionesCentroDado habitaciones.")
}
