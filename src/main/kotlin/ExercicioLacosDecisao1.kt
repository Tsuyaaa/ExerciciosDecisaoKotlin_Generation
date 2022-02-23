fun main(){
    var num: Int = 0
    var numMaior = 0

    for(i in 1..3 step 1){
        print("Digite o $i º número: ")
        num = readLine()!!.toInt()

        if(num>numMaior){
            numMaior = num

        }else{
            num = num
        }

    }
    print("\nO maior número inserido é: $numMaior")

}