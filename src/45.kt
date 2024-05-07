fun main() {
    val A = 2.0
    val B = 5.0
    val C = 2.0

    val discriminante = calcularDiscriminante(A, B, C)

    when {
        discriminante == 0.0 -> {
            val raizUnica = calcularRaizUnica(A, B)
            println("La ecuación tiene una única solución: X = $raizUnica")
        }
        discriminante > 0.0 -> {
            val (raiz1, raiz2) = calcularRaices(A, B, discriminante)
            println("La ecuación tiene dos soluciones: X1 = $raiz1 y X2 = $raiz2")
        }
        else -> {
            println("La ecuación no tiene solución en los números reales.")
        }
    }
}

fun calcularDiscriminante(A: Double, B: Double, C: Double): Double {
    return B * B - 4 * A * C
}

fun calcularRaizUnica(A: Double, B: Double): Double {
    return -B / (2 * A)
}

fun calcularRaices(A: Double, B: Double, discriminante: Double): Pair<Double, Double> {
    val raiz1 = (-B + sqrt(discriminante)) / (2 * A)
    val raiz2 = (-B - sqrt(discriminante)) / (2 * A)
    return Pair(raiz1, raiz2)
}