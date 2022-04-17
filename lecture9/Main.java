package com.lecture9;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //C:\Users\Julia\IdeaProjects\Courses_1\src\com\lecture9\txt.txt

        System.out.println("Please, write the path down");
        Scanner sc = new Scanner(System.in);
        String FilePath = sc.nextLine();

        File fileAddress = new File(FilePath);
        FileReader fileReader = new FileReader(fileAddress);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();

        String valid = "src/com/lecture9/valid";
        FileWriter fileWriter = new FileWriter(valid);
        String errorChecker = "src/com/lecture9/error";
        FileWriter fileWriter1 = new FileWriter(errorChecker);

        Pattern pattern = Pattern.compile("[A-Za-z0-9]*");
        Matcher matcher = pattern.matcher(line);

        try {
            while (line != null) {
                int a = 0;
                if ((line.startsWith("contract") || line.startsWith("docnum"))  && matcher.matches() && line.length() == 15) {
                    fileWriter.write(line + "\n");
                } else if (!(line.startsWith("contract") || line.startsWith("docnum"))) {
                    fileWriter1.write(line + " The beginning of the line is incorrect" + "\n");
                } else if (!matcher.matches()) {
                    fileWriter1.write(line + " Symbols are inappropriate" + "\n");
                } else {
                    fileWriter1.write(line + " Mind the length of the doc" + "\n");
                }
                line = reader.readLine();
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            fileReader.close();
            fileWriter.close();
            fileWriter1.close();
        }

    }
}
