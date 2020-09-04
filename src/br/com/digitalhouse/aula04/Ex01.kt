package br.com.digitalhouse.aula04

fun main(){
    val maiorNum = arrayListOf<Int>()
    maiorNum.add(10)
    maiorNum.add(9)
    maiorNum.add(8)
    println(maiorDeTres(maiorNum))


}
fun maiorDeTres(num: ArrayList<Int>): Int {
    var maiorNumero = num[0]
    for(numero in num) {
        if(numero > maiorNumero){
            maiorNumero = numero
        }
    }
    return maiorNumero
}