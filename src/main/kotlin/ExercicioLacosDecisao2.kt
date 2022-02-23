fun main() {
    var numMaior = 0.0
    var numMedio = 0.0
    var numMenor = 0.0

    println("Vamos verificar 3 números diferentes e organizá-los em ordem. ")
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("\nDigite o segundo número: ")
    val num2 = readLine()!!.toDouble()

    print("\nDigite o terceiro número: ")
    val num3 = readLine()!!.toDouble()

    if(num1>num2 && num1>num3 && num2>num3){
        numMaior = num1
        numMedio = num2
        numMenor = num3

    }else if(num1<num2 && num1>num3){
        numMaior = num2
        numMedio = num1
        numMenor = num3

    }else if(num1<num2 && num1<num3 && num2>num3){
        numMaior = num2
        numMedio = num3
        numMenor = num1

    }else if(num1<num2 && num1<num3 && num3>num2){
        numMaior = num3
        numMedio = num2
        numMenor = num1

    }else if(num1>num2 && num1<num3){
        numMaior = num3
        numMedio = num1
        numMenor = num2

    }else if(num1>num2 && num1>num3 && num2<num3){
        numMaior = num1
        numMedio = num3
        numMenor = num2

    }
    print("\n$numMenor < $numMedio < $numMaior")
}