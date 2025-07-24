class Solution {
    public void reverseString(char[] s) {
        char swap;
        for(int i=1;i<=((s.length)/2);i++){
            swap=s[i-1];
            System.out.println(swap);
            s[i-1]=s[s.length-i];
            s[s.length-i]=swap;
        }
    }
}