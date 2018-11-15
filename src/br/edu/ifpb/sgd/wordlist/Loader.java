package br.edu.ifpb.sgd.wordlist;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Loader {

    public static void main(String[] args) throws IOException {

        GenerateWordlist generate = new GenerateWordlist();
        WordlistOnTXT wordlist = new WordlistOnTXT();


        //lista de elementos A
        List<String> listA = Arrays.asList("0","1", "2", "3", "4", "5","6","7");

        //lista de elementos B
        List<String> listB = Arrays.asList("a", "b", "c");

        List<String> result = generate.perm2(listA, 5, listB, 2);

        //imprime no console todos os resultados da permutaçao
        //wordlist.printOnScreen(result);

        //salva a lista com os resultados no arquito output.txt
        wordlist.ListToTXT(result);

        //imprime a quantidade de combinaaçoes
        System.out.println("Number os combinations = " + result.size());
    }
}