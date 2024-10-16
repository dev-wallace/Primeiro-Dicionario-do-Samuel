import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrganizaTexto {

    public static void organizaTexto(String caminhoTexto) throws FileNotFoundException {
        File file = new File(caminhoTexto);
        String[] dicionario = new String[1000];  
        int contador = 0;  
     
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {  
            String linha = sc.nextLine();

            // quebrar a linha em palavras e remover palavras vazias
            String[] palavrasLinha = linha.split(" ");
            for (String palavra : palavrasLinha) {
                palavra = palavra.toLowerCase().trim();  // converte para minúsculas e remove espaços

                if (!palavra.isEmpty()) {  // ignora palavras vazias
                    
                 
                    if (!Pesquisa.existePalavra(dicionario, palavra, contador)) {    // se a palavra nao existir insiro a palavra no dicionario
                      
                        Inseririr.inserirPalavra(dicionario, palavra, contador);
                        contador++;  // incrementa o contador após a inserção
                    }
                }
            }
        }
        sc.close();

        // exibir o dicionário
        System.out.println("Dicionário organizado:");
        for (int i = 0; i < contador; i++) {  
            System.out.println(dicionario[i]);
        }
        
                // Exibir total de palavras diferentes
                System.out.println("Total de palavras diferentes no dicionário= " + contador);
    }

 

  

}
