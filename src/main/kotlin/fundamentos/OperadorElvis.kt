package fundamentos

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor padrão" //caso seja nulo atribui o valor padrao,
                                                        // caso contrario recebe o valor atrubuido

    print(obrigatorio)
}