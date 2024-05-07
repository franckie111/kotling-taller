fun main() {
    val empleados = mutableListOf<Empleado>()
    println("Ingrese los datos de los empleados (nombre, nacionalidad(V o E), edad, tipo de empleado(1,2,3), horas trabajadas):")
    repeat(3) {
        print("Empleado ${it + 1}: ")
        val input = readlnOrNull()
        if (input != null) {
            val datos = input.split(" ")
            if (datos.size == 5) {
                val nombre = datos[0]
                val nacionalidad = datos[1]
                val edad = datos[2].toIntOrNull()
                val tipoEmpleado = datos[3].toIntOrNull()
                val horasTrabajadas = datos[4].toIntOrNull()
                if (edad != null && tipoEmpleado != null && horasTrabajadas != null) {
                    empleados.add(Empleado(nombre, nacionalidad, edad, tipoEmpleado, horasTrabajadas))
                } else {
                    println("Datos ingresados incorrectos. Intente nuevamente.")
                }
            } else {
                println("Formato de datos incorrecto. Intente nuevamente.")
            }
        } else {
            println("Datos ingresados incorrectos. Intente nuevamente.")
        }
    }
    val tarifaPorHora = mapOf(1 to 5000, 2 to 10000, 3 to 15000)
    var totalSueldos = 0
    var totalVenezolanos = 0
    var totalExtranjerosEdadImpar = 0
    var totalEdad = 0
    for (empleado in empleados) {
        val sueldoBruto = tarifaPorHora[empleado.tipoEmpleado]!! * empleado.horasTrabajadas
        val seguroSocial = if (sueldoBruto > 100000) (sueldoBruto * 0.03) else 0
        totalSueldos += sueldoBruto
        totalEdad += empleado.edad
        if (empleado.nacionalidad == "V") {
            totalVenezolanos++
        }
        if (empleado.nacionalidad == "E" && empleado.edad % 2 != 0) {
            totalExtranjerosEdadImpar++
        }
    }
    val promedioEdad = totalEdad.toDouble() / empleados.size
    println("Total general a pagar en sueldos: $totalSueldos Bs.")
    println("Total de venezolanos por tipo de empleado: $totalVenezolanos")
    println("Total de Extranjeros cuya edad es impar: $totalExtranjerosEdadImpar")
    println("Promedio de edad de todos los empleados: $promedioEdad")
}
data class Empleado(val nombre: String, val nacionalidad: String, val edad: Int, val tipoEmpleado: Int, val horasTrabajadas: Int)