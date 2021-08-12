package fundamentos

fun main() {

    var a: Int? = null
    println(a?.inc())

    println("Momento do Erro")
    println(a!!.inc()) // erro de null pointer pois a esta nulo 
}