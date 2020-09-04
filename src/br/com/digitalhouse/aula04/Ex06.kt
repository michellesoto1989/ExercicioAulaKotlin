package br.com.digitalhouse.aula04

fun main(){
    println(numDeUmACemPositivo())
    for(n: Int in numDeUmACemPositivo() ){
        println(n)
    }

}

fun numDeUmACemPositivo() : ArrayList<Int>{
    val num: ArrayList<Int> = arrayListOf()
    for(i in 0..100){
        num.add(i)
    }
    return num
}