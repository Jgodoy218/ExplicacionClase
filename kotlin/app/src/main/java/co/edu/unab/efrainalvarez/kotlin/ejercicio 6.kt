package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val calcularPromedio: (List<Int>) -> Double = { lista ->
        lista.average()
    }


    val lista = listOf(10, 30, 70, 80)

    println(calcularPromedio(lista))
}
