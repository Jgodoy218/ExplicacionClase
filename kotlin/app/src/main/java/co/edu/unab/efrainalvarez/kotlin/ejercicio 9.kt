package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val filtrarPares: (List<Int>) -> List<Int> = { lista ->
        lista.filter { it % 2 == 0 }
    }


    val lista = listOf(6, 7, 5, 30, 57, 2, 87, 8, 10)


    println(filtrarPares(lista))
}
