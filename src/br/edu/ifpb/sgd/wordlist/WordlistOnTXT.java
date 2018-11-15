package br.edu.ifpb.sgd.wordlist;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WordlistOnTXT {

    FileWriter writer = new FileWriter("output.txt");

    public WordlistOnTXT() throws IOException {}


    public void ListToTXT(List<String> result) {
        try {
            for(String str: result) {
                    this.writer.write(str + "\n");
        }
            this.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printOnScreen(List<String> result) {
        result.forEach(System.out::println);
    }
}
