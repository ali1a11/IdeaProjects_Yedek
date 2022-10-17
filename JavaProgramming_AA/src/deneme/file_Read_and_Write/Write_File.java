package deneme.file_Read_and_Write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
    public static void main(String[] args) throws Exception {

        FileWriter file2 = new FileWriter("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming_AA\\src\\testFileRead.txt");
        BufferedWriter writer = new BufferedWriter(file2);

        writer.write("Hi everyone test !!!");
        writer.write("\nHow are you?");
        writer.close();
    }
}
