package oldCode.wordlist.View;

import oldCode.wordlist.Control.impl.GenerateKey;
import oldCode.wordlist.Control.impl.GenerateWordlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Loader {

    public static void main(String[] args) {
        GenerateKey newKey = new GenerateKey();
        GenerateWordlist newWordlist = new GenerateWordlist();

        //System.out.println(newKey.perm("A", 5, "B", 2));// -> [AAAAABB, AAAABAB, AAAABBA,..,BABAAAA, BBAAAAA]
        //System.out.println(newKey.perm("A", 5, "B", 2).size());// -> 21


        //chaves
        List<String> keys = newKey.perm('A', 5, 'B', 2);

        //resultado
        LinkedList<List<String>> resultWordlist = new LinkedList<List<String>>();

        //conjuto A
        List<String> setA = new ArrayList<>(
                Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7")
        );

        // conjunto B
        List<String> setB = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d", "e")
        );

        resultWordlist = newWordlist.generateWordlist(keys,setA, setB);

        for (int i = 0; i < 100; i++) {
            resultWordlist.get(i);
        }
    }



//    public static void main(String[] args)
//    {
//        String[] A = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
//        String[] B = new String[]{"a", "b", "c", "e", "e"};
//
//        String str = "BBAAAAA";
//
//        int n = str.length();
//        br.edu.ifpb.sgd.wordlist.Loader permutation = new br.edu.ifpb.sgd.wordlist.Loader();
//        permutation.permute(str, 0, n-1);
//    }
//
//
//    private void permute(String str, int l, int r)
//    {
//        if (l == r)
//            System.out.println(str);
//        else
//        {
//            for (int i = l; i <= r; i++)
//            {
//                str = swap(str,l,i);
//                permute(str, l+1, r);
//                str = swap(str,l,i);
//            }
//        }
//    }
//
//
//    public String swap(String a, int i, int j)
//    {
//        char temp;
//        char[] charArray = a.toCharArray();
//        temp = charArray[i] ;
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//    }

}
