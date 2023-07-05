package jzoffer;

public class Jz058ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(s, n, s.length());
        sb.append(s, 0, n);
        return sb.toString();
    }
}
