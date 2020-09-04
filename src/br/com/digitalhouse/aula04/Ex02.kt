package br.com.digitalhouse.aula04

fun main(){
    println(cadeiasDeTexto( txt1 = "Digital", txt2 = "House" ))

}
fun cadeiasDeTexto(txt1 : String, txt2: String) : Boolean{
    return if(txt1 != txt2) {
        false
    }else{
        true
    }
}