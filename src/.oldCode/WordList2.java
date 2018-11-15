package oldCode;

public class WordList2 {
    public static void main(String[] args) {
        //conjuntos
        String[] A = new String[]{"1","2","3"};
        String[] B = new String[]{"a","b","c"};
        //senha
        String[] AAB = new String[18];
        String[] ABA = new String[18];
        String[] BAA = new String[18];
        //resultado
        String[] S = new String[54];
        //
        //[A0,A1,B]
        int aabIndex = 0, abaIndex = 0, baaIndex=0;
        for (int a0Index = 0; a0Index < 3; a0Index++){
            for (int a1Index = 0; a1Index < 3; a1Index++) {
                //saltar quando A0 == A1
                if (a0Index == a1Index) continue;
                //percorrer b
                for(int bIndex = 0; bIndex < 3; bIndex++){
                    AAB[aabIndex++] = A[a0Index] + A[a1Index] + B[bIndex];
                    ABA[abaIndex++] = A[a0Index] + B[bIndex] + A[a1Index];
                    BAA[baaIndex++] = B[bIndex] + A[a0Index] + A[a1Index];
                }
            }
        }
        //não copiar aqui (só para mim)
        int tIndex = 0;
        for (String s : AAB){
            System.out.print("{");
            System.out.print(s);
            System.out.print("},");
            if (++tIndex % 6 == 0) System.out.println();
        }
        System.out.println("-----------------------------------");
        tIndex = 0;
        for (String s : ABA){
            System.out.print("{");
            System.out.print(s);
            System.out.print("},");
            if (++tIndex % 6 == 0) System.out.println();
        }
        System.out.println("-----------------------------------");
        tIndex = 0;
        for (String s : BAA){
            System.out.print("{");
            System.out.print(s);
            System.out.print("},");
            if (++tIndex % 6 == 0) System.out.println();
        }
        //imprimir todas as palavras
        for (int sIndex=0; sIndex<18; sIndex++){
            S[sIndex*3] =   AAB[sIndex];
            S[sIndex*3+1] = ABA[sIndex];
            S[sIndex*3+2] = BAA[sIndex];
        }
        for (String s : S){
            System.out.print("{");
            System.out.print(s);
            System.out.print("},");
        }
    }
}
