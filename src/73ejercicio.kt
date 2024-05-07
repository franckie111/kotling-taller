class Cliente(
    val codigo: Int,
    val nombre: String,
    val direccion: String,
    val codigoEstado: Int,
    val codigoAgencia: Int,
    val pagares: MutableList<Pagare>
)
class Pagare(
    val numero: Int,
    val fechaVencimiento: String,
    val monto: Double
)
class Agencia(
    val codigo: Int,
    val codigoEstado: Int,
    val clientesConPendientes: MutableList<Int>,
    var montoTotalAdeudado: Double = 0.0,
    var clienteMayorDeuda: Int = -1
)
class Estadoss(
    val codigo: Int,
    var montoTotalAdeudado: Double = 0.0,
    var codigoAgenciaMenorDeuda: Int = -1,
    var codigoAgenciaMayorDeuda: Int = -1
)
fun imprimirRecibos(clientes: List<Cliente>, fecha: String) {
    for (cliente in clientes) {
        var totalPendiente = 0.0
        println("Recibo para Cliente ${cliente.codigo}:")
        println("Nombre: ${cliente.nombre}")
        println("Dirección: ${cliente.direccion}")
        println("Código de Estado: ${cliente.codigoEstado}")
        println("Código de Agencia: ${cliente.codigoAgencia}")
        println("Detalle del recibo:")
        for (pagare in cliente.pagares) {
            if (pagare.fechaVencimiento == fecha) {
                println("Número del pagaré: ${pagare.numero}")
                println("Fecha de vencimiento: ${pagare.fechaVencimiento}")
                println("Monto del pagaré: ${pagare.monto}")
                totalPendiente += pagare.monto
            }
        }
        println("Total de pagarés pendientes: ${cliente.pagares.size}")
        println("Monto total pendiente: $totalPendiente")
        println("--------------------------------------")
    }
}
fun imprimirPorAgencia(agencias: List<Agencia>) {
    for (agencia in agencias) {
        println("Agencia ${agencia.codigo}:")
        println("Código de Estado: ${agencia.codigoEstado}")
        println("Cantidad de clientes con pagarés pendientes: ${agencia.clientesConPendientes.size}")
        println("Monto total adeudado: ${agencia.montoTotalAdeudado}")
        println("Código de cliente con mayor deuda: ${agencia.clienteMayorDeuda}")
        println("--------------------------------------")
    }
}
fun imprimirPorEstadoss(estados: List<Estadoss>) {
    for (estadoss in estados) {
        println("Estado ${estadoss.codigo}:")
        println("Monto total adeudado en el estado: ${estadoss.montoTotalAdeudado}")
        println("Código de agencia con menor monto adeudado: ${estadoss.codigoAgenciaMenorDeuda}")
        println("Código de agencia con mayor monto adeudado: ${estadoss.codigoAgenciaMayorDeuda}")
        println("--------------------------------------")
    }
}
fun calcularMontoPromedio(agencias: List<Agencia>): Double {
    val montosMaximos = agencias.map { it.montoTotalAdeudado }
    val montoMaximoNacional = montosMaximos.maxOrNull() ?: 0.0
    val cantidadAgencias = agencias.size
    return montoMaximoNacional / cantidadAgencias
}
fun main() {
    val cliente1 = Cliente(1, "Cliente 1", "Dirección 1", 1, 1, mutableListOf(
        Pagare(1, "01/01/2024", 100.0),
        Pagare(2, "01/01/2024", 200.0)
    ))
    val cliente2 = Cliente(2, "Cliente 2", "Dirección 2", 2, 2, mutableListOf(
        Pagare(3, "01/01/2024", 150.0)
    ))
    val cliente3 = Cliente(3, "Cliente 3", "Dirección 3", 1, 1, mutableListOf(
        Pagare(4, "01/01/2024", 300.0),
        Pagare(5, "01/01/2024", 250.0)
    ))
    val agencia1 = Agencia(1, 1, mutableListOf(1, 3))
    val agencia2 = Agencia(2, 2, mutableListOf(2))
    val agencias = listOf(agencia1, agencia2)
    val estado1 = Estadoss(1)
    val estado2 = Estadoss(2)
    val estados = listOf(estado1, estado2)
    val fecha = "01/01/2024"
    imprimirRecibos(listOf(cliente1, cliente2, cliente3), fecha)
    imprimirPorAgencia(agencias)
    imprimirPorEstadoss(estados)
    println("Monto promedio adeudado: ${calcularMontoPromedio(agencias)}")
}