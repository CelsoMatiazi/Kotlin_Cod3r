package fundamentos

fun main() {
    val aprovados = listOf("Joao", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[0]}") //template String
    println("O primeiro colocado foi " + aprovados[0]) //concatenando

    val bomHumor = true
    println("Hoje estou ${if (bomHumor) "Feliz" else "Chateado"}.") // template String com Condicional

}