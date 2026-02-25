package co.edu.unab.EliasCruz.fundamentos

import kotlin.random.Random

fun main (){
    println("******++ VARIABLES Y TIPOS DE VARIABLES")

    var nombre : String = "Jose Elias";
    println(nombre)
    nombre = "pepito peres"
    println(nombre)

    val age = 26
    val height = 1.86
    val islogin = Random.nextBoolean()
    val flotante = 1.65F

    println("***************CONDICIONALES***************")

    var message = "soy ${nombre}"
    println(message)
    if (age < 18){
        message += ", soy menor de edad "
    }else if (age < 50){
        message += ", soy adulto"

    }else{
        message += ", soy mayor "
    }


    when {
        height < 1.5 ->
            message += ", persona bajita"
        height < 2.0 ->
            message += ", persona alta"
        else->
            message += ", persona gigante"
    }
    message += "${if(islogin)", ya esta logueado" else ", no esta logueado"}, verificado..."
    println(message)


    println("*********************** FUNCIONES *************************")

    printInformation(myAge = age , myName = nombre)
    println(sumarEdades(age1 = 12, age2 = 12))



    println("***************** LISTAS Y MAPAS*************************")
    val productName = listOf("teclado", "mouse", "monitor", false, 2.5)
    val productPrices = mutableListOf(200,5000,820,250)

    val pc = mutableMapOf("name" to "pc", "price" to 2500, "marca" to "DELL")

    val teclado = mutableMapOf("name" to "teclado", "price" to 3500, "marca" to "HP")

    val ListProduct = listOf(pc, teclado)
    print(ListProduct)

    println("***************** BUCLES****************************")
    for (miproduct in ListProduct){

    }

    }
    fun printInformation(myName: String , myAge : Int) : Unit {
        println("informacion de ${myName} y tengo ${myAge} ")
}
fun sumarEdades(age1 : Int, age2 : Int): Int{
    return age1 + age2
}