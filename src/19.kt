fun main() {

    print("Ingrese el monto presupuestado: ")
    val presupuesto = readLine()!!.toDouble()


    val ginecologia = presupuesto * 0.40
    val traumatologia = presupuesto * 0.30
    val pediatria = presupuesto * 0.30


    println("Cantidad de dinero para Ginecología: $ginecologia")
    println("Cantidad de dinero para Traumatología: $traumatologia")
    println("Cantidad de dinero para Pediatría: $pediatria")
}