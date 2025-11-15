public class IntegerToRoman {
    static String getValue(int x){
        switch (x){
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                return "a";
        }
    }
    static String intToRoman(int n){
        String s = "";
        int i = 1;
        while(n>0){
            int r = n%10;
            if(r==1 || r==5){
                s = getValue(r*i) + s;
            }
            else if (r == 4 || r==9) {
                s = getValue(i) + getValue(r*i+i) + s;
            }
            else if (r<4) {
                for(int l = 0;l<r;l++){
                    s = getValue(i) + s;
                }
            }
            else if (r>4) {
                r = r - 5;
                for(int j = 0;j<r;j++){
                    s = getValue(i) + s;
                }
                s = getValue(5*i) + s;
            }
            n=n/10;
            i*=10;
        }
       return s;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(49));
    }
}
