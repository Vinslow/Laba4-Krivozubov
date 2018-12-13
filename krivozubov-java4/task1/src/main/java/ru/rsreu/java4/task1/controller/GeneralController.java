package ru.rsreu.java4.task1.controller;

import ru.rsreu.java4.task1.clean.Cleaner;
import ru.rsreu.java4.task1.presentation.Presentation;
import ru.rsreu.java4.task1.sort.SortCode;

public class GeneralController implements Controller {

    private Presentation presentation;
    private SortCode sortCode;
    private Cleaner cleaner;

    public GeneralController(Presentation presentation, SortCode sortCode, Cleaner cleaner) {
        this.presentation = presentation;
        this.sortCode = sortCode;
        this.cleaner = cleaner;
    }

    @Override
    public void run() {
        sortCode.sort();
        System.out.println("Сортировка по коду: ");
        presentation.show();
        cleaner.clean();
        System.out.println("\nСортировка по коду (c удалением): ");
        presentation.show();
    }
}
