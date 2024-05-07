fun main() {
    val limiteSuperior = 10000
    buscarNumerosAmigos(limiteSuperior)
}

fun buscarNumerosAmigos(limite: Int) {
    println("Números amigos dentro del rango hasta $limite:")
    for (num1 in 2 until limite) {
        val sumDiv1 = sumarDivisores(num1)
        val num2 = sumDiv1
        if (num2 < limite) {
            val sumDiv2 = sumarDivisores(num2)
            if (sumDiv2 == num1 && num1 != num2) {
                println("$num1 y $num2 son números amigos.")
            }
        }
    }
}

fun sumarDivisores(numero: Int): Int {
    var suma = 1
    for (i in 2 until numero) {
        if (numero % i == 0) {
            suma += i
        }
    }
    return suma
}
