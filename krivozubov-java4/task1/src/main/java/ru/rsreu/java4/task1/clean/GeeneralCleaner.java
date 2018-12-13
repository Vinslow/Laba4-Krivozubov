package ru.rsreu.java4.task1.clean;

import ru.rsreu.java4.task1.essence.ListService;
import ru.rsreu.java4.task1.essence.MyObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GeeneralCleaner implements Cleaner {

    private ListService listMyObject;

    public GeeneralCleaner(ListService listMyObject) {
        this.listMyObject = listMyObject;
    }

    @Override
    public void clean() {
        Set<MyObject> s = new TreeSet<>(new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                if (o1.getName().equals(o2.getName())) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        s.addAll(listMyObject.getMyObjectList());
        listMyObject.getMyObjectList().clear();
        listMyObject.setMyObjectList(new ArrayList<>(s));
    }
}
