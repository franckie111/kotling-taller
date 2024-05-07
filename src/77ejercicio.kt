fun main() {
    val municipiosEstados = listOf(
        listOf(1000, 1500, 1200, 800, 2000),
        listOf(800, 1200, 900, 1100, 1300),
        listOf(2000, 1800, 1500, 1700, 1600),
        listOf(700, 600, 800, 500, 1000),
        listOf(1200, 900, 1100, 800, 1500)
    )
    val poblacionesEstados = mutableListOf<Int>()
    var poblacionTotalPais = 0
    municipiosEstados.forEach { municipios ->
        val poblacionEstado = municipios.sum()
        poblacionesEstados.add(poblacionEstado)
        poblacionTotalPais += poblacionEstado
    }
    val estadoMayorPoblacionIndex = poblacionesEstados.indexOf(poblacionesEstados.maxOrNull())
    val estadoMayorPoblacion = "Estado ${estadoMayorPoblacionIndex + 1}: ${poblacionesEstados[estadoMayorPoblacionIndex]} habitantes"
    val estadoMenorPoblacionIndex = poblacionesEstados.indexOf(poblacionesEstados.minOrNull())
    val estadoMenorPoblacion = "Estado ${estadoMenorPoblacionIndex + 1}: ${poblacionesEstados[estadoMenorPoblacionIndex]} habitantes"
    val porcentajeTotalEstados = (poblacionTotalPais.toDouble() / poblacionesEstados.sum() * 100)
    val promedioHabitantesPorEstado = (poblacionTotalPais.toDouble() / poblacionesEstados.size)
    println("a. $estadoMayorPoblacion")
    println("b. $estadoMenorPoblacion")
    println("c. Porcentaje total de los habitantes de los 5 estados respecto al total del país: $porcentajeTotalEstados%")
    println("d. Promedio de habitantes por estado: $promedioHabitantesPorEstado")
}