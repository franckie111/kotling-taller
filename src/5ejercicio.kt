fun main() {
    val calParcial1 = 85
    val calParcial2 = 90
    val calParcial3 = 75
    val calExamenFinal = 80
    val calTrabajoFinal = 95
    val promParciales = (calParcial1 + calParcial2 + calParcial3) / 3.0
    val porcParciales = 0.55
    val porcExamenFinal = 0.30
    val porcTrabajoFinal = 0.15
    val calFinal = (promParciales * porcParciales) +
            (calExamenFinal * porcExamenFinal) +
            (calTrabajoFinal * porcTrabajoFinal)
    println("La calificación final del alumno en la materia de computación es: $calFinal")
}