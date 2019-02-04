import java.util.ArrayList;
import java.util.Arrays;

public class ChuckNorris {

    public static void main(String[] args) {

        String text = "C'est Chuck Norris";
        String convert ="";
        char[] arrayText = text.toCharArray();
        for (char i : arrayText){
            int a = (int)i;
            convert = convert+Integer.toBinaryString(a);
        }

        ArrayList<String> toConvert = new ArrayList< >(Arrays.asList(convert.split("")));
        for (String c : toConvert){

        }

        System.out.println(toConvert);


    }


}
