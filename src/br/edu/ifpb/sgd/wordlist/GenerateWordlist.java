package br.edu.ifpb.sgd.wordlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class GenerateWordlist {





    public List<String> perm2(List<String> listA, int numA, List<String> listB, int numB) {

        //Verifica se os valores de quantidade dos conjuntos sao iguais a zero
        if (numA == 0 && numB == 0) return Collections.singletonList("");

        //Se maiores que 0, adiciona as duas listas na lista forSelect
        List<String> forSelect = new ArrayList<>();
        if (numA > 0) forSelect.addAll(listA);
        if (numB > 0) forSelect.addAll(listB);

        //Lista contendo o resultado da permutaçao
        List<String> result = new ArrayList<>();

        //Seleciona cada lista de forma recursiva, verificando se o elemento ja foi add a lista principal
        for (String elem : forSelect) {
            List<String> newListA = noDuplicates(listA, elem);
            int newNumA = numA - (listA.contains(elem) ? 1 : 0);
            List<String> newListB = noDuplicates(listB, elem);
            int newNumB = numB - (listB.contains(elem) ? 1 : 0);

            //adiciona todos os elemetos ao array de resultado final
            result.addAll(
                    //permuta todos os valores criando duas novas listas com os elementos de A e B
                    perm2(newListA, newNumA, newListB, newNumB)
                            .stream()
                            .map(s -> elem + s)
                            .collect(toList())
            );
        }
        return result;
    }


    private static List<String> noDuplicates(List<String> list, String elem) {
        return list.stream().filter(e -> e != elem).collect(toList());
    }
}
