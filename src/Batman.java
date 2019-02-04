import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Batman {

    public static void main(String[] args) {

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(10 - 0 + 1) + 0;

        int W = 10; // width of the building.
        int H = 10; // height of the building.
        int N = 6; // maximum number of turns before game over.
        int X0 = rand.nextInt(10 - 0 + 1) + 0; // initial X position of Batman
        int Y0 = rand.nextInt(10 - 0 + 1) + 0;// initial Y position of Batman
        int X = rand.nextInt(10 - 0 + 1) + 0; // X position of the bomb
        int Y = rand.nextInt(10 - 0 + 1) + 0; // Y position of the bomb
        int searchX = W-1; // X of the searchZone
        int searchY = H-1; // Y of the searchZOne

        System.out.println("Bomb initial position ("+X+","+Y+")");
        System.out.println("Batman initial position ("+X0+","+Y0+")");


        while (!((X0==X)&&(Y0==Y))){
            String dirY = (Y0!=Y)?(Y0 < Y)? "D" : "U" :"";
            String dirX = (X0!=X)?(X0<X)? "R" : "L":"";
            String bombDir = dirY + dirX;
            System.out.println(bombDir);
            int a = 0;
            ArrayList<String> direction = new ArrayList<>(Arrays.asList(bombDir.split("")));
                for (String c : direction) {
                    if (c.equals("U")) {
                        a = Y0;
                        Y0 = Y0 - (Y0-H)/2;
                        H=a;
                    }
                    if (c.equals("D")) {
                        a = Y0;
                        Y0 = Y0 + (H-Y0)/2;
                        H=a;
                    }
                    if (c.equals("R")) {
                        a = X0;
                        X0 = X0 + (X-X0)/2;
                        X = a;
                    }
                    if (c.equals("L")) {
                        a = X0;
                        X0 = X0 + (X0-X)/2;
                        X = a;
                    }
            }
            System.out.println("Batman after movement ("+X0+","+Y0+")");
        }
        System.out.println("Bomb defused. Batman position ("+X0+","+Y0+")");


    }

}
