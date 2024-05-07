import kotlin.math.pow
fun main() {
    println("Ingrese el costo tanto del automóvil como del terreno:")
    val costo = readlnOrNull()?.toDoubleOrNull()
    if (costo != null && costo > 0) {
        val tasaDevaluacionAnual = 0.10
        val devaluacionAutomovil = costo * (1 - (1 - tasaDevaluacionAnual).pow(3.0))
        val tasaIncrementoAnual = 0.08
        val incrementoTerreno = costo * ((1 + tasaIncrementoAnual).pow(3.0) - 1)
        if (devaluacionAutomovil <= incrementoTerreno / 2) {
            println("La persona debería comprar el automóvil.")
        } else {
            println("La persona no debería comprar el automóvil.")
        }
    } else {
        println("Debe ingresar un valor válido y positivo para el costo del automóvil y del terreno.")
    }
}