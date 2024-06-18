package codetrain;

import java.util.Arrays;


public class Solution {
    /*实现一个算法，确定一个字符串 s 的所有字符是否全都不同。*/
    public boolean isUnique(String astr){
        boolean unique = true;
        char[] aArray = astr.toCharArray();
        for(int i=0; i<aArray.length; i++){
            for(int j=i+1; j<aArray.length; j++) {
                if (aArray[i] == aArray[j]) {
                    unique = false;
                    break;
                }
            }
        }
        return unique;
    }
    /*判定是否为字符重排*/
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
         return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    public static void main(String[] args) {
    Solution solution = new Solution();

    }
}
