import java.util.*;
public class addBinary {
    public static String addBinary(String a, String b) {
        if( a.isEmpty() ) return b;
        if( b.isEmpty() ) return a;
        if( a.isEmpty() && b.isEmpty() ) return "0";
        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);

        String output = "";
        int diff = 0;
        if( a.length() > b.length() ) diff = a.length()-b.length(); 
        if( b.length() > a.length() ) diff = b.length()-a.length();
        while( diff != 0 ){
            if( a.length() > b.length() ) sb2.insert(0, "0");
            if( b.length() > a.length() ) sb1.insert(0,"0");
            diff--;
        } 
        int carry = 0;
        for( int i = a.length()-1 ; i >= 0 ; i-- ){
            if( sb1.charAt(i) == '0' && sb2.charAt(i) == '0' && carry == 0 ){
                output += "0";
                carry = 0;
            }
            if( sb1.charAt(i) == '0' && sb2.charAt(i) == '0' && carry == 1 ){
                output += "1";
                carry = 0;
            }
            if( sb1.charAt(i) == '0' && sb2.charAt(i) == '1' && carry == 0 ){
                output += "1";
                carry = 0;
            }
            if( sb1.charAt(i) == '1' && sb2.charAt(i) == '0' && carry == 0 ){
                output += "1";
                carry = 0;
            }
            if( sb1.charAt(i) == '1' && sb2.charAt(i) == '1' && carry == 0 ){
                output += "0";
                carry = 1;
            }
            if( sb1.charAt(i) == '1' && sb2.charAt(i) == '1' && carry == 1 ){
                output += "1";
                carry = 1;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("1011" , "0010"));
    }
}
