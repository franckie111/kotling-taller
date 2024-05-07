fun main() {

    print("Ingrese el precio final pagado: ")
    val precioFinal = readLine()!!.toDouble()

    print("Ingrese el precio de venta al público (PVP): ")
    val pvp = readLine()!!.toDouble()


    val descuento = ((pvp - precioFinal) / pvp) * 100


    println("El porcentaje de descuento aplicado es: $descuento%")
}