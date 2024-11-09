

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileZ {

    public static void main(String[] args) throws IOException {
        // Specify the path to the file
        String filePath = "C:\\\\Users\\\\user\\\\OneDrive\\\\Documents\\\\total.txt"; // Change this to your file path

        List<String> lines = new ArrayList<>();

        // Read the file and store lines in a list
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line); // Store each line in the list
            }
        }

        // Print the entire file contents
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println(); // Print a blank line before printing characters

        // Print each character of each line
        for (String line : lines) {
            for (char ch : line.toCharArray()) {
                System.out.println(ch); // Print each character on a new line
            }
            System.out.println(); // Add a blank line for better readability between lines
        }
    }
}






//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileZ {
//
//    public static void main(String[] args) throws IOException {
//        // Specify the path to the file
//        String filePath = "C:\\Users\\user\\OneDrive\\Documents\\total.txt"; // Change this to your file path
//
//        // Use try-with-resources to ensure the file is closed after use
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            // Read the file line by line
//            while ((line = br.readLine()) != null) {
//                System.out.println(line); // Print each line to the console
//
//                // Print each character of the line
//                for (char ch : line.toCharArray()) {
//                    System.out.println(ch); // Print each character on a new line
//                }
//                System.out.println(); // Add a blank line for better readability between lines
//            }
//        }
//    }
//}
