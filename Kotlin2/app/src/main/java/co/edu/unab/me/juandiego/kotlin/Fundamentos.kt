package co.edu.unab.me.juandiego.kotlin

import kotlin.random.Random


fun main(){
    println("************** VARIABLES Y TIPOS DE DATOS ***************")

    val name : String = "Juan Diego";
    val age = 25;
    val height = 1.85
    val isLogin = Random.nextBoolean()
    println(name)
    println(name)

    var message = "Soy" + name

    println(message)

    if(age<18){
        message += ", soy menor de edad."
    }else if (age < 50){
        message += ", spu Adulto."
    }else{
        message += ", soy mayor."
    }

    when{
        height < 1.8 -> {
            message += "Persona Bajita"
        }
        height < 2.0 -> {
            message += "Persona Alta"
        }
        else -> {
            message += "Persona gigante"
        }
    }

    message += "${if (isLogin) "Esta logueado." else "no esta logueado" }, Verificado..."

    println(message)

    println("******** Funciones *********")
    printlnInformation("Juan Diego", age=25)
    printlnInformation("Nio65165", age=12)
    printlnInformation("Solano", age=9)

    println("********* LISTA Y MAPAS ***********")
    val listNamesProduct = listOf("teclas","Mouse","PC",546, true, 435.9)
    val listPricesProducts= mutableListOf(25325, 252, 582, 257)
    println(listNamesProduct)

    val teclado = mutableMapOf(
        "name" to "teclado",
        "price" to 20500,
        "modelo" to 2025
    )

    val pc = mutableMapOf(
        "name" to "computador",
        "Price" to 2300,
        "modelo" to 2026
    )
    val list = listOf(teclado, pc)

    for (product in list){
        println(product)
    }
}

fun printlnInformation( myName : String, age : Int ) : Unit {
    println("información del ${myName}, tiene ${age } años.")
}

fun sumar(num1: Int, num2 : Int) : Int{

}