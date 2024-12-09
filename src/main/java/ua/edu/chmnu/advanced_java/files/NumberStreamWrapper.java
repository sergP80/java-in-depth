package ua.edu.chmnu.advanced_java.files;

import lombok.AllArgsConstructor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@AllArgsConstructor
public class NumberStreamWrapper {

    private final String file;

    public void write(int number) {
        try(
                var os = Files.newOutputStream(Paths.get(file), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
                var dataOs = new DataOutputStream(os)
        ) {
            dataOs.writeInt(number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(IntStream stream) {
        try(
                var os = Files.newOutputStream(Paths.get(file), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
                var dataOs = new DataOutputStream(os)
        ) {
            stream.forEach(i -> {
                try {
                    dataOs.writeInt(i);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void print() {
        try(
                var is = Files.newInputStream(Paths.get(file));
                var dataIs = new DataInputStream(is)
        ) {
            int number;

            try {
                while (true) {
                    number = dataIs.readInt();

                    System.out.println("==> " + number);
                }
            } catch (EOFException e) {
                System.out.println("Complete reading");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        NumberStreamWrapper numberStreamWrapper = new NumberStreamWrapper("numbers.txt");

        numberStreamWrapper.write(IntStream.range(1, 1000));
        numberStreamWrapper.print();
    }
}
