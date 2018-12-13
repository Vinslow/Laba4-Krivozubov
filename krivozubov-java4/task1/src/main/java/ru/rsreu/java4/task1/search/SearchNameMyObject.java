package ru.rsreu.java4.task1.search;

import ru.rsreu.java4.task1.essence.MyObject;
import ru.rsreu.java4.task1.reader.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchNameMyObject implements Searcher {

    private Reader readerFile;
    private String textFile;
    private List<MyObject> listObjects;

    public SearchNameMyObject(Reader readerFile) {
        this.readerFile = readerFile;
        listObjects = new ArrayList<>();
    }

    public void init() {
        readerFile.read();
    }

    public void search() {
        init();
        textFile = readerFile.getText();
        Pattern p = Pattern.compile("[\\w]+");
        Matcher m = p.matcher(textFile);
        while (m.find()) {
            String temp = m.group();
            listObjects.add(new MyObject(temp, -100 + (int) (Math.random() * ((100 + 100) + 1))));
        }
    }

    @Override
    public List<MyObject> getSearch() {
        return listObjects;
    }
}
