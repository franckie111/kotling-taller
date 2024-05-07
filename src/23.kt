fun main() {
    val m=452
    val n=197
    val b1=132
    val b2=180
    val b3=7.50
    val b4=14.50
    val bultosHarina=m/24
    val cajasAceite=n/15
    val ingBultos=bultosHarina*b1
    val ingCajas=cajasAceite*b2
    val kgHarinaRest=m%24
    val litAceiteRest=n%15
    val ingHarinaRest=kgHarinaRest*b3
    val ingAceiteRest=litAceiteRest*b4
    val ingTotal=ingBultos+ingCajas+ingHarinaRest+ingAceiteRest

    println("El ingreso total por la venta de cada tonelada de maíz es: Bs. $ingTotal")
}