fun main(){
    println("Vamos verificar seu número e expressar sua raiz quadrada, caso par. " +
            "E sua exponenciação ao quadrado, caso ímpar.")
    print("Digite seu número: ")
    val num = readLine()!!.toInt()

    if(num % 2 == 0){
        var numNovo: Double = num.toDouble()
        var result = Math.sqrt(numNovo)

        print("\nO número $num é par, e sua raíz quadrada é ${"%.2f".format(result)}")

    }else if(num % 2 == 1){
        var numNovo: Double = num.toDouble()
        var result = Math.pow(numNovo, 2.0)

        print("\nO número $num é ímpar, e elevado ao quadrado é $result")

    }

}