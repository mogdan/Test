import java.util.ArrayList;
import java.util.Scanner;


public class AsciiConverter1 {

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public static void main(String[] args) {

        //getting the data using standard input
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        in.nextLine();
        int height = in.nextInt();
        in.nextLine();
        String text= in.nextLine().toUpperCase();
        ArrayList<String> ascii = new ArrayList<String>();
        for(int i = 0; i < height; i++) {
            ascii.add(in.nextLine());
        }

		/* === Code for testing ===
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		*/

        //find the necessary indexes of letters
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(char c : text.toCharArray()) {
            if(c < 'A' || c > 'Z') indexes.add(26);
            else {
                for(char letter : alphabet.toCharArray()) {
                    if(c == letter) {
                        indexes.add(alphabet.indexOf(letter));
                    }
                }
            }
        }

        //print result
        for(int j = 0; j < height; j++) {
            for(int k = 0; k < indexes.size(); k++) {
                System.out.print(ascii.get(j).substring(indexes.get(k)*width, indexes.get(k)*width + width));
            }
            System.out.println();
        }
        in.close();
    }


}
