fun main() {
    val nombre = "Adam Slander"
    val horaNormal = 160
    val pagoHoraNormal = 20000
    val horasExtras = 10
    val porcAumeHorasExtras = 0.25
    val paroForzoso = 0.05
    val politHabitacional = 0.02
    val cajaAhorro = 0.07
    val actAcademica = 25000
    val hijos = 2
    val asigPorHijo = 17300
    val primaHogar = 18000
    val sueldoBase = (horaNormal * pagoHoraNormal) + (horasExtras * pagoHoraNormal * (1 + porcAumeHorasExtras))
    val asignaciones = actAcademica + (hijos * asigPorHijo) + primaHogar
    val deducciones = sueldoBase * (paroForzoso + politHabitacional + cajaAhorro)
    val sueldoNeto = sueldoBase - deducciones + asignaciones
    println("Nombre del trabajador: $nombre")
    println("Asignaciones:")
    println("Actualización académica: (${actAcademica}) ")
    println("Asignación por hijo (${hijos} hijos): ${hijos * asigPorHijo} ")
    println("Prima por hogar: $primaHogar ")
    println("Total asignaciones: $asignaciones ")
    println("Deducciones:")
    println("Paro forzoso (${paroForzoso * 100}%): ${sueldoBase * paroForzoso} ")
    println("Política habitacional (${politHabitacional * 100}%): ${sueldoBase * politHabitacional} ")
    println("Caja de ahorro (${cajaAhorro * 100}%): ${sueldoBase * cajaAhorro} ")
    println("Total deducciones: $deducciones ")
    println("Sueldo neto: $sueldoNeto ")
}