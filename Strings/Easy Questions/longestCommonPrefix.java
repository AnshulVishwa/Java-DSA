class Solution {
    public static String getPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String lowest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < lowest.length()) {
                lowest = strs[i];
            }
            if (strs[i].isEmpty()) {
                return "";
            }
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String answer = "";

        for (int i = 0; i <= lowest.length(); i++) {
            String temp = lowest.substring(0, i);
            boolean include = true;
            for (String str : strs) {
                if (!str.startsWith(temp)) {
                    include = false;
                    break;
                }
            }
            if (include) {
                answer = temp;
            } else {
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] strs = {"flower" , "flow" , "flick"};
        System.out.println(getPrefix(strs));
    }
}
