fun main() {
    val empleados: List<Empleado> = obtenerDatosDeEmpleados()

    for (empleado in empleados) {
        val aportePorHijos = calcularAportePorHijos(empleado.numeroHijos, empleado.sueldoBasico)

        val aportePorAsistencia = if (empleado.asistencia > 95) 0.05 * empleado.sueldoBasico else 0.0

        val deduccionCajaAhorros = 0.10 * empleado.sueldoBasico
        val deduccionSeguroSocial = 0.02 * empleado.sueldoBasico

        val sueldoNeto = empleado.sueldoBasico + aportePorHijos + aportePorAsistencia - deduccionCajaAhorros - deduccionSeguroSocial

        println("Nombre: ${empleado.nombre}, Cédula: ${empleado.cedula}")
        println("Sueldo básico: ${empleado.sueldoBasico}")
        println("Aporte a la Caja de Ahorros: $deduccionCajaAhorros")
        println("Deducción para el Seguro Social: $deduccionSeguroSocial")
        println("Sueldo neto: $sueldoNeto\n")
    }
}

data class Empleado(val nombre: String, val cedula: String, val tipoEmpleado: String, val sueldoBasico: Double, val numeroHijos: Int, val asistencia: Int)


fun obtenerDatosDeEmpleados(): List<Empleado> {
    return listOf(
        Empleado("Juan Pérez", "123456789", "Obrero", 100000.0, 2, 100),
        Empleado("María López", "987654321", "Administrativo", 165500.0, 1, 98),
        Empleado("Carlos González", "456789123", "Ejecutivo", 250000.0, 0, 100)
    )
}


fun calcularAportePorHijos(numeroHijos: Int, sueldoBasico: Double): Double {
    return if (numeroHijos <= 5) 0.10 * sueldoBasico * numeroHijos else 0.10 * sueldoBasico * 5
}
