package com.github.archelite.java_new.iteration2;

import java.io.IOException;

public class DataReaderClient {

    private Reader reader = null;
    private String fileName = "myfile.txt";

    public DataReaderClient() throws IOException {
        reader = new FileReader(fileName);
    }

    private String fetchData() {
        return reader.read();
    }

    public static void main(String[] args) throws IOException {
        DataReaderClient dataReader = new DataReaderClient();
        System.out.println("Got data: " + dataReader.fetchData());
    }
}
