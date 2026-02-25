package co.edu.unab.efrainalvarez.kotlin

fun main() {
    val calcularArea: (Int, Int) -> Int = { ancho, alto ->
        ancho * alto
    }


    println(calcularArea(7, 10))
}
