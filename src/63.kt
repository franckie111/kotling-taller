fun main() {
    val encuesta: List<Alumno> = obtenerDatosDeEncuesta()

    val promedioEdadMujeres = calcularPromedioEdad(encuesta.filter { it.sexo == 'F' })

    val promedioEdadHombres = calcularPromedioEdad(encuesta.filter { it.sexo == 'M' })

    val cantidadHombres = encuesta.count { it.sexo == 'M' }
    val cantidadMujeres = encuesta.count { it.sexo == 'F' }

    val totalPersonas = encuesta.size
    val porcentajeSolteros = encuesta.count { it.estadoCivil == "Soltero" }.toDouble() / totalPersonas * 100
    val porcentajeCasados = encuesta.count { it.estadoCivil == "Casado" }.toDouble() / totalPersonas * 100
    val porcentajeDivorciados = encuesta.count { it.estadoCivil == "Divorciado" }.toDouble() / totalPersonas * 100

    val cantidadPorEspecialidad = encuesta.groupBy { it.especialidad }.mapValues { it.value.size }
    val totalAlumnos = encuesta.size
    val porcentajePorEspecialidad = cantidadPorEspecialidad.mapValues { it.value.toDouble() / totalAlumnos * 100 }

    val mujeresAdultas = encuesta.filter { it.sexo == 'F' && it.edad > 21 }.size.toDouble()
    val porcentajeMujeresAdultas = mujeresAdultas / cantidadMujeres * 100

    val hombresJovenes = encuesta.filter { it.sexo == 'M' && it.edad > 17 && it.edad <= 21 }.size.toDouble()
    val porcentajeHombresJovenes = hombresJovenes / cantidadHombres * 100

    val cantidadHombresSolteros = encuesta.count { it.sexo == 'M' && it.estadoCivil == "Soltero" }
    val cantidadMujeresSolteras = encuesta.count { it.sexo == 'F' && it.estadoCivil == "Soltera" }

    println("a. Promedio de edad de las mujeres: $promedioEdadMujeres")
    println("b. Promedio de edad de los hombres: $promedioEdadHombres")
    println("c. Cantidad de hombres encuestados: $cantidadHombres")
    println("   Cantidad de mujeres encuestadas: $cantidadMujeres")
    println("d. Porcentaje de personas solteras: $porcentajeSolteros%")
    println("   Porcentaje de personas casadas: $porcentajeCasados%")
    println("   Porcentaje de personas divorciadas: $porcentajeDivorciados%")
    println("e. Cantidad y porcentaje de alumnos por especialidad:")
    cantidadPorEspecialidad.forEach { (especialidad, cantidad) ->
        val porcentaje = porcentajePorEspecialidad[especialidad]
        println("   $especialidad: $cantidad alumnos ($porcentaje%)")
    }
    println("f. Porcentaje de mujeres adultas: $porcentajeMujeresAdultas%")
    println("g. Porcentaje de hombres jóvenes: $porcentajeHombresJovenes%")
    println("h. Cantidad de hombres solteros: $cantidadHombresSolteros")
    println("   Cantidad de mujeres solteras: $cantidadMujeresSolteras")
}

data class Alumno(val edad: Int, val sexo: Char, val estadoCivil: String, val especialidad: String)


fun obtenerDatosDeEncuesta(): List<Alumno> {
    return listOf(
        Alumno(22, 'F', "Soltera", "Informática"),
        Alumno(20, 'M', "Soltero", "Ingeniería"),
        Alumno(25, 'F', "
