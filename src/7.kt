fun main() {
    val metros = 2.5
    val resultado = convMetrosPiesPulgadas(metros)
    println("$metros metros equivalen a ${resultado.first} pies y ${resultado.second} pulgadas.")
}
fun convMetrosPiesPulgadas(metros: Double): Pair<Int, Double> {
    val pulgTotal = metros * 39.27
    val pies = (pulgTotal / 12).toInt()
    val pulgRest = pulgTotal % 12
    return Pair(pies, pulgRest)
}