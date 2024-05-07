fun main() {
    val pesosAnteriores = doubleArrayOf(70.5, 65.2, 80.0, 75.7, 68.9)
    val promediosPesosActuales = doubleArrayOf(71.3, 66.8, 79.5, 75.9, 69.4)
    for (i in 0..<5) {
        val diferencia = promediosPesosActuales[i] - pesosAnteriores[i]
        val mensaje = if (diferencia > 0) {
            "SUBIO ${diferencia.format(1)} kg"
        } else if (diferencia < 0) {
            "BAJO ${(-diferencia).format(1)} kg"
        } else {
            "MANTIENE SU PESO"
        }
        println("Persona ${i + 1}: $mensaje")
    }
}
fun Double.format(digits: Int) = "%.${digits}f".format(this)