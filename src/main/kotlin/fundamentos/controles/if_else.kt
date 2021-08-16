package fundamentos.controles

fun main() {

    println("========= EXEMPLO 1 =============")
    val nota = 8.3

    if(nota > 7.0){ // chaver opcionais
        println("Aprovado")
    }else{
        println("Reprovado!!")
    }

    println("========= EXEMPLO 2 =============")

    val num1 = 2
    val num2 = 3

    val maiorValor = if (num1 > num2){
        println("processando....")
        num1 //a ultima sentença é retornada a expressao
    }else{
        println("processando....")
        num2
    }

    val maiorValor2 = if (num1 > num2) num1 else num2 // equivalente ao ternario

    println("O maior valor é $maiorValor")
    println("O maior valor é $maiorValor2")


    println("========= EXEMPLO 3 =============")

    val nota2 = 8.3
    if (nota2 in 9.0..10.0) {
        println("Fantastico")
    }else if(nota2 in 7.0..8.0){
        println("Parabens")
    }else if(nota2 in 4.0..6.0){
        println("Tem como recuperar")
    }else if(nota2 in 0.0..3.0){
        println("Te vejo no proximo semestre")
    }else{
        println("Nota invalida")
    }
}