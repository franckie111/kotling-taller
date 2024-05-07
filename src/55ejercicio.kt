fun main() {
    val limite = 1000
    var suma = 0.0
    var terminos = 0
    for (k in 1..Int.MAX_VALUE) {
        val termino = (k * k + 1.0) / k
        suma += termino
        terminos++
        if (suma >= limite) {
            break
        }
    }
    println("Número de términos necesarios: $terminos")
}