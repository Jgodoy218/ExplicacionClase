package co.edu.unab.efrainalvarez.kotlin

fun main() {

    val invertirCadena: (String) -> String = { cadena ->
        cadena.reversed()
    }

    println(invertirCadena("ocaña"))
}
