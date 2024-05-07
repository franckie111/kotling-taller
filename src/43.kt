fun main() {

    val capitalActual = obtenerCapitalActual()


    val nuevoSaldoDeseado = obtenerNuevoSaldoDeseado(capitalActual)


    val cantidadPrestamo = calcularCantidadPrestamo(capitalActual, nuevoSaldoDeseado)


    val presupuestoEquipoComputo = 5000.0


    val presupuestoMobiliario = 2000.0

    val restoPresupuesto = nuevoSaldoDeseado - presupuestoEquipoComputo - presupuestoMobiliario

    val cantidadInsumos = restoPresupuesto / 2

    val cantidadIncentivosPersonal = restoPresupuesto / 2

    println("Cantidad destinada para la compra de insumos: $cantidadInsumos")
    println("Cantidad destinada para incentivos al personal: $cantidadIncentivosPersonal")
    if (cantidadPrestamo > 0) {
        println("Cantidad a pedir prestada al banco: $cantidadPrestamo")
    }
}

fun obtenerCapitalActual(): Double {
    return 1000.0 }

fun obtenerNuevoSaldoDeseado(capitalActual: Double): Double {
    return when {
        capitalActual < 0 -> 10000.0
        capitalActual > 20000 -> capitalActual
        else -> 20000.0
    }
}

fun calcularCantidadPrestamo(capitalActual: Double, nuevoSaldoDeseado: Double): Double {
    return when {
        capitalActual < nuevoSaldoDeseado -> nuevoSaldoDeseado - capitalActual
        else -> 0.0
    }
}