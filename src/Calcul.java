import java.util.ArrayList;

public class Calcul {

    public static void main(String[] args) {
        int result = 0;
        boolean error;

        //JDD
        int maxSpeed = 90, lightCount = 7;
        int d1 = 1234, du1 = 5;
        int d2 = 2468, du2 = 5;
        int d3 = 3702, du3 = 5;
        int d4 = 6170, du4 = 5;
        int d5 = 8638, du5 = 5;
        int d6 = 13574, du6 = 5;
        int d7 = 16042, du7 = 5;

        ArrayList<Integer> lightDistances = new ArrayList<>();
        ArrayList<Integer> lightDurations = new ArrayList<>();

        //JDD distances integration
        lightDistances.add(d1);
        lightDistances.add(d2);
        lightDistances.add(d3);
        lightDistances.add(d4);
        lightDistances.add(d5);
        lightDistances.add(d6);
        lightDistances.add(d7);

        System.out.println(lightDistances);

        //JDD durations integration
        lightDurations.add(du1);
        lightDurations.add(du2);
        lightDurations.add(du3);
        lightDurations.add(du4);
        lightDurations.add(du5);
        lightDurations.add(du6);
        lightDurations.add(du7);

        System.out.println(lightDurations);

        //Main loop
        System.out.println("*************** Start the loop *************");

        boolean win = false;
        while (win != true) for (int i = maxSpeed; i >= 0; i--) {
            error = false;
            while (win != true) {
                while (!error) {
                    for (int c = 0; c < lightCount; c++) {
                        System.out.println("*********************** Start iteration for i : "+i);
                        System.out.println("Lightcount : " + c);
                        if ((lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)) % 2 == 0) {
                            System.out.println("Passage feu 1 : OK");
                            System.out.println("c: " + c + " - temps: " + (lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)) + " - période: " + lightDurations.get(c));
                            if (c == lightCount - 1) {
                                System.out.println("Bonne vitesse : " + i);
                                win = true;
                            }
                        } else {
                            System.out.println("Passage feu 1 : KO");
                            System.out.println((lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)));
                            System.out.println("c: " + c + " - temps: " + (lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)) + " - période: " + lightDurations.get(c));
                            error = true;

                        }
                    }

                }
            }
        }
    }
}
