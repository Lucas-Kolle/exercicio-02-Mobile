package model

open class Funcionario {
    var nome: String = ""
    var salario: Double = 0.0

    open fun mostrarSalario () {
        println("Nome: $nome\nSalário atual: R$$salario")
    }
}