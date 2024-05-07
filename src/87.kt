fun main() {
    val nombres = arrayOf("María", "José", "Ana", "Juan", "Elena")
    val sexos = arrayOf('F', 'M', 'F', 'M', 'F')
    val edades = intArrayOf(40, 35, 50, 45, 55)

    val edadPromedio = calcularEdadPromedio(edades)

    val nombreProfesorMasJoven = nombres[edades.indexOf(edades.minOrNull()!!)]

    val nombreProfesorMasViejo = nombres[edades.indexOf(edades.maxOrNull()!!)]

    val cantidadProfesorasMayoresAlPromedio = contarProfesorasMayoresAlPromedio(edades, sexos, edadPromedio)

    val cantidadProfesoresMenoresAlPromedio = contarProfesoresMenoresAlPromedio(edades, sexos, edadPromedio)


    println("a. Edad promedio del grupo de profesores: $edadPromedio años")
    println("b. Nombre del profesor más joven del grupo: $nombreProfesorMasJoven")
    println("c. Nombre del profesor con más edad del grupo: $nombreProfesorMasViejo")
    println("d. Número de profesoras con edad mayor al promedio: $cantidadProfesorasMayoresAlPromedio")
    println("e. Número de profesores con edad menor al promedio: $cantidadProfesoresMenoresAlPromedio")
}

fun calcularEdadPromedio(edades: IntArray): Double {
    val sumaEdades = edades.sum()
    return sumaEdades.toDouble() / edades.size
}

fun contarProfesorasMayoresAlPromedio(edades: IntArray, sexos: Array<Char>, edadPromedio: Double): Int {
    var contador = 0
    for (i in edades.indices) {
        if (sexos[i] == 'F' && edades[i] > edadPromedio) {
            contador++
        }
    }
    return contador
}

fun contarProfesoresMenoresAlPromedio(edades: IntArray, sexos: Array<Char>, edadPromedio: Double): Int {
    var contador = 0
    for (i in edades.indices) {
        if (sexos[i] == 'M' && edades[i] < edadPromedio) {
            contador++
        }
    }
    return contador
}
