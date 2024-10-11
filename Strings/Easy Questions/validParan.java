class validParan {
    public static boolean isValid(String s) {
        s = s.trim();
        if ((s.contains("(") && !s.contains(")")) || (s.contains(")") && !s.contains("("))) return false;
        if ((s.contains("[") && !s.contains("]")) || (s.contains("]") && !s.contains("["))) return false;
        if ((s.contains("{") && !s.contains("}")) || (s.contains("}") && !s.contains("{"))) return false;
        int i = 0;
        while (i < s.length()) {
            s = s.replaceAll(" ", "");  

            if (s.contains("(") && s.contains(")")) {
                if ((s.indexOf(")")-s.indexOf("("))%2 == 0 || s.indexOf("(") < s.indexOf(")") ) return false;
                s = s.replaceFirst("\\(", "");  
                s = s.replaceFirst("\\)", "");  
            }

            if (s.contains("[") && s.contains("]")) {
                if ((s.indexOf("]")-s.indexOf("["))%2 == 0 || s.indexOf("[") < s.indexOf("]") ) return false;
                s = s.replaceFirst("\\[", "");  
                s = s.replaceFirst("\\]", "");  
            }

            if (s.contains("{") && s.contains("}")) {
                if ((s.indexOf("}")-s.indexOf("{"))%2 == 0 || s.indexOf("{") < s.indexOf("}") ) return false;
                s = s.replaceFirst("\\{", ""); 
                s = s.replaceFirst("\\}", "");  
            }

            i++;
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("answer : " + isValid("([)]}{")); 
    }
}
