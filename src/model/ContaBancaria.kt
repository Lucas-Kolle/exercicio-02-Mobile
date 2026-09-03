package model

class ContaBancaria {

    var nomeTitular : String = ""
    private var saldo : Double = 0.0

    fun depositarValor (valor: Double) {
        saldo += valor
        println("Valor do deposito R$$valor")
    }

    fun sacarValor (valor: Double) {
        saldo -= valor
        println("Valor do saque: R$$valor")
    }

    fun consultarSaldo(){
        println("Nome: $nomeTitular\nSaldo atual: R$$saldo")
    }
}