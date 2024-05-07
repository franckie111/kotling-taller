fun main() {

    print("Ingrese la lectura del anterior recibo (en kilovatios): ")
    val reciboAnterior = readLine()!!.toDouble()

    print("Ingrese la lectura actual (en kilovatios): ")
    val reciboActual = readLine()!!.toDouble()

    print("Ingrese el costo por kilovatio: ")
    val costoPorKilovatio = readLine()!!.toDouble()


    val consumo = reciboActual - reciboAnterior


    val montoTotal = consumo * costoPorKilovatio


    println("El monto total a pagar del recibo de energia es: $montoTotal")
}