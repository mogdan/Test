import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int bombX = 2;
        int X0 = 7;
        System.out.println("Bomb X : "+bombX);
        System.out.println("X0 : "+X0);
        int L = 10;
        ArrayList<Integer> listeX = new ArrayList<>();
        for (int i = 0; i < L; i++) {
            listeX.add(i);
        }
        System.out.println(listeX);
/*        System.out.println(listeX.get(0));
        System.out.println(listeX.get(1));
        System.out.println(listeX.get(2));
        System.out.println(listeX.get(3));
        System.out.println(listeX.get(4));
        System.out.println(listeX.get(5));
        System.out.println(listeX.get(6));
        System.out.println(listeX.get(7));*/

        String dirX = (X0 != bombX) ? (X0 < bombX) ? "R" : "L" : "";
        System.out.println(dirX);

        while (X0!=bombX) {

            if (dirX.equals("R")) {
                for (int i = X0; i >= 0; i--) {
                    listeX.remove(i);
                }
                System.out.println("Après indication R, suppression :" + listeX);
                L = listeX.size();
                X0 = X0 + listeX.get(L / 2);
                System.out.println("After Move (R): " + X0);
            }


            if (dirX.equals("L")) {
                for (int i = L - 1; i >= X0; i--) {
                    listeX.remove(i);
                }
                System.out.println("Après indication L, suppression :" + listeX);
                L = listeX.size()+1;
                X0 = X0 - listeX.get(L / 2);
                System.out.println("After Move (L): " + X0);
            }
        }


    }
}
