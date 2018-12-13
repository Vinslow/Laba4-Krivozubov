package ru.rsreu.java4.task1.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderFile implements Reader {

    private String text;
    private String path;

    public ReaderFile(String path) {
        this.path = path;
    }

    public String getText() {
        return text;
    }

    public void read() {
        try (FileReader reader = new FileReader(this.path)) {
            char[] buf = new char[256];
            text = "";
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                text += String.copyValueOf(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
