package br.com.digitalhouse.aula04

fun main() {
    println("Olá Kotlin!")
    println(meuNome("Michelle",  " Soto"))
}


fun meuNome(nome: String, sobrenome: String) : String {
    return nome + sobrenome
}
