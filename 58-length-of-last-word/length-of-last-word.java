class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1=s.split(" ");
        int l=s1.length-1;
        String t=s1[l];
        return t.length();
    }
}