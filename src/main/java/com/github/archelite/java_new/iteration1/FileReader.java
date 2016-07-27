package com.github.archelite.java_new.iteration1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    private StringBuilder builder = null;
    private Scanner scanner = null;

    public FileReader(String fileName) throws IOException {
        scanner = new Scanner(new File(fileName));
        builder = new StringBuilder();
    }

    public String read() {
        while (scanner.hasNext()) {
            builder.append(scanner.next());
        }
        return builder.toString();
    }

}
