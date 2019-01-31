import java.util.*;
import java.io.*;
import java.math.*;

import static java.lang.Math.abs;

public class Temperatures {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 9999;
        int n = in.nextInt();
        for (int i = 0; i<n ; i++){
            int t = in.nextInt();
            if (abs(t) < abs(result)||((result<0)&&(t+result==0))) {
                result = t;
            }
        }
        System.out.println(result);
    }



}
