import model.ContaBancaria
import model.Funcionario
import model.Gerente
import model.Pessoa

fun main() {

    // Função para contar de 1 a 100
    fun contarNumeros () : String{

        for (i in 1 .. 100){

            if (i % 3 == 0 && i % 5 == 0){
                println("BatataQuente")
            } else if (i % 5 == 0){
                println("Quente")
            } else if (i % 3 == 0){
                println("Batata")
            } else {
                print("")
            }
        }

        return "Contagem Finalizada!"
    }

    println(contarNumeros())

    // Função para separar os ímpares
    fun separarImpares (numeros : MutableList<Int>) : List<Int>{

        val impares = numeros.filter { it % 2 != 0 } // Faz um filtro dentro do array / lista (se o resto da divisão for 0 ele continua na lista)

        return impares
    }

    println( separarImpares((1 .. 50).toMutableList()))

    // Função para somar os preços
    fun somarPrecos (precos : MutableList<Double>) : String{

        val precoFinal = precos.reduce { acumulador, numero -> acumulador + numero }


        return "O valor a ser cobrado é de R$${precoFinal}"
    }

    val valores = mutableListOf<Double>(55.5, 44.2, 300.0, 100.50)

    println(somarPrecos(valores))

    // Função para calcular a média da idade considerando apenas os maiores de 18 anos
    fun calcularMediaMaiorIdade (idades : MutableList<Int>) : String {

        val maioresIdade = idades.filter { it >= 18 }

        val mediaFinal = (maioresIdade.reduce { acumulador, numero -> acumulador + numero }) / maioresIdade.size

        return "A média das idades maiores do que 18 é $mediaFinal"
    }

    val idadesTeste = mutableListOf<Int>(2, 18, 33,10, 44, 15, 8, 66)

    println(calcularMediaMaiorIdade(idadesTeste))

    // Função para calcular o fatorial de um número
    fun calcularFatorial (numero : Int) : String{

        val resultado = (1 .. numero).reduce { acumulador, numero -> acumulador * numero }

        return "O fatorial de $numero! é $resultado"
    }

    println(calcularFatorial(5))

    // Importando o objeto pessoa
    val pessoa = Pessoa()

    pessoa.nome = "Lucas"
    pessoa.idade = 18
    pessoa.cidade = "Itapevi - SP"

    pessoa.info()

    var produtos = mutableMapOf(
        "mouse" to 37,
        "lousa" to 22,
        "banana" to 5,
        "computador" to 5_000,
        "carro" to 40_000
    )

    val maiorProduto = produtos.maxBy { it.value }

    println("Produto: ${maiorProduto.key}")
    println("Valor: ${maiorProduto.value}")

    // Importando o objeto contaBancaria
    val contaBancaria = ContaBancaria()

    contaBancaria.nomeTitular = "Lucas Dias Brandão Kolle"
    contaBancaria.consultarSaldo()
    contaBancaria.depositarValor(30_000.0)
    contaBancaria.consultarSaldo()
    contaBancaria.sacarValor(15_000.0)
    contaBancaria.consultarSaldo()

    // Importando o objeto funcionario
    val funcionario = Funcionario()
    funcionario.nome = "Lucas Dias Brandão Kolle"
    funcionario.salario = 2500.0
    funcionario.mostrarSalario()

    val gerente = Gerente()
    gerente.nome = "Lucas Gerente"
    gerente.salario = 2500.0
    gerente.mostrarSalario()
}





//20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o
//salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a
//função que retorna o salário, retornando o salário com 20% de comissão (aumento)