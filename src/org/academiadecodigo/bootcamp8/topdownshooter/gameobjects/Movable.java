package org.academiadecodigo.bootcamp8.topdownshooter.gameobjects;

import org.academiadecodigo.bootcamp8.topdownshooter.field.Direction;

/**
 * Created by codecadet on 24/05/17.
 */
public interface Movable {

    //void play();
    Direction chooseDirection();
    void move(Direction direction, int speed);

}