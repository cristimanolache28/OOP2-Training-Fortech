package com.java_pre_employment;

import com.exceptions.InvalidParameterException;
import com.exceptions.OutOfBoundsException;

public class Main {

    public static void main(String[] args) throws InvalidParameterException, OutOfBoundsException {

        MovablePoint point = new MovablePoint(300, 400, 220, 45);
        System.out.println(point.toString());

        // Test methods: moveUp, moveRight, moveDown and moveLeft
        System.out.println("\ngetY(): " + point.getY());
        point.moveUp();
        System.out.println("moveUp(): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        point.moveRight();
        System.out.println("moveRight():" + point.getX());

        System.out.println("\ngetY(): " + point.getY());
        point.moveDown();
        System.out.println("moveDown(): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        point.moveLeft();
        System.out.println("moveLeft():" + point.getX());

        System.out.println("\ngetY(): " + point.getY());
        point.moveUp(100);
        System.out.println("moveUp(howMuch): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        point.moveRight(200);
        System.out.println("moveRight(howMuch):" + point.getX());

        System.out.println("\ngetY(): " + point.getY());
        point.moveDown(100);
        System.out.println("moveDown(howMuch): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        point.moveLeft(300);
        System.out.println("moveLeft(howMuch):" + point.getX());

        // ------------------- Movable Circle ---------------------
        MovableCircle circle = new MovableCircle(point, 50);

        System.out.println("-------------MOVABLE CIRCLE--------------");
        System.out.println("\ngetY(): " + point.getY());
        circle.moveUp();
        System.out.println("moveUp(): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        circle.moveRight();
        System.out.println("moveRight():" + point.getX());

        System.out.println("\ngetY(): " + point.getY());
        circle.moveDown();
        System.out.println("moveDown(): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        circle.moveLeft();
        System.out.println("moveLeft():" + point.getX());

        // Test methods(howMach): moveUp, moveRight, moveDown and moveLeft
        System.out.println("\ngetY(): " + point.getY());
        circle.moveUp(10);
        System.out.println("moveUp(howMuch): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        circle.moveRight(200);
        System.out.println("moveRight(howMuch):" + point.getX());

        System.out.println("\ngetY(): " + point.getY());
        circle.moveDown(100);
        System.out.println("moveDown(howMuch): " + point.getY());

        System.out.println("\ngetX(): " + point.getX());
        circle.moveLeft(300);
        System.out.println("moveLeft(howMuch):" + point.getX());

        System.out.println(circle.toString());
    }
}
