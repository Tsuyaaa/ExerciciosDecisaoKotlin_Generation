fun main(){
    print("Digite um número de 1 a 12: ")
    val mes = readLine()!!.toInt()

    when(mes){
        1 -> println("O mês correspondente é Janeiro")
        2 -> println("O mês correspondente é Fevereiro")
        3 -> println("O mês correspondente é Março")
        4 -> println("O mês correspondente é Abril")
        5 -> println("O mês correspondente é Maio")
        6 -> println("O mês correspondente é Junho")
        7 -> println("O mês correspondente é Julho")
        8 -> println("O mês correspondente é Agosto")
        9 -> println("O mês correspondente é Setembro")
        10 -> println("O mês correspondente é Outubro")
        11 -> println("O mês correspondente é Novembro")
        12 -> println("O mês correspondente é Dezembro")
        else -> println("Número inválido.")
    }

}