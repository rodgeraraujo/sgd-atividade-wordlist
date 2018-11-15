package oldCode.wordlist.Control.interfaces;

import java.util.LinkedList;
import java.util.List;

public interface GenerateWordlistInterface {

    LinkedList<List<String>> generateWordlist(List<String> keys, List<String> setA, List<String> setB);

}
