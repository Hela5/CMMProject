package com.cmmwordwrapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMMWordWrapper {

    public static void main(String[] args){

    }

    public static List<String> textLines = new ArrayList<>();

    //function to read in the text
    public void loadTextIn()throws FileNotFoundException{
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("InputText")));
        String currentLine;

        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            textLines.add(currentLine);
        }
        scanner.close();
    }

    //function to create output with new formatting
    public void createOutputText() throws IOException {
        File file = new File("OutputText");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for(String newLine : textLines){
            writer.write(newLine.replaceAll(".{80}(?=\\s+)","$0\r\n"));
            writer.newLine();
        }
        writer.close();

    }
}
