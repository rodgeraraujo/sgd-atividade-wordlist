package oldCode;

public class WordList {
    public static void main(String[] args) {

        String[] A = new String[]{"1","2","3"};
        String[] B = new String[]{"a","b","c"};

        String[] AB = new String[9];
        String[] BA = new String[9];

        String[] S = new String[18];

        int abIndex = 0, baIndex = 0;
        for (int aIndex = 0; aIndex < 3; aIndex++){
            for (int bIndex = 0; bIndex < 3; bIndex++){
                AB[abIndex++] = A[aIndex] + B[bIndex];
                BA[baIndex++] = B[bIndex] + A[aIndex];
            }
        }

        for (int sIndex = 0; sIndex<9;sIndex++){
            S[sIndex*2] = AB[sIndex];
            S[sIndex*2+1] = BA[sIndex];
        }

        for (String s : S){
            System.out.print("{");
            System.out.print(s);
            System.out.print("}");
        }
    }
}
