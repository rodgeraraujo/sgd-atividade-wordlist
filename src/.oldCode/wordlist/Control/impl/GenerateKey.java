package oldCode.wordlist.Control.impl;

import oldCode.wordlist.Control.interfaces.GenerateKeyInterface;

import java.util.ArrayList;
import java.util.List;

public class GenerateKey implements GenerateKeyInterface {

    private List<String> result = new ArrayList<>();

    //descobrir todas as keys possiveis
    public void permumation(char charA, int numberA, char charB, int numberB, String s, List<String> result) {
        if (numberA < 0 || numberB < 0)
            return;
        else if (numberA == 0 && numberB == 0)
            result.add(s);
        else {
            permumation(charA, numberA - 1, charB, numberB, s + charA, result);
            permumation(charA, numberA, charB, numberB - 1, s + charB, result);
        }

    }

    //
    public List<String> perm(char charA, int numberA, char charB, int numberB) {
        permumation(charA, numberA, charB, numberB, "", result);
        return result;
    }
}
