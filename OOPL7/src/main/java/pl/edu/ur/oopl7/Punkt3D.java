package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt3D extends Punkt2D {

    public Punkt3D(int x, int y, int z) {
        super(x, y, z);
        //this.z = z;
    }

    public Punkt3D() {
        //x = 0;
        //y = 0;
        //z = 0;
    }

    //public Punkt3D() {
    //}

    /*public Punkt3D losuj(Punkt3D x){
        Random random = new Random();
        x.x = random.nextInt(-10);
        x.y = random.nextInt(-10);
        x.z = random.nextInt(-10);
        return new Punkt3D(x.x,x.y,x.z);
    }*/

    @Override
    public Punkt3D losuj() {
        Random random = new Random();
        x = random.nextInt(21)-10;
        y = random.nextInt(21)-10;
        z = random.nextInt(21)-10;
        return new Punkt3D(x,y,z);
    }

    @Override
    public String toString() {
        return "Punkt3D\t" +
                "X= " + x +
                "\tY= " + y +
                "\tZ= " + z +
                ' ';
    }
}