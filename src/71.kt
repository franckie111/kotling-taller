fun main() {
    val niños: List<Niño> = obtenerDatosDeNiños()

    val totalTachira = niños.count { it.estado == "Táchira" }
    val totalDistritoCapital = niños.count { it.estado == "Distrito Capital" }
    val totalPais = niños.size

    val porcentajeTachira = (totalTachira.toDouble() / totalPais) * 100
    val porcentajeDistritoCapital = (totalDistritoCapital.toDouble() / totalPais) * 100

    val grupo1 = niños.count { it.edad < 1 }
    val grupo2 = niños.count { it.edad in 1..3 }
    val grupo3 = niños.count { it.edad in 4..6 }
    val grupo4 = niños.count { it.edad > 6 }

    val totalNiños = niños.count { it.sexo == 'M' }
    val totalNiñas = niños.count { it.sexo == 'F' }
    val porcentajeNiños = (totalNiños.toDouble() / totalPais) * 100
    val porcentajeNiñas = (totalNiñas.toDouble() / totalPais) * 100


    println("a. Porcentaje de huérfanos del Estado Táchira: $porcentajeTachira%")
    println("   Porcentaje de huérfanos del Distrito Capital: $porcentajeDistritoCapital%")
    println("b. Número de huérfanos en cada grupo de edad:")
    println("   Grupo 1 (menores de 1 año): $grupo1")
    println("   Grupo 2 (edad entre 1 y 3 años): $grupo2")
    println("   Grupo 3 (edad entre 4 y 6 años): $grupo3")
    println("   Grupo 4 (mayores de 6 años): $grupo4")
    println("c. Cantidad de niños: $totalNiños ($porcentajeNiños%)")
    println("   Cantidad de niñas: $totalNiñas ($porcentajeNiñas%)")
}

data class Niño(val sexo: Char, val edad: Int, val orfanatorio: String, val estado: String)

fun obtenerDatosDeNiños(): List<Niño> {
    return listOf(
        Niño('M', 2, "Orfanato A", "Táchira"),
        Niño('F', 4, "Orfanato B", "Distrito Capital"),
        Niño('M', 5, "Orfanato C", "Táchira"),
        Niño('F', 1, "Orfanato D", "Distrito Capital"),
        Niño('M', 7, "Orfanato E", "Táchira"),
        Niño('F', 3, "Orfanato F", "Distrito Capital"),
    )
}
