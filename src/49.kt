fun main() {
    var todasCorrectas = 0
    var primeraYSegundaCorrectas = 0
    var primeraYTerceraCorrectas = 0
    var segundaYTerceraCorrectas = 0
    var alMenosPrimeraCorrecta = 0
    var alMenosSegundaCorrecta = 0
    var alMenosTerceraCorrecta = 0
    var ningunaCorrecta = 0

    repeat(100) {
        val respuestas = generarRespuestasAleatorias()

        if (respuestas[0] && respuestas[1] && respuestas[2]) {
            todasCorrectas++
        }
        if (respuestas[0] && respuestas[1] && !respuestas[2]) {
            primeraYSegundaCorrectas++
        }
        if (respuestas[0] && !respuestas[1] && respuestas[2]) {
            primeraYTerceraCorrectas++
        }
        if (!respuestas[0] && respuestas[1] && respuestas[2]) {
            segundaYTerceraCorrectas++
        }
        if (respuestas[0] || respuestas[1] || respuestas[2]) {
            alMenosPrimeraCorrecta++
        }
        if (respuestas[0] || respuestas[1] || respuestas[2]) {
            alMenosSegundaCorrecta++
        }
        if (respuestas[0] || respuestas[1] || respuestas[2]) {
            alMenosTerceraCorrecta++
        }
        if (!respuestas[0] && !respuestas[1] && !respuestas[2]) {
            ningunaCorrecta++
        }
    }

    println("a. Personas que respondieron correctamente las tres preguntas: $todasCorrectas")
    println("b. Personas que respondieron correctamente solo la primera y la segunda pregunta: $primeraYSegundaCorrectas")
    println("c. Personas que respondieron correctamente solo la primera y la tercera pregunta: $primeraYTerceraCorrectas")
    println("d. Personas que respondieron correctamente solo la segunda y la tercera pregunta: $segundaYTerceraCorrectas")
    println("e. Personas que respondieron correctamente la primera pregunta por lo menos: $alMenosPrimeraCorrecta")
    println("f. Personas que respondieron correctamente la segunda pregunta por lo menos: $alMenosSegundaCorrecta")
    println("g. Personas que respondieron correctamente la tercera pregunta por lo menos: $alMenosTerceraCorrecta")
    println("h. Personas que no respondieron correctamente ninguna pregunta: $ningunaCorrecta")
}

fun generarRespuestasAleatorias(): BooleanArray {
    return booleanArrayOf(
        (0..1).random() == 1,
        (0..1).random() == 1,
        (0..1).random() == 1
    )
}
