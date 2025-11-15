public class RomanToInteger {

    static int getValue(char x){
        switch (x){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    static int romanToRoman(String s){
        int length = s.length();
        int num = getValue(s.charAt(0));
        for(int i=1;i<length;i++){
            if(getValue(s.charAt(i)) > getValue(s.charAt(i-1))){
                num -= getValue(s.charAt(i-1));
                int val = getValue(s.charAt(i)) - getValue(s.charAt(i-1));
                num += val;
            }
            else{
                num += getValue(s.charAt(i));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToRoman("CMLXI"));
    }
}
