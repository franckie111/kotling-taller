import kotlin.math.sqrt
fun main() {
    println("Ingrese la longitud de los lados del triángulo (separados por espacios):")
    val input = readlnOrNull()
    val lados = input?.split(" ")?.map { it.toIntOrNull() }
    if (lados?.size == 3 && lados.all { it != null && it > 0 }) {
        val ladoA = lados[0]!!
        val ladoB = lados[1]!!
        val ladoC = lados[2]!!
        val esTriangulo = ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA
        if (esTriangulo) {
            val tipoTriangulo = when {
                ladoA == ladoB && ladoB == ladoC -> "equilátero"
                ladoA == ladoB || ladoB == ladoC || ladoA == ladoC -> "isósceles"
                else -> "escaleno"
            }
            val s = (ladoA + ladoB + ladoC) / 2.0
            val area = sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC))
            println("Los lados proporcionados forman un triángulo $tipoTriangulo.")
            println("El área del triángulo es: $area")
        } else {
            println("Los lados proporcionados no forman un triángulo.")
        }
    } else {
        println("Debe ingresar tres números enteros positivos.")
    }
}