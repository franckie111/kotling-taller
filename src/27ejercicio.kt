import kotlin.math.PI
import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese el primer valor")
    val valor1 = scanner.nextDouble()
    println("Ingrese el segundo valor")
    val valor2 = scanner.nextDouble()
    println("Ingrese el tercer valor")
    val valor3 = scanner.nextDouble()

    val areaTriangulo = (valor1 * valor2) / 2
    val areaCirculo = PI * valor1 * valor1
    val areaRectangulo = valor1 * valor2

    if (areaTriangulo == valor3) {
        println("El tercer valor suministrado corresponde al área de un triángulo.")
    } else if (areaCirculo == valor3) {
        println("El tercer valor suministrado corresponde al área de un círculo.")
    } else if (areaRectangulo == valor3) {
        println("El tercer valor suministrado corresponde al área de un rectángulo.")
    } else {
        println("El tercer valor suministrado no coincide con el área de ninguna de las figuras conocidas.")
    }
}