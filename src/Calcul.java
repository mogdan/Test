import java.util.ArrayList;

public class Calcul {

    public static void main(String[] args) {
        int result = -1;


        //JDD
        int speed = 200, lightCount = 6;
        int d1 = 1000, du1 = 15;
        int d2 = 3000, du2 = 10;
        int d3 = 4000, du3 = 30;
        int d4 = 5000, du4 = 30;
        int d5 = 6000, du5 = 5;
        int d6 = 7000, du6 = 10;
        //int d7 = 16042, du7 = 5;

        ArrayList<Integer> lightDistances = new ArrayList<>();
        ArrayList<Integer> lightDurations = new ArrayList<>();

        //JDD distances integration
        lightDistances.add(d1);
        lightDistances.add(d2);
        lightDistances.add(d3);
        lightDistances.add(d4);
        lightDistances.add(d5);
        lightDistances.add(d6);
        //lightDistances.add(d7);

        System.out.println(lightDistances);

        //JDD durations integration
        lightDurations.add(du1);
        lightDurations.add(du2);
        lightDurations.add(du3);
        lightDurations.add(du4);
        lightDurations.add(du5);
        lightDurations.add(du6);
        //lightDurations.add(du7);

        System.out.println(lightDurations);

        //Main loop
        System.out.println("*************** Start the loop *************");


        for (int i = speed; i >= 0; i--) {
            System.out.println("*********************** Start iteration for i : " + i);
            double speedperSecond = (double) i/3.6;
            for (int c = 0; c < lightCount; c++) {

                double toLightDuration = (double) lightDistances.get(c)/speedperSecond;
                int period = (int) Math.floor(toLightDuration/lightDurations.get(c));
                double test = Math.round(toLightDuration/lightDurations.get(c));
                if (i==60){
                    System.out.println("Lightcount : " + c);
                    System.out.println("Durée jusqu'au feu : "+toLightDuration);}
                    System.out.println("period : "+period);
                    System.out.println("test : "+test);

                if (period % 2 == 0) {
                    System.out.println("Passage feu " + c + " : OK");


                    if (c == lightCount - 1) {
                        result = i;
                        System.out.println("Bonne vitesse : " + i);
                        System.out.println("Vous avez gagné!");
                        i = -1;
                        break;

                    }
                } else {
                    System.out.println("Passage feu " + c + " : KO");
                    break;

                }
            }
        }

        System.out.println(result);


    }
}