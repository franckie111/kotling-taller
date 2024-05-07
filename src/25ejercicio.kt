import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese el sueldo del trabajador")
    val sueldo: Double =  scanner.nextDouble()
    val aumento = if (sueldo < 40000) {
        0.15
    } else {
        0.12
    }
    val nuevoSueldo = sueldo * (1 + aumento)
    println("El nuevo sueldo del trabajador es: $nuevoSueldo")
}
