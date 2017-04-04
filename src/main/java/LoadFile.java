package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadFile {
private static String FILE_NAME="src/main/resource/test.txt";

    public static  void  main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file =new File(FILE_NAME);
        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    String []stringArray=s.replaceAll("[.,/;:\\p{Punct}-]","").toLowerCase().split("[\\s]");
                    for (String aStringArray : stringArray) {
                        sb.append(aStringArray);
                        sb.append("\n");
                    }
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb.toString());
    }
}
