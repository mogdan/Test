import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAsciiConverter {
    static String dico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
    static List<String> dicoList = new ArrayList<>(Arrays.asList(dico.split("")));

    public static void main(String[] args) {

        System.out.println(dico);
        System.out.println(dicoList);

        int L = 4;
        int H = 5;
        String text = "Toto il a un chapeau";
        String text_up = text.toUpperCase();
        System.out.println(text_up);
        String l1 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
        String l2 = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
        String l3 = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
        String l4 = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
        String l5 = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";

        List<String> text_list = new ArrayList<>(Arrays.asList(text_up.split("")));
        System.out.println(text_list);

        String result1 ="";
        String result2 ="";
        String result3 ="";
        String result4 ="";
        String result5 ="";
        int index = -1;

        for (String c : text_list) {
            index = dicoList.indexOf(c);
            if (index == -1){index = 26;}
            result1 += l1.substring(index * 4, (index * 4) + 4);
            result2 += l2.substring(index * 4, (index * 4) + 4);
            result3 += l3.substring(index * 4, (index * 4) + 4);
            result4 += l4.substring(index * 4, (index * 4) + 4);
            result5 += l5.substring(index * 4, (index * 4) + 4);
        }

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }

}
