package pl.edu.ur.oopl7;

public class TEST {

    public static void main(String[] args) {
        Punkt2D pkt2 = new Punkt2D();
        Punkt3D pkt3 = new Punkt3D();
        Punkt2D[] array2D = new Punkt2D[1000];
        Punkt3D[] array3D = new Punkt3D[1000];

        int j = 1;
        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = pkt2.losuj();//new Punkt2D();
            //System.out.println(i+1 + " " +array2D[i]);
        }

        for (int i = 0; i < array3D.length; i++) {
            array3D[i] = pkt3.losuj();//new Punkt3D();
            //System.out.println(i+1 + " " + array3D[i]);
        }

        for (int i = 0; i < 1000; i++) {
            if ((array2D[i].x == array3D[i].x) && (array2D[i].y == array3D[i].y)){
                System.out.println(j + " 2D: " + array2D[i] + " 3D: " +array3D[i]);
                j++;
            }
        }
    }
}
