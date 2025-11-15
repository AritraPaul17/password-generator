public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int length = s.length();
        int maxlen = 0;
        String maxStr = "";
        if(length==1){
            maxlen = 1;
            maxStr = s;
        }
        else{
            for(int i=0;i<length-1;i++){
                int len = 0;
                //for odd no. palindrome
                int left = i, right = i;
                while(left>=0 && right<length && s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                len = right-left-1;
                if(len>maxlen){
                    maxlen = len;
                    maxStr = s.substring(left+1,right);
                }
                //for even no. palindrome
                left = i;
                right = i+1;
                while(left>=0 && right<length && s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                len = right-left-1;
                if(len>maxlen){
                    maxlen = len;
                    maxStr = s.substring(left+1,right);
                }
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccbb"));

    }
}
