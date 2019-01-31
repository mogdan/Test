import java.util.ArrayList;
import java.util.Collections;

public class HorseRacing {

    public static void main(String[] args) {
        int N = 3;
        int Horse1 = 10;
        int Horse2 = 8;
        int Horse3 = 9;

        ArrayList<Integer> piList = new ArrayList<>();
        piList.add(Horse1);
        piList.add(Horse2);
        piList.add(Horse3);

        Collections.sort(piList);
        System.out.println(piList);
        ArrayList<Integer> piListDiff = new ArrayList<>();
        int delta = -1;

        for (int i = 0; i<N-1; i++){
            delta = piList.get(i+1)-piList.get(i);
            piListDiff.add(delta);}

        Collections.sort(piListDiff);
        System.out.println(piListDiff);

        System.out.println(piListDiff.get(0));

    }
}
