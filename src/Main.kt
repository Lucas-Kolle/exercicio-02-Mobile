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
}




//17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com
//os dados do objeto por meio de um método: “Maria tem 25 anos e mora em São
//Paulo.”
//18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome
//do produto mais caro
//19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo”
//(privado) e crie funções para depositar um valor, sacar um valor e para consultar o
//saldo
//20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o
//salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a
//função que retorna o salário, retornando o salário com 20% de comissão (aumento)