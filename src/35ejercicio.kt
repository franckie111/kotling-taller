fun main() {
    println("Ingrese la temperatura en grados Fahrenheit:")
    val temperaturaFahrenheit = readlnOrNull()?.toDoubleOrNull()
    if (temperaturaFahrenheit != null) {
        val deporte = determinarDeporte(temperaturaFahrenheit)
        println("Deporte apropiado para $temperaturaFahrenheit°F: $deporte")
    } else {
        println("Entrada inválida. Por favor ingrese un número válido.")
    }
}
fun determinarDeporte(temperaturaFahrenheit: Double): String {
    return when {
        temperaturaFahrenheit > 85 -> "Natación"
        temperaturaFahrenheit in 70.0..85.0 -> "Tenis"
        temperaturaFahrenheit in 32.0..70.0 -> "Golf"
        temperaturaFahrenheit in 10.0..32.0 -> "Esquí"
        else -> "Marcha"
    }
}