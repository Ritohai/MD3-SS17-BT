package bt2;

import java.io.*;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) throws IOException {

        System.out.print("Source file : ");
        String sourcePath = new Scanner(System.in).nextLine();
        System.out.print("Target file: ");
        String targetPath = new Scanner(System.in).nextLine();
        // tạo file
        File file = new File("source.txt");
        File file2 = new File("target.txt");
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        }
        try {
            copyFileUsingStream(file, file2);
            System.out.println("Copy thành công");
        } catch (IOException ioe) {
            System.out.println("Copy thất bại ");
            System.out.println(ioe.getMessage());
        }

    }
    private static void copyFileUsingStream(File source, File target) throws IOException {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            int copyByte = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                copyByte += length;
            }
            System.out.println(copyByte+" bytes");
        } finally {
            is.close();
            os.close();
        }
    }

}
