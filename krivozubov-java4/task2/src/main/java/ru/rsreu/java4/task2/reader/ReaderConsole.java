package ru.rsreu.java4.task2.reader;

import ru.rsreu.java4.task2.board.Point;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReaderConsole implements Reader {

    private Set<Point> pointSet;

    public ReaderConsole() {
        pointSet = new HashSet<>();
    }

    @Override
    public void read() {
        System.out.print("Vvedite colichestvo tochek: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Vvedite x: ");
            int x = in.nextInt();
            System.out.print("Vvedite y: ");
            int y = in.nextInt();
            pointSet.add(new Point(x, y));
        }
    }

    public Set<Point> getPointSet() {
        return pointSet;
    }
}
