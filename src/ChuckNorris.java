public class ChuckNorris {

    public static void main(String[] args) {

        String text = "C'est Chuck Norris";
        String convert ="";
        char[] arrayText = text.toCharArray();
        for (char i : arrayText){
            int a = (int)i;
            convert = convert+Integer.toBinaryString(a);
        }

        System.out.println(convert);

    }


}
