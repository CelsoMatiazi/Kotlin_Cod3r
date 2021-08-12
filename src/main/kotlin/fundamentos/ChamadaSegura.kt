package fundamentos

fun main(){
    var a: Int? = null //safe call operator
    println(a?.dec()) // variavel tratada impede o erro de null pointer
}