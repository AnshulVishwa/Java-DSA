import java.util.*;
public class Integer_Roman {
    public static String intToRoman(int num) {
        String str = Integer.toString(num);
        for( int i = 0 , j = str.length()-1 ; i < str.length() && j >= 0 ; i++ ){
            String thisString = Character.toString(str.charAt(j));
            thisString += "0".repeat(i);
            


            j--;
        }
        return "Hello";
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(3658);
    }
}