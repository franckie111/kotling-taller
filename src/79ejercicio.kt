data class Libro(val codigo: Int, val genero: String, val paginas: Int)
data class Autor(val apellido: String, val libros: List<Libro>)
fun main() {
    val autores = listOf(
        Autor("Garcia", listOf(Libro(1, "romance", 200), Libro(2, "ciencia ficcion", 300))),
        Autor("Lopez", listOf(Libro(3, "accion", 250), Libro(4, "terror", 180), Libro(5, "ciencia ficcion", 350))),
        Autor("Martinez", listOf(Libro(6, "novela", 320), Libro(7, "romance", 280), Libro(8, "ciencia ficcion", 400))),
        Autor("Rodriguez", listOf(Libro(9, "autoayuda", 150), Libro(10, "academico", 400), Libro(11, "ciencia ficcion", 380)))
    )
    println("Por autor:")
    autores.forEach { autor ->
        println("Apellido: ${autor.apellido}")
        var totalPaginas = 0
        var libroConMayorPaginas: Libro? = null
        autor.libros.forEach { libro ->
            totalPaginas += libro.paginas
            if (libroConMayorPaginas == null || libro.paginas > libroConMayorPaginas!!.paginas) {
                libroConMayorPaginas = libro
            }
        }
        println("Total de paginas escritas: $totalPaginas")
        println("Codigo del libro con mayor numero de paginas: ${libroConMayorPaginas?.codigo} (${libroConMayorPaginas?.paginas} paginas)")
        println("------------------------------------------")
    }
    println("En general:")
    val librosCienciaFiccion = autores.flatMap { it.libros }.count { it.genero == "ciencia ficcion" }
    val librosRomance = autores.flatMap { it.libros }.count { it.genero == "romance" }
    val porcentajeCienciaFiccion = (librosCienciaFiccion.toDouble() / autores.flatMap { it.libros }.size) * 100
    println("Porcentaje de libros de ciencia ficcion: ${porcentajeCienciaFiccion}%")
    println("Cantidad de libros de ciencia ficcion: $librosCienciaFiccion")
    println("Cantidad de libros de romance: $librosRomance")
    val autorConMayorCantidadLibros = autores.maxByOrNull { it.libros.size }
    println("Apellido del autor con mayor cantidad de libros escritos: ${autorConMayorCantidadLibros?.apellido}")
    println("Cantidad de libros escritos: ${autorConMayorCantidadLibros?.libros?.size}")
}