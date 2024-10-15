public class Pesquisa {
    static boolean existePalavra(String[] dicionario, String palavra, int tamanho) {
           // método para verificar se a palavra já existe no dicionário usando busca binária
        int esquerda = 0;
        int direita = tamanho - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            int comparacao = dicionario[meio].compareTo(palavra);
            if (comparacao == 0) {
                return true;  // Palavra já existe
            } else if (comparacao < 0) {
                esquerda = meio + 1;  // Busca na metade direita
            } else {
                direita = meio - 1;  // Busca na metade esquerda
            }
        }
        return false;  
    }

}
