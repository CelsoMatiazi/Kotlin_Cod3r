package fundamentos


// sem retorno
fun imprimirSoma(a: Int, b: Int){
    println(a + b)
}

//com retorno
fun somaComRetorno(a: Int, b: Int = 1): Int{
    return a + b
}

fun main() {
    imprimirSoma(4,5)
    println(somaComRetorno(3,533))
}