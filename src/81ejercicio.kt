data class Vendedor(val codigo: Int, val unidadesVendidas: Int, val montoTotal: Double)

data class CanalComercial(val codigo: Int, val tipo: String) // Tipo: "tienda" o "calle"

data class Ciudad(val codigo: Int, val nombre: String, val unidadesEsperadas: Int, val canales: List<CanalComercial>, val vendedores: List<Vendedor>) {
    constructor(codigo: Int, nombre: String, unidadesEsperadas: Int, canales: Array<CanalComercial>, vendedores: Array<Vendedor>) :
            this(codigo, nombre, unidadesEsperadas, canales.toList(), vendedores.toList())
}

data class Estado(val codigo: Int, val nombre: String, val ciudades: List<Ciudad>) {
    constructor(codigo: Int, nombre: String, ciudades: Array<Ciudad>) :
            this(codigo, nombre, ciudades.toList())
}

@Suppress("NAME_SHADOWING")
fun main() {
    val estado1 = Estado(
        101, "Estado1", arrayOf(
            Ciudad(10101, "Ciudad1", 1000, arrayOf(CanalComercial(111, "tienda"), CanalComercial(112, "calle")),
                arrayOf(Vendedor(11101, 500, 15000.0), Vendedor(11202, 700, 20000.0), Vendedor(11103, 800, 25000.0))),
            Ciudad(10102, "Ciudad2", 1500, arrayOf(CanalComercial(111, "tienda"), CanalComercial(112, "calle")),
                arrayOf(Vendedor(11104, 900, 30000.0), Vendedor(11205, 1200, 35000.0)))
        )
    )

    // Por ciudad
    val ciudad = estado1.ciudades[0]
    println("Código de ciudad: ${ciudad.codigo}")
    println("Nombre de ciudad: ${ciudad.nombre}")
    val totalUnidadesVendidas = ciudad.vendedores.sumOf { it.unidadesVendidas }
    val montoTotalBruto = ciudad.vendedores.sumOf { it.montoTotal }
    val montoComisionTienda =
        ciudad.vendedores.filter { it.codigo.toString().startsWith("11") }.sumOf { it.montoTotal * 0.1 }
    val montoComisionCalle =
        ciudad.vendedores.filter { it.codigo.toString().startsWith("12") }.sumOf { it.montoTotal * 0.15 }
    val canalMayorMontoNeto = ciudad.canales.maxByOrNull { canal ->
        ciudad.vendedores.filter { it.codigo.toString().startsWith(canal.codigo.toString().substring(0, 3)) }
            .sumOf { it.montoTotal }
    }
    val vendedorMenorUnidadesVendidas = ciudad.vendedores.minByOrNull { it.unidadesVendidas }
    println("Total de unidades vendidas: $totalUnidadesVendidas")
    println("Monto total bruto: $montoTotalBruto")
    println("Monto de comisión por vendedores de tienda: $montoComisionTienda")
    println("Monto de comisión por vendedores de calle: $montoComisionCalle")
    println("Código del canal de comercialización con mayor monto neto de venta: ${canalMayorMontoNeto?.codigo}")
    println("Código del vendedor con menor número de unidades vendidas: ${vendedorMenorUnidadesVendidas?.codigo}")
    println("------------------------------------------")

    // Por Estado
    println("Por Estado:")
    println("Código de estado: ${estado1.codigo}")
    println("Nombre de estado: ${estado1.nombre}")
    val montoNetoVendido = estado1.ciudades.sumOf { ciudad ->
        ciudad.vendedores.sumOf { it.montoTotal }
    }
    val porcentajeCiudadesNoAlcanzaronEsperadas = estado1.ciudades.count { it.vendedores.sumOf { vendedor -> vendedor.unidadesVendidas } < it.unidadesEsperadas }.toDouble() / estado1.ciudades.size * 100
    val ciudadesPorEncimaEsperadas = estado1.ciudades.count { it.vendedores.sumOf { vendedor -> vendedor.unidadesVendidas }
        .toDouble() in it.unidadesEsperadas * 1.4..it.unidadesEsperadas * 1.6 }
    println("Monto neto vendido: $montoNetoVendido")
    println("Porcentaje de ciudades que no alcanzaron las cantidades esperadas: $porcentajeCiudadesNoAlcanzaronEsperadas%")
    println("Cantidad de ciudades que obtuvieron de un 40% a un 60% por encima de la cantidad esperada: $ciudadesPorEncimaEsperadas")
}