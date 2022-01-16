package com.java_pre_employment;

import com.exceptions.InvalidParameterException;
import com.exceptions.OutOfBoundsException;
import com.interfaces.MovableInterface;

public class MovableCircle implements MovableInterface {
    MovablePoint center;
    private int radius;

    public MovableCircle(MovablePoint center, int radius) throws InvalidParameterException {
        this.center = center;
        if((center.getX() + radius <= PLAIN_X_MAX) && (center.getX() - radius >= PLAIN_X_MIN) &&
                (center.getY() + radius <= PLAIN_Y_MAX) && (center.getY() - radius >= PLAIN_Y_MIN)) {
            this.radius = radius;
        } else {
            throw new InvalidParameterException("The radius value is invalid.");
        }
    }

    @Override
    public void moveUp() throws OutOfBoundsException, InvalidParameterException {
        if (center.getY() + center.getySpeed() + radius > PLAIN_Y_MAX) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        center.setY(center.getY() + center.getySpeed() + radius);
    }

    @Override
    public void moveDown() throws OutOfBoundsException, InvalidParameterException {
        if (center.getY() - center.getySpeed() - radius < PLAIN_Y_MIN) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        center.setY(center.getY() - center.getySpeed() - radius);
    }

    @Override
    public void moveLeft() throws OutOfBoundsException, InvalidParameterException {
        if (center.getX() - center.getxSpeed() - radius < PLAIN_X_MIN) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        center.setX(center.getX() - center.getxSpeed() - radius);
    }

    @Override
    public void moveRight() throws OutOfBoundsException, InvalidParameterException {
        if (center.getX() + center.getxSpeed() + radius > PLAIN_X_MAX) {
            throw new OutOfBoundsException("The point is out of bounds.");
        }
        center.setX(center.getX() + center.getxSpeed() + radius);
    }

    @Override
    public void moveUp(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (center.getY() + howMuch <= PLAIN_Y_MAX) {
                center.setY(center.getY() + howMuch);
            } else {
                throw new OutOfBoundsException("The circle is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveDown(int howMuch) throws OutOfBoundsException, InvalidParameterException {
        if (howMuch > 0) {
            if (center.getY() - howMuch >= PLAIN_Y_MIN) {
                center.setY(center.getY() - howMuch);
            } else {
                throw new OutOfBoundsException("The circle is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveLeft(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (center.getX() - howMuch >= PLAIN_X_MIN) {
                center.setX(center.getX() - howMuch);
            } else {
                throw new OutOfBoundsException("The circle is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    @Override
    public void moveRight(int howMuch) throws InvalidParameterException, OutOfBoundsException {
        if (howMuch > 0) {
            if (center.getX() + howMuch <= PLAIN_Y_MAX) {
                center.setX(center.getX() + howMuch);
            } else {
                throw new OutOfBoundsException("The circle is out of bounds.");
            }
        } else {
            throw new InvalidParameterException("The parameter must be a positive number.");
        }
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws InvalidParameterException {
        if (radius > 0) {
            if ((center.getX() + radius <= PLAIN_X_MAX) && (center.getX() - radius >= PLAIN_X_MIN) &&
                    (center.getY() + radius <= PLAIN_Y_MAX) && (center.getY() - radius >= PLAIN_Y_MIN)) {
                this.radius = radius;
            } else {

            }
        } else {
            throw new InvalidParameterException("Radius must be a positive number.");
        }
    }

    @Override
    public String toString() {
        return "\nMovableCircle{" +
                "\n\tcenter = " + center.toString() +
                ",\nradius=" + radius +
                '}';
    }
}
