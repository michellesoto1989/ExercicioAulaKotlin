package br.com.digitalhouse.aula04

fun main(){
    println(parImpar(5))

}
fun parImpar(num: Int): Boolean{
    return if(num%2 != 0) {
        false
    } else {
        true
    }
}

