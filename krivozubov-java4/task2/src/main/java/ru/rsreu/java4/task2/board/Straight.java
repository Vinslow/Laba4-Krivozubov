package ru.rsreu.java4.task2.board;

import java.util.Objects;

public class Straight {

    private Point one;
    private Point two;

    public Straight(Point one, Point two) {
        this.one = one;
        this.two = two;
    }

    public Point getOne() {
        return one;
    }

    public Point getTwo() {
        return two;
    }


    public boolean affiliation(Point point) {
        double temp = (one.getY() - two.getY()) * point.getX() + (two.getX() - one.getX()) * point.getY() + (one.getX() * two.getY() - two.getX() * one.getY());
        if (temp == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        int x = (one.getY() - two.getY());
        int y = (two.getX() - one.getX());
        int c = (one.getX() * two.getY() - two.getX() * one.getY());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(x + "x");
        stringBuffer.append((y > 0 ? "+" + y : y) + "y");
        stringBuffer.append(c > 0 ? "+" + c : c);
        stringBuffer.append(" = 0");
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Straight straight = (Straight) o;
        return Objects.equals(one, straight.one) &&
                Objects.equals(two, straight.two);
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two);
    }
}
