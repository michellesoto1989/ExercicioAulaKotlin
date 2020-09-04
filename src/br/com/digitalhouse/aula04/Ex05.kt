package br.com.digitalhouse.aula04

fun main(){
    println(analisarNumeros(25,5,20,15))
}
fun analisarNumeros(numA : Int, numB : Int, numC : Int, numD : Int ) : Boolean{
    return if ((numA > numC && numA > numD) || (numB > numC && numB > numD)) {
        true
    } else {
        false
    }
}

