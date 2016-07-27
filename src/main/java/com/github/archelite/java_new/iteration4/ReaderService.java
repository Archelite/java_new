package com.github.archelite.java_new.iteration4;

public class ReaderService {
    private Reader reader = null;

    public ReaderService(Reader reader) {
        this.reader = reader;
    }

    public String fetchData() {
        return reader.read();
    }

}
