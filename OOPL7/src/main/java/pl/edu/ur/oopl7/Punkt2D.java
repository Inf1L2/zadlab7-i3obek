package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt2D {
    protected int x,y,z;

    //public Punkt2D() {
    //}

    public Punkt2D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D(){
        //x = 0;
        //y = 0;
        //z = 0;
    }

    public Punkt2D losuj(){
        Random random = new Random();
        x = random.nextInt(21)-10;
        y = random.nextInt(21)-10;
        return new Punkt2D(x,y);
    }

    @Override
    public String toString() {
        return "Punkt2D\t" +
                "X= " + x +
                "\tY= " + y +
                '\t';
    }

}