fun main() {

    // Função para contar de 1 a 100
    fun contarNumeros (): String{

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
}




//13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares
//14 -) Dada uma lista de preços, calcule o total da compra
//15 -) Dada uma lista de idades, calcule a média dos maiores de idade
//16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 =
//120)
//Exercícios
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