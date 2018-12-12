package com.darkguardsman;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 12/12/18.
 */
public class Grid {
    public final int sizeX;
    public final int sizeY;

    private final int[] data;

    public Grid(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        data = new int[sizeX * sizeY];
    }

    public int getIndex(int x, int y) {
        return y * sizeY + x;
    }

    public boolean inGrid(int x, int y) {
        if (x < 0 || y < 0 || x >= data.length || y >= data.length) {
            return false;
        }
        int index = getIndex(x, y);
        return index >= 0 && index < data.length;
    }

    public void checkInGrid(int x, int y) {
        if (!inGrid(x, y)) {
            throw new RuntimeException("P[" + x + "," + y + "] is outside grid area: " + sizeX + "x" + sizeY);
        }
    }

    public void set(int x, int y, int value) {
        checkInGrid(x, y);
        data[getIndex(x, y)] = value;
    }

    public int get(int x, int y) {
        checkInGrid(x, y);
        return data[getIndex(x, y)];
    }

}
