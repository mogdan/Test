import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int H = 9999; //Height
        int W = 9999; //Wide
        int bombY = 4001; // BombY
        int bombX = 9765; // BombX
        int Y0 = 77;// Batman Y
        int X0 = 54;// Batman Y
        int Hmax = H-1;//H min SearchZone
        int Hmin = 0;//H max SearchZone
        int Wmax = W-1 ;//W min SearchZone
        int Wmin = 0;//W max SearchZone
        int c = 0; //counter

        System.out.println("Bomb : " + bombX + "," + bombY);
        System.out.println("Batman : " + X0 + "," + Y0);

        while (c<14) {
            System.out.println("********************compteur : " + c++);
            int Y = Y0;
            int X = X0;
            String dirY = (Y0 != bombY) ? (Y0 < bombY) ? "D" : "U" : "";
            String dirX = (X0 != bombX) ? (X0 < bombX) ? "R" : "L" : "";
            System.out.println(dirY + dirX);
            String dirYX = dirY + dirX;
            ArrayList<String> direction = new ArrayList<>(Arrays.asList(dirYX.split("")));
            for (String d : direction) {
                if (d.equals("U")) {
                    if (Y0-Hmin > 2) {
                        Y0 = Y0 - 1 -(Y0-Hmin) / 2;
                    } else {
                        Y0--;
                    }
                    Hmax = Y0;
                    System.out.println("Move up to "+Y0);

                }
                if (d.equals("D")) {
                    if (Hmax-Y0 > 2) {
                        Y0 = Y0 + 1+(Hmax-Y0) / 2;
                    } else {
                        Y0++;
                    }
                    Hmin = Y0;
                    System.out.println("Move down to "+Y0);
                }
                if (d.equals("R")) {
                    if (Wmax - X0 > 2) {
                        X0 = X0 + 1+(Wmax - X0) / 2;
                    } else {
                        X0++;
                    }
                    Wmax = X0;
                    System.out.println("Move right to "+X0);

                }
                if (d.equals("L")) {
                    if (X0 - Wmin > 2) {
                        X0 = X0 - 1-(X0 - Wmin) / 2;
                    } else {
                        X0--;
                    }
                    Wmin = X0;
                    System.out.println("Move left to "+X0);
                }

            }

            System.out.println("Bomb : " + bombX + "," + bombY);
            System.out.println("Batman move from " + X + "," + Y + " to " + X0 + "," + Y0);
        }


    }
}
