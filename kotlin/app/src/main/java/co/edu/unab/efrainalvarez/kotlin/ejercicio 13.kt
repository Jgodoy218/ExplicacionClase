package co.edu.unab.efrainalvarez.kotlin

fun main() {
    fun esBotonHabilitado(texto: String, validacion: (String) -> Boolean): Boolean {
        return validacion(texto)
    }

    val habilitado = esBotonHabilitado("Hola") { it.isNotBlank() }
    val deshabilitado = esBotonHabilitado("") { it.isNotBlank() }

    println("¿Botón habilitado?: $habilitado") // true
    println("¿Botón habilitado?: $deshabilitado") // false
}
