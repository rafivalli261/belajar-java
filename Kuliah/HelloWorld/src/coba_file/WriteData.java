package coba_file;

public class WriteData {

    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("src/coba_file/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("Kaedehara Kazuha   ");
        output.println(90);
        output.print("Kamisato Ayaka   ");
        output.println(94);

        // Close the file
        output.close();
    }
}
