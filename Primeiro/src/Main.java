/*
Entrega a Atividade 2 - Algoritmos e Programação II

Nós,

Wallace Araujo da Silva
Renan Lallo de Moura Cavalcante
André Luis Lima de Oliveira

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.

------Sites usados para suporte------

https://codegym.cc/pt/groups/posts/pt.394.pesquisa-binaria-em-java-colecoes-recursivas-iterativas-e-java

https://www.devmedia.com.br/implementando-uma-busca-binaria-normal-e-recursiva/2792

https://www.youtube.com/watch?v=ShsMgfuIack

*/

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Chama o método organizaTexto da classe OrganizaTexto com o caminho completo do arquivo
            OrganizaTexto.organizaTexto("Primeiro/Primeiro/src/TextoDoSamuel.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      
        
    }
}
