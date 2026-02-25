package co.edu.unab.efrainalvarez.kotlin

fun main() {
    fun saludarUsuario(nombre: String, saludo: (String) -> String): String {
        return saludo(nombre)
    }

    val saludoFormal = saludarUsuario("Francho") { "Bienvenido, $it." }
    val saludoCasual = saludarUsuario("Francho") { "¡Hola, $it!" }

    println(saludoFormal)
    println(saludoCasual) // "¡Hola, Fabián!"
}
