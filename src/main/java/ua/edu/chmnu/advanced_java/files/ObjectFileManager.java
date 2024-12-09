package ua.edu.chmnu.advanced_java.files;

import lombok.AllArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
public class ObjectFileManager<T> {
    private final String file;

    public void write(T o) {
        try (
                OutputStream os = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(os)
        ) {
            oos.writeObject(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeAll(Collection<T> list) {
        try (
                OutputStream os = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(os)
        ) {
            for (var c : list) {
                oos.writeObject(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public T read() {
        try (
                InputStream is = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(is)
        ) {
            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> readAll() {
        try (
                InputStream is = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(is)
        ) {
            List<T> records = new ArrayList<>();

            T record;

            try {
                while ((record = (T) ois.readObject()) != null) {
                    records.add(record);
                }
            } catch (EOFException e) {
            }

            return records;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
