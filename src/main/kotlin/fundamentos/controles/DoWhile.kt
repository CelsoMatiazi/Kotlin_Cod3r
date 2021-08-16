package fundamentos.controles

fun main() {

    var opcao = 0

    do{
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opção $opcao")
    }while(opcao != -1)

    print("Até a proxima")
}