package main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        readLineFromFile("");

    }

    public static String readLineFromFile(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {
            return reader.readLine();
        } catch (FileNotFoundException e) {
            if (!isFileNameValid(fileName)) {
                throw new InvalidClassException("File name " + fileName + " is not valid");
            }
                throw e;
            }
    }

    public static boolean isFileNameValid(String fileName) {
        // checking file name
        return false;
    }

}
