import java.util.ArrayList;

public class Calcul {

    public static void main(String[] args) {
        int result = 0;


        //JDD
        int maxSpeed = 50, lightCount = 1;
        int d1 = 200, du1 = 10;
        //int d2 = 2468, du2 = 5;
        //int d3 = 3702, du3 = 5;
        //int d4 = 6170, du4 = 5;
        //int d5 = 8638, du5 = 5;
        //int d6 = 13574, du6 = 5;
        //int d7 = 16042, du7 = 5;

        ArrayList<Integer> lightDistances = new ArrayList<>();
        ArrayList<Integer> lightDurations = new ArrayList<>();

        //JDD distances integration
        lightDistances.add(d1);
        //lightDistances.add(d2);
        //lightDistances.add(d3);
        //lightDistances.add(d4);
        //lightDistances.add(d5);
        //lightDistances.add(d6);
        //lightDistances.add(d7);

        System.out.println(lightDistances);

        //JDD durations integration
        lightDurations.add(du1);
/*        lightDurations.add(du2);
        lightDurations.add(du3);
        lightDurations.add(du4);
        lightDurations.add(du5);
        lightDurations.add(du6);
        lightDurations.add(du7);*/

        System.out.println(lightDurations);

        //Main loop
        System.out.println("*************** Start the loop *************");


        for (int i = maxSpeed; i >= 0; i--) {
            System.out.println("*********************** Start iteration for i : " + i);
            double speedperSecond = (double) i/3.6;
            for (int c = 0; c < lightCount; c++) {

                if (i==50){
                    double testValue = lightDurations.get(c)*speedperSecond;
                    System.out.println("facteur = "+lightDistances.get(c));
                    System.out.println("quotient = "+testValue);
                    double resultTest = (double) lightDistances.get(c)/testValue;
                    System.out.println("ratio : "+resultTest);
                    System.out.println(Math.round(resultTest));
                }

                //System.out.println("Lightcount : " + c);
                if (Math.round(lightDistances.get(c)/(lightDurations.get(c) * speedperSecond)) % 2 != 0) {
                    System.out.println("Passage feu " + c + " : OK");


                    //System.out.println("c: " + c + " - temps: " + Math.round(lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)) + " - période: " + lightDurations.get(c));
                    if (c == lightCount - 1) {
                        result = i;
                        System.out.println("Bonne vitesse : " + i);
                        System.out.println("Vous avez gagné!");
                        i = -1;
                        break;

                    }
                } else {
                    System.out.println("Passage feu " + c + " : KO");
                    System.out.println(lightDistances.get(c)/(lightDurations.get(c) * speedperSecond));
                    //System.out.println("c: " + c + " - temps: " + Math.round(lightDistances.get(c) * 3.6 / (lightDurations.get(c) * i)) + " - période: " + lightDurations.get(c));
                    break;

                }
            }
        }

        System.out.println(result);


    }
}