package co.edu.unab.efrainalvarez.kotlin

fun main() {
    fun validarEntrada(entrada: String, validacion: (String) -> Boolean): Boolean {
        return validacion(entrada)
    }

    fun procesarEntrada(entrada: String, procesamiento: (String) -> String): String {
        return procesamiento(entrada)
    }

    val entrada = "Francho"
    val esValida = validarEntrada(entrada) { it.isNotBlank() }

    if (esValida) {
        val resultado = procesarEntrada(entrada) { it.uppercase() }
        println(resultado)
    }
}
