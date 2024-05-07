fun main() {
    println("Ingrese la nota de parciales:")
    val nota_del_parciales = readLine()!!.toInt()

    println("Ingrese la nota del examen:")
    val nota_del_examen = readLine()!!.toInt()

    println("Ingrese la nota de la calificación del trabajo final")
    val nota_del_trabajo_final = readLine()!!.toInt()

    val resultadoP = when (nota_del_parciales) {
        in 0..29 -> {
            "Bajo"
        }
        in 30..40 -> {
            "Regular"
        }
        in 41..50 -> {
            "Alto"
        }
        else -> {
            "Respuesta incorrecta"
        }
    }

    println("El resultado del parcia  es: $resultadoP")






    val resultadoE = when (nota_del_examen) {
        in 0..29 -> {
            "Bajo"
        }
        in 30..40 -> {
            "Regular"
        }
        in 41..50 -> {
            "Alto"
        }
        else -> {
            "Respuesta incorrecta"
        }
    }

    println("El resultado del examen es: $resultadoE")







    val resultadoT = when (nota_del_trabajo_final) {
        in 0..29 -> {
            "Bajo"
        }
        in 30..40 -> {
            "Regular"
        }
        in 41..50 -> {
            "Alto"
        }
        else -> {
            "Respuesta incorrecta"
        }
    }

    println("El resultado del trabajo  es: $resultadoT")

    var sumParcial= nota_del_parciales+nota_del_examen+nota_del_trabajo_final
    var promedio= sumParcial/3

    println( "la nota final es: $promedio")



}










