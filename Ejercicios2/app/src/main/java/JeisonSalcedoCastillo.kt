class JeisonSalcedoCastillo {
}

//<Jeison Salcedo> - <Jeison-Salcedo-Castillo>.kt
fun main() {
    // Ejercicio 1- suma de  numeros
    val sumarLista: (List<Int>) -> Int = { lista ->
        var sumatoria = 0
        for (num in lista) {
            sumatoria = sumatoria + num
        }
        sumatoria
    }
    val lista = listOf(5, 7, 8, 3, 4)
    println(sumarLista(lista)) // resultado 27

//Ejercicio 2- Resta de numeros
    val restaLista: (List<Int>) -> Int = { lista ->
        var resta = lista[0]
        for (i in 1 until lista.size) {
            resta = resta - lista[i]
        }
        resta
    }

    val listaa = listOf(3, 5, 6, 7)
    println(restaLista(lista))  // Resultado: -15 //

// Ejercicio 3 - Multiplicar números
    val multiplicarLista: (List<Int>) -> Int = { lista ->
        var producto = 1
        for (num in lista) {
            producto = producto * num
        }
        producto
    }
    val lista3 = listOf(2, 3, 4)
    println(multiplicarLista(lista3))  // Resultado: 24 }

// Ejercicio 4 - Dividir los numeros
    val dividirLista: (List<Int>) -> Double = { lista ->
        var resultado = lista[0].toDouble()
        for (num in lista.drop(1)) {
            resultado = resultado / num
        }
        resultado
    }
    val lista4 = listOf(100, 2, 5)
    println(dividirLista(lista4))  // Resultado: 10.0

// Ejercicio 5 - Encontrar el número máximo
    val maximo: (List<Int>) -> Int = { lista ->
        var maxNum = lista[0]
        for (num in lista) {
            if (num > maxNum) {
                maxNum = num
            }
        }
        maxNum
    }
    val lista5 = listOf(12, 45, 105, 67, 24)
    println(maximo(lista5))  // Resultado: 67

    // Ejercicio 6 - numeros pares
    val filtrarPares: (List<Int>) -> List<Int> = { lista ->
        val pares = mutableListOf<Int>()
        for (num in lista) {
            if (num % 2 == 0) {
                pares.add(num)
            }
        }
        pares
    }
    val lista6 = listOf(5, 7, 8, 3, 4)
    println(filtrarPares(lista6))  // Resultado: [8, 4]

    // Ejercicio 7 - Encontrar el menor número
    val minimo: (List<Int>) -> Int = { lista ->
        var minNum = lista[0]
        for (num in lista) {
            if (num < minNum) {
                minNum = num
            }
        }
        minNum
    }
    val lista7 = listOf(5, 1, 3, 9, 2)
    println(minimo(lista7))  // Resultado: 1

    // Ejercicio 8 - Contar números negativos
    val contarNegativos: (List<Int>) -> Int = { lista ->
        var contador = 0
        for (num in lista) {
            if (num < 0) {
                contador++
            }
        }
        contador
    }
    val lista8 = listOf(-1, 2, -3, 4, -5)
    println(contarNegativos(lista8))  // Resultado: 3

// Ejercicio 9 - Sumar  números impares
    val sumarImpares: (List<Int>) -> Int = { lista ->
        var suma = 0
        for (num in lista) {
            if (num % 2 != 0) {
                suma =suma +num
            }
        }
        suma
    }
    val lista9 = listOf(1, 2, 3, 4, 5)
    println(sumarImpares(lista9))  // Resultado: 9

// Ejercicio 10 - Concatenar una lista
    val concatenarCadenas: (List<String>) -> String = { lista ->
        var resultado = ""
        for (cadena in lista) {
            resultado = resultado + cadena
        }
        resultado
    }
    val lista10 = listOf("soy", " ", "spiderman","!")
    println(concatenarCadenas(lista10))  // Soy Spiderman!

    // Ejercicio 11 - numeros divisibles por 5
    val DivisiblesPor5: (List<Int>) -> Int = { lista ->
        var contador = 0
        for (num in lista) {
            if (num % 5 == 0) {
                contador++
            }
        }
        contador
    }
    val lista11 = listOf(5, 10, 12, 15, 18)
    println(DivisiblesPor5(lista11))  // Resultado: 4

// Ejercicio 13 - Convertir una lista de números en sus cuadrados (Lambda)
    val cuadrados: (List<Int>) -> List<Int> = { lista ->
        val resultado = mutableListOf<Int>()
        for (num in lista) {
            resultado.add(num * num)
        }
        resultado
    }
    val lista12 = listOf(1, 16,8,10)
    println(cuadrados(lista12))  // Resultado: (1,256,64,100) // }

// Ejercicio 14 - Verificar numeros positivos
    val todosPositivos: (List<Int>) -> Boolean = todosPositivos@{ lista ->
        for (num in lista) {
            if (num <= 0) {
                return@todosPositivos false
            }
        }
        true
    }


    val lista13 = listOf(1, 2, 3, 4)
    println(todosPositivos(lista13))  // Resultado: true

// Ejercicio 15 - Verificar existe negativo
    val existeNegativo: (List<Int>) -> Boolean = existeNegativo@{ lista ->
        for (num in lista) {
            if (num < 0) {
                return@existeNegativo true
            }
        }
        false
    }
    val lista14 = listOf(1, 2, 3, -4)
    println(existeNegativo(lista14))  // Resultado: true

}