package br.com.digitalhouse.aula04


fun main(){
    println(primeiroPositivoImpar())

    for (num: Int in primeiroPositivoImpar()){
        println(num)
    }


}
fun primeiroPositivoImpar(): ArrayList<Int>{
    val num: ArrayList<Int> = arrayListOf<Int>()
    for(i in 0..100){
        if(i>0 && i%2 != 0){
            num.add(i)
        }
    }
    return num
}