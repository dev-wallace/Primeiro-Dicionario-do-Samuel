public class Inseririr {
    static void inserirPalavra(String[] dicionario, String palavra, int tamanho) {

          // Método para inserir a palavra no dicionário de forma ordenada

        int posicao = tamanho;

        // Encontrar a posição correta para a nova palavra
        while (posicao > 0 && dicionario[posicao - 1].compareTo(palavra) > 0) {
            dicionario[posicao] = dicionario[posicao - 1];  // Move as palavras uma posição para a direita
            posicao--;
        }

        dicionario[posicao] = palavra;  // Insere a nova palavra na posição correta
    }

}
