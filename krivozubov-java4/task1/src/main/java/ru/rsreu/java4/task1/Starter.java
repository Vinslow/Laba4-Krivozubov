package ru.rsreu.java4.task1;

import ru.rsreu.java4.task1.clean.Cleaner;
import ru.rsreu.java4.task1.clean.GeeneralCleaner;
import ru.rsreu.java4.task1.controller.Controller;
import ru.rsreu.java4.task1.controller.GeneralController;
import ru.rsreu.java4.task1.essence.ListMyObject;
import ru.rsreu.java4.task1.essence.ListService;
import ru.rsreu.java4.task1.presentation.GeneralPresentation;
import ru.rsreu.java4.task1.presentation.Presentation;
import ru.rsreu.java4.task1.reader.Reader;
import ru.rsreu.java4.task1.reader.ReaderFile;
import ru.rsreu.java4.task1.search.SearchNameMyObject;
import ru.rsreu.java4.task1.search.Searcher;
import ru.rsreu.java4.task1.sort.SortCode;

public class Starter {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.run();
    }

    public void run() {
        Reader readerFile = new ReaderFile("/Users/upagge/IdeaProjects/Epam/java4/task1/src/main/resources/text/object_text.txt");
        Searcher searchNameObject = new SearchNameMyObject(readerFile);
        ListService listMyObject = new ListMyObject(searchNameObject);
        SortCode sortCode = new SortCode(listMyObject);
        Presentation presentation = new GeneralPresentation(listMyObject);
        Cleaner cleaner = new GeeneralCleaner(listMyObject);
        Controller controller = new GeneralController(presentation, sortCode, cleaner);
        controller.run();
    }

}
