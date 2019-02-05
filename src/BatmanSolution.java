public class BatmanSolution {
    public static void main(String[] args) {
        int H = 9999; //Height
        int W = 9999; //Wide
        int bombY = 4001; // BombY
        int bombX = 9765; // BombX
        int Y0 = 77;// Batman Y
        int X0 = 54;// Batman Y
        int c = 0; //counter

        int xa = 0, ya = 0, xz = W - 1, yz = H - 1;

        while (c < 14) {
            System.out.println("********************compteur : " + c++);
            String dirY = (Y0 != bombY) ? (Y0 < bombY) ? "D" : "U" : "";
            String dirX = (X0 != bombX) ? (X0 < bombX) ? "R" : "L" : "";
            System.out.println(dirY + dirX);
            String BOMB_DIR = dirY + dirX;

            if (BOMB_DIR.indexOf("R") >= 0) {
                xa = X0 + 1;
            }
            if (BOMB_DIR.indexOf("L") >= 0) {
                xz = X0 - 1;
            }
            if (BOMB_DIR.indexOf("D") >= 0) {
                ya = Y0 + 1;
            }
            if (BOMB_DIR.indexOf("U") >= 0) {
                yz = Y0 - 1;
            }

            X0 = ((xz - xa) / 2) + xa;
            Y0 = ((yz - ya) / 2) + ya;

            System.out.println(X0 + " " + Y0); // the location of the next window Batman should jump to.


        }

    }
}
