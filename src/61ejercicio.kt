fun multiplicacionRusa(multiplicador: Int, multiplicando: Int): Int {
    var mult = multiplicador
    var muld = multiplicando
    var suma = 0
    while (muld > 0) {
        if (muld % 2 != 0) {
            suma += mult
        }
        mult *= 2
        muld /= 2
    }
    return suma
}
fun main() {
    val multiplicador = 25
    val multiplicando = 7
    val resultado = multiplicacionRusa(multiplicador, multiplicando)
    println("El resultado de la multiplicación de $multiplicador x $multiplicando es: $resultado")
}