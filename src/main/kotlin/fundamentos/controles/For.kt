package fundamentos.controles

fun main() {

    println("========= EXEMPLO 1 =============")
    for(i in 1..10){
        println(i)
    }

    println("========= EXEMPLO 2 =============")
    for(i in 10 downTo 1){
        println(i)
    }

    println("========= EXEMPLO 3 =============")
    for(i in 0..100 step 5){
        println(i)
    }

    for(i in 100 downTo 0 step 5){
        println(i)
    }


    println("========= EXEMPLO 4 =============")
    val alunos = arrayListOf("Andre", "Carla", "Marcos", "Paulo")
    for((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }



}