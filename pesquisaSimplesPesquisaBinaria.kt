/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    
    val nomes = listOf("Ana", "Antonio", "Cris",
                       "Damares", "Jackie", "José",
                       "Lia", "Natalia", "Rosana")
    
    
    // Na pesquisa simples, o nome seria "achado" 
    // depois de quantas etapas de comparação?
    
    
    // Na pesquisa binária, depois de quantas etapas?

    // Procure o nome Rosana na lista.
    val resultadoPesquisaSimples = pesquisaSimples(nomes, "Rosana")
    println("Pesquisa simples: $resultadoPesquisaSimples")
    
    var resultadoPesquisaBinaria = pesquisaBinaria(nomes, "Rosana")
    println("Pesquisa binária: $resultadoPesquisaBinaria")

}




fun pesquisaSimples(lista: List<String>, nome: String): String{
    for((index, item) in lista.withIndex()){
        if(item == nome){
            return "Achei o nome $nome após ${index+1} iterações"
        } 
    }
    return "Não foi dessa vez"
}

fun pesquisaBinaria(lista: List<String>, nome: String): String{
    var inicio = 0
    var fim = lista.size - 1
    var iteracoes = 0
    
    while (inicio <= fim){
        val meio = (inicio +fim)/2
        val elementoMeio = lista[meio]
        
        if(elementoMeio == nome){
            return "Achei o nome $nome após ${iteracoes+1} iterações"
        } else if (elementoMeio < nome){
            inicio = meio + 1
        } else {
            fim = meio - 1
        }
        iteracoes++
    }
    return "Não foi dessa vez"
}