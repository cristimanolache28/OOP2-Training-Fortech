package com.java_pre_employment;

import com.exceptions.InvalidParameterException;
import com.exceptions.OutOfBoundsException;
import com.interfaces.MovableInterface;

public class MovablePoint implements MovableInterface {
    // instance variables
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    // default constructor
    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }

    // constructor with parameters
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws InvalidParameterException {
        if ((x <= PLAIN_X_MAX && x >= PLAIN_X_MIN) && (y <= PLAIN_Y_MAX && y >= PLAIN_Y_MIN) && (xSpeed > 0) && (ySpeed > 0) ) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        } else {
            throw  new InvalidParameterException("Invalid parameter.");
        }
    }

    // y -> up/down
    // x -> right/left
    @Override
    public void moveUp() throws OutOfBoundsException, InvalidParameterException {
        if (y + ySpeed > PLAIN_Y_MAX) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        setY(y + ySpeed);
    }

    @Override
    public void moveDown() throws OutOfBoundsException, InvalidParameterException {
        if (y - ySpeed < PLAIN_Y_MIN) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        setY(y - ySpeed);
    }

    @Override
    public void moveLeft() throws OutOfBoundsException, InvalidParameterException {
        if (x - xSpeed < PLAIN_X_MIN){
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        setX(x - xSpeed);
    }

    @Override
    public void moveRight() throws OutOfBoundsException, InvalidParameterException {
        if (x + xSpeed > PLAIN_X_MAX) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        setX(xSpeed + x);
    }

    @Override
    public void moveUp(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (y + howMuch <= PLAIN_Y_MAX) {
                setY(y + howMuch);
            } else {
                throw new OutOfBoundsException("The pointer is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveDown(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (y - howMuch >= PLAIN_Y_MIN) {
                setY(y - howMuch);
            } else {
                throw new OutOfBoundsException("The pointer is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveRight(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (x + howMuch <= PLAIN_X_MAX) {
                setX(x + howMuch);
            } else {
                throw new OutOfBoundsException("The pointer is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveLeft(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (x - howMuch >= PLAIN_Y_MIN) {
                setX(x - howMuch);
            } else {
                throw new OutOfBoundsException("The pointer is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws InvalidParameterException {
        if (x <= PLAIN_X_MAX && x >= PLAIN_X_MIN) {
            this.x = x;
        } else {
            throw new InvalidParameterException("X is out of bounds.");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws InvalidParameterException {
        if (y <= PLAIN_Y_MAX && y >= PLAIN_Y_MIN) {
            this.y = y;
        } else {
            throw new InvalidParameterException("X is out of bounds.");
        }
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) throws InvalidParameterException {
        if (xSpeed > 0) {
            this.xSpeed = xSpeed;
        } else {
            throw new InvalidParameterException("xSpeed must be a positive number.");
        }
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) throws InvalidParameterException {
        if (ySpeed > 0) {
            this.ySpeed = ySpeed;
        } else {
            throw new InvalidParameterException("ySpeed must be a positive number.");
        }
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "\n\t\tx=" + x +
                ",\n\t\ty=" + y +
                ",\n\t\txSpeed=" + xSpeed +
                ",\n\t\tySpeed=" + ySpeed +
                '}';
    }
}
