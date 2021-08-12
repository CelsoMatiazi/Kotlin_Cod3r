package fundamentos

fun main() {
    // Tipos Numericos Inteiros

    val num1: Byte = 127 // armazena até 1byte ou seja de até 127, 128 causaria um erro
    val num2: Short = 32767 // vamor max de 32767 - 32768 causaria erro pois ultrapassa o limite do short
    val num3: Int = 2_147_483_647 // valor maximo para int, é permitido _ para separar digitos inteiros
    val num4: Long = 9_223_372_036_854_775_807 // valor max para long => Long.MAX_VALUE

    //Tipos NUmericos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipo Caractere
    val char: Char = '?' //aceita apenas 1 character

    //Tipo booleano
    val boolean: Boolean = true //ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)

    // tudo em Kotlin é objeto
    println(10.dec())

}