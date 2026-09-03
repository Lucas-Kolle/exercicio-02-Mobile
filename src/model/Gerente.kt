package model

class Gerente: Funcionario() {

    override fun mostrarSalario() {
        println("Nome: ${nome}\nSalario atual: R$${salario +  (salario * 20 / 100)}")
    }
}