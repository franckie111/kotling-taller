import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese las hectareas del bosque")
    val hectareasBosque = scanner.nextInt()
    val superficieBosqueMetrosCuadrados = hectareasBosque * 10000
    val porcentajePino: Double
    val porcentajeOyamel: Double
    val porcentajeCedro: Double
    if (superficieBosqueMetrosCuadrados > 1000000) {
        porcentajePino = 0.70
        porcentajeOyamel = 0.20
        porcentajeCedro = 0.10
    } else {
        porcentajePino = 0.50
        porcentajeOyamel = 0.30
        porcentajeCedro = 0.20
    }
    val numPinos = (superficieBosqueMetrosCuadrados * porcentajePino / 8).toInt()
    val numOyameles = (superficieBosqueMetrosCuadrados * porcentajeOyamel / 15).toInt()
    val numCedros = (superficieBosqueMetrosCuadrados * porcentajeCedro / 10).toInt()
    println("Número de pinos a sembrar: $numPinos")
    println("Número de oyameles a sembrar: $numOyameles")
    println("Número de cedros a sembrar: $numCedros")
}