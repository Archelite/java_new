package com.github.archelite.java_new.iteration3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader implements Reader {

    private StringBuilder builder = null;
    private Scanner scanner = null;

    public FileReader(String fileName) throws IOException {
        scanner = new Scanner(new File(fileName));
        builder = new StringBuilder();
    }

    public String fetchData() {
        while (scanner.hasNext()) {
            builder.append(scanner.next());
        }
        return builder.toString();
    }

}
