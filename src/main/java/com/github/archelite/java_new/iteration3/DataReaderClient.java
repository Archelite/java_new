package com.github.archelite.java_new.iteration3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DataReaderClient {
    private ApplicationContext ctx = null;
    private Reader reader = null;

    public DataReaderClient() throws IOException {
        ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
    }

    public String getData() {
        reader = (Reader) ctx.getBean("fileReader");
        return reader.fetchData();
    }

    public static void main(String[] args) throws IOException {
        DataReaderClient dataReader = new DataReaderClient();
        System.out.println("Got data: " + dataReader.getData());
    }
}
