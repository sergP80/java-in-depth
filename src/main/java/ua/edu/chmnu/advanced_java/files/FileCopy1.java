package ua.edu.chmnu.advanced_java.files;

import java.io.*;

public class FileCopy1 {

    public static void main(String[] args) {

        try (
                InputStream inputStream = new BufferedInputStream(new FileInputStream("./test.txt"));
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("./test-copy.txt"));
        ) {

            byte[] buffer = new byte[1024];

            int read;

            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, read);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
