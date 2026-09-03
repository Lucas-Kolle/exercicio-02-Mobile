package model

class Pessoa {

    var nome : String = ""

    var idade : Int = 0

    var cidade : String = ""

    fun info () {
        println("$nome tem $idade e mora em $cidade.")
    }

}