package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val sumarLista: (List<Int>) -> Int = { lista ->
        lista.sum()
    }

    val lista = listOf(3, 6, 1, 2, 0)


    println(sumarLista(lista))
}
