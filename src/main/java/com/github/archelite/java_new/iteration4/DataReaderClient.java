package com.github.archelite.java_new.iteration4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DataReaderClient {
    private ApplicationContext ctx = null;

    public DataReaderClient() throws IOException {
        ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
    }

    public String getData() {
        ReaderService readerService = (ReaderService) ctx.getBean("readerService");
        return readerService.fetchData();
    }

    public static void main(String[] args) throws IOException {
        DataReaderClient dataReader = new DataReaderClient();
        System.out.println("Got data: " + dataReader.getData());
    }
}
