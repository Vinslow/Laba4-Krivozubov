package ru.rsreu.java4.task2.controller;

import ru.rsreu.java4.task2.board.Core;
import ru.rsreu.java4.task2.presentation.Presentation;

public class GeneralController implements Controller {

    private Core core;
    private Presentation presentation;

    public GeneralController(Core core, Presentation presentation) {
        this.core = core;
        this.presentation = presentation;
    }

    @Override
    public void run() {
        core.work();
        presentation.show();
    }
}
