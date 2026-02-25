package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val contieneSubcadena: (String, String) -> Boolean = { texto, subcadena ->
        texto.contains(subcadena)
    }

    println(contieneSubcadena("Francho es buen programador", "programador"))
    println(contieneSubcadena("Real Madrid", "Sevilla"))
}
