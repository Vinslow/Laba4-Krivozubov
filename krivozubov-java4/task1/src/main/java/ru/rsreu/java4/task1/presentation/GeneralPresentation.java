package ru.rsreu.java4.task1.presentation;

import ru.rsreu.java4.task1.essence.ListService;
import ru.rsreu.java4.task1.essence.MyObject;

public class GeneralPresentation implements Presentation {

    private ListService listService;

    public GeneralPresentation(ListService listService) {
        this.listService = listService;
    }

    @Override
    public void show() {
        for (MyObject myObject : listService.getMyObjectList()) {
            System.out.println(myObject.toString());
        }
    }
}
