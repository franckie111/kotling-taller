import kotlin.math.abs
import java.util.Scanner
@Suppress("NAME_SHADOWING")
fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese un número para calcular su raíz cuadrada:")
    val numero = scanner.nextDouble()
    if ( numero > 0) {
        var x = 0.1
        val rn= 0
        do {
            val rn = (x + numero / x) / 2
            x = rn
        } while (abs(x - rn) >= 0.000001)
        println("La raíz cuadrada de $numero es aproximadamente: $rn")
    } else {
        println("Por favor ingrese un número válido y positivo.")
    }
}