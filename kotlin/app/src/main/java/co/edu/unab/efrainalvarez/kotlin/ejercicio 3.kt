package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val esPositivo: (Int) -> Boolean = { numero ->
        numero > 0
    }

    println(esPositivo(-7))
    println(esPositivo(8))
}
