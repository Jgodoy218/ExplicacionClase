package co.edu.unab.efrainalvarez.kotlin

fun main() {

    val encontrarMaximo: (List<Int>) -> Int = { lista ->
        lista.maxOrNull() ?: Int.MIN_VALUE
    }


    val lista = listOf(10, 20, 5, 30)

    println(encontrarMaximo(lista))
}
