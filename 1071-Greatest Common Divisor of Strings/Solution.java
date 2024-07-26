class Solution {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            System.out.println("no gcd");
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));

    }


    public static void main(String[] args) {
        String str1 ="ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2));


    }
}