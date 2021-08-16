package fundamentos.controles

fun main() {

    println("========= EXEMPLO 1 =============")
    var opcao: Int = 0

    while(opcao != -1){
        println("Digite um numero")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")
    }

    println("Até a proxima")


    println("========= EXEMPLO 2 =============")

    var contador = 1

    while(contador <= 10){
        println(contador)
        contador++
    }
}