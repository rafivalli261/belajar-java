package coba_file;

public class WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("src/coba_file/scores1.txt");
        if (file.exists()) {
            System.out.println("File already exist!");
            System.exit(0);
        }

        try (
                // create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            // write formatted output to the file
            output.print("Yoimiya ");
            output.println(90);
            output.print("Arataki Itto");
            output.println(80);
        }
    }
}
