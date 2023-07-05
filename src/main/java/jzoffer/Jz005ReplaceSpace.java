package jzoffer;

public class Jz005ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (String.valueOf(c).equals(" ")){
                sb.append("%20");
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
