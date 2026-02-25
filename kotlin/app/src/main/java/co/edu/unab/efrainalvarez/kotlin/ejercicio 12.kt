package co.edu.unab.efrainalvarez.kotlin

fun main() {
    fun contarCaracteres(texto: String, criterio: (Char) -> Boolean): Int {
        return texto.count(criterio)
    }

    val totalLetras = contarCaracteres("Ocaña es Ocaña, el resto es loma") { it.isLetter() }
    val totalVocales = contarCaracteres("Ocaña es Ocaña, el resto es loma") { it in "aeiouAEIOU" }
    val totalConsonantes = contarCaracteres("Ocaña es Ocaña, el resto es loma") { it.isLetter() && it !in "aeiouAEIOU" }

    println("Total de letras: $totalLetras") // 9
    println("Total de vocales: $totalVocales") // 4
    println("Total de consonantes: $totalConsonantes") // 5
}
