fun main(){
    print("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    when(idade){
        in 0..9 -> println("Não é possível competir")
        in 10..14 -> println("Categoria infantil")
        in 15..17 -> println("Categoria juvenil")
        in 18..25 -> println("Categoria adulta")
        in 25..199 -> println("Acima da idade de competição")
        else -> println("Valor inválido")


    }

}