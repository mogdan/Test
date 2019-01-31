import java.util.Scanner;


public class Thor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        System.out.println("Light position (" + lightX + "," + lightY + ")");
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        System.out.println("Thor position (" + initialTX + "," + initialTY + ")");
        String move = ""; //Thor next move

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            System.out.println("Energy : " + remainingTurns);
            if (lightY != initialTY) {
                if (lightY - initialTY > 0) {
                    move += "S";
                    initialTY++;
                } else {
                    move += "N";
                    initialTY--;
                }
            }
            if (lightX != initialTX) {
                if (lightX - initialTX > 0) {
                    move += "E";
                    initialTX++;
                } else {
                    move += "W";
                    initialTX--;
                }
            }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(move);
            move = "";
        }


    }
}
