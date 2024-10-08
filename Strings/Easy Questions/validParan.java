class validParan {
    public static boolean isValid(String s) {
        s = s.trim();

        // Check if one of the pairs is missing a corresponding bracket
        if ((s.contains("(") && !s.contains(")")) || (s.contains(")") && !s.contains("("))) return false;
        if ((s.contains("[") && !s.contains("]")) || (s.contains("]") && !s.contains("["))) return false;
        if ((s.contains("{") && !s.contains("}")) || (s.contains("}") && !s.contains("{"))) return false;

        // Loop until no more brackets are left
        int i = 0;
        while (i < s.length()) {
            s = s.replaceAll(" ", "");  // Remove spaces

            if (s.contains("(") && s.contains(")")) {
                // Check if the pair is valid, i.e., they appear in the correct order
                if (s.indexOf(")") < s.indexOf("(")) return false;
                s = s.replaceFirst("\\(", "");  // Replace first occurrence of '('
                s = s.replaceFirst("\\)", "");  // Replace first occurrence of ')'
            }

            if (s.contains("[") && s.contains("]")) {
                // Check if the pair is valid, i.e., they appear in the correct order
                if (s.indexOf("]") < s.indexOf("[")) return false;
                s = s.replaceFirst("\\[", "");  // Replace first occurrence of '['
                s = s.replaceFirst("\\]", "");  // Replace first occurrence of ']'
            }

            if (s.contains("{") && s.contains("}")) {
                // Check if the pair is valid, i.e., they appear in the correct order
                if (s.indexOf("}") < s.indexOf("{")) return false;
                s = s.replaceFirst("\\{", "");  // Replace first occurrence of '{'
                s = s.replaceFirst("\\}", "");  // Replace first occurrence of '}'
            }

            i++;
        }

        // After the loop, the string should be empty if all pairs were matched correctly
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("answer : " + isValid("(){}[[{]]}"));  // This should output false
    }
}
