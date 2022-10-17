package deneme.file_Read_and_Write;

import java.io.*;

public class ReadFile_Test {
    public static void main(String[] args) throws Exception {
/*
        File myfile = new File("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming_AA\\src\\testFileRead.txt");
        Scanner scanner = new Scanner(myfile);

        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();

 */
        FileReader myFile = new FileReader("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming_AA\\src\\testFileRead.txt");
        BufferedReader reader = new BufferedReader(myFile);

        System.out.println(reader.readLine());
        System.out.println(reader.readLine());


    }
}
