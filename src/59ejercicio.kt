fun main() {
    val notasMatematica = mutableListOf<Double>()
    val notasProgramacion = mutableListOf<Double>()
    val notasIngles = mutableListOf<Double>()
    var alumnosAprobadosTodas = 0
    var alumnosConExamenIngles = 0
    var alumnosSinExamenIngles = 0
    var sumaNotasProgramacion = 0.0
    println("Ingrese las notas de los alumnos. Para terminar, ingrese una nota negativa.")
    while (true) {
        print("Nota de Matemática (negativa para terminar): ")
        val notaMatematica = readlnOrNull()?.toDoubleOrNull()
        if (notaMatematica != null && notaMatematica >= 0) {
            notasMatematica.add(notaMatematica)
        } else {
            break
        }
        print("Nota de Programación: ")
        val notaProgramacion = readlnOrNull()?.toDoubleOrNull()
        if (notaProgramacion != null) {
            notasProgramacion.add(notaProgramacion)
            sumaNotasProgramacion += notaProgramacion
        }
        print("Nota de Inglés: ")
        val notaIngles = readlnOrNull()?.toDoubleOrNull()
        if (notaIngles != null) {
            if (notaIngles >= 0) {
                notasIngles.add(notaIngles)
                alumnosConExamenIngles++
            } else {
                alumnosSinExamenIngles++
            }
        }
    }
    val notaMenorProgramacion = notasProgramacion.minOrNull()
    if (notaMenorProgramacion != null) {
        println("a. Nota menor de Programación: $notaMenorProgramacion")
    } else {
        println("a. No hay notas registradas de Programación.")
    }
    val porcentajeSinExamenIngles = (alumnosSinExamenIngles.toDouble() / alumnosConExamenIngles.toDouble()) * 100
    println("b. Porcentaje de alumnos sin examen de inglés: %.2f%%".format(porcentajeSinExamenIngles))
    for (i in notasMatematica.indices) {
        if (notasMatematica[i] >= 6 && notasProgramacion[i] >= 6 && (notasIngles.getOrNull(i) ?: 0.0) >= 6) {
            alumnosAprobadosTodas++
        }
    }
    println("c. Número de alumnos que aprobaron todas las materias: $alumnosAprobadosTodas")
    val promedioProgramacion = if (notasProgramacion.isNotEmpty()) sumaNotasProgramacion / notasProgramacion.size else 0.0
    println("d. Promedio general en Programación: %.2f".format(promedioProgramacion))
    val alumnosConExamenMatematica = notasMatematica.size
    val alumnosReprobadosMatematica = notasMatematica.count { it < 6 }
    val porcentajeReprobadosMatematica = (alumnosReprobadosMatematica.toDouble() / alumnosConExamenMatematica.toDouble()) * 100
    println("e. Porcentaje de alumnos que reprobaron Matemática: %.2f%%".format(porcentajeReprobadosMatematica))
}