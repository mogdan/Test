import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int H = 10; //Height
        int W = 10; //Wide
        int bombY = 3; // BombY
        int bombX = 5; // BombX
        int Y0 = 0;// Batman Y
        int X0 = 0;// Batman Y
        int Hmax = 0;//H min SearchZone
        int Hmin = H - 1;//H max SearchZone
        int Wmax = 0;//W min SearchZone
        int Wmin = W - 1;//W max SearchZone
        int c = 0; //counter

        System.out.println("Bomb : " + bombX + "," + bombY);
        System.out.println("Batman : " + X0 + "," + Y0);

        while ((Y0 != bombY) && (X0 != bombX)) {
            System.out.println("********************compteur : " + c++);
            int Y = Y0;
            int X = X0;
            String dirY = (Y0 != bombY) ? (Y0 < bombY) ? "U" : "D" : "";
            String dirX = (X0 != bombX) ? (X0 < bombY) ? "R" : "L" : "";
            System.out.println(dirY + dirX);
            String dirYX = dirY + dirX;
            ArrayList<String> direction = new ArrayList<>(Arrays.asList(dirYX.split("")));
            for (String d : direction) {
                if (dirY.equals("U")) {
                    if (Hmin - Y0 > 2) {
                        Y0 = Y0 + (Hmin - Y0) / 2;
                    } else {
                        Y0++;
                    }
                    Hmin = Y0;

                }
                if (dirY.equals("D")) {
                    if (Y0 - Hmax > 2) {
                        Y0 = Y0 - (Y0 - Hmax) / 2;
                    } else {
                        Y0--;
                    }
                    Hmax = Y0;
                }
                if (dirY.equals("R")) {
                    if (Wmin - X0 > 2) {
                        X0 = X0 + (Wmin - X0) / 2;
                    } else {
                        X0++;
                    }
                    Wmax = X0;

                }
                if (dirY.equals("L")) {
                    if (X0 - Wmax > 2) {
                        X0 = X0 - (X0 - Wmax) / 2;
                    } else {
                        X0--;
                    }
                    Wmin = X0;
                }

            }

            System.out.println("Bomb : " + bombX + "," + bombY);
            System.out.println("Batman move from " + X + "," + Y + " to " + X0 + "," + Y0);
        }


    }
}
