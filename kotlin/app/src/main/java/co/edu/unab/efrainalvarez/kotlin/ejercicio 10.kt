package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val contarVocales: (String) -> Int = { cadena ->
        cadena.count { it.toLowerCase() in "aeiouáéíóú" }
    }

    println(contarVocales("En un lugar de la mancha..."))
}
