package com.dvoss;

/**
 * Created by Dan on 7/13/16.
 */
public class Room {
    int row;
    int col;
    boolean isStart = false;
    boolean isEnd = false;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
