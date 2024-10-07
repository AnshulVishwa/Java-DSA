public class validParan {
    public static boolean isValid( String s ){
        s = s.replaceAll(" ", "");
        int gap1 , gap2 , gap3;
        gap1 = gap2 = gap3 = 0;

        for( int i = 0 ; i < s.length() ; i++ ){
            if(  )
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("ans : " + isValid(" { }[ { } ] "));
    }
}

//             if( s.charAt("(") && !s.charAt(")") ) return false; // If pairs do not exists
//             else if( s.indexOf(")")-s.indexOf("(") < 0 ) return false; // if pairs are ")" & "("
//             else if( (s.indexOf(")")-s.indexOf("("))%2 == 0 ) return false; // if pairs do not have gap to fit another pair
    
//             if( s.charAt("[") && !s.charAt("]") ) return false; // If pairs do not exists
//             else if( s.indexOf("]")-s.indexOf("[") < 0 ) return false;
//             else if( (s.indexOf("]")-s.indexOf("["))%2 == 0 ) return false;
    
//             if( s.charAt("{") && !s.charAt("}") ) return false; // If pairs do not exists
//             else if( s.indexOf("}")-s.indexOf("{") < 0 ) return false;
//             else if( (s.indexOf("}")-s.indexOf("{"))%2 == 0 ) return false;