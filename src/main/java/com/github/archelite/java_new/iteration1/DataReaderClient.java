package com.github.archelite.java_new.iteration1;

import java.io.IOException;

public class DataReaderClient {

    private FileReader fileReader = null;
    private String fileName = "myfile.txt";

    public DataReaderClient() throws IOException {
        fileReader = new FileReader(fileName);
    }

    private String fetchData() {
        return fileReader.read();
    }

    public static void main(String[] args) throws IOException {
        DataReaderClient dataReader = new DataReaderClient();
        System.out.println("Got data: " + dataReader.fetchData());
    }
}
