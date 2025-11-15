public class ZigzagConversion {

    static String zigzag(String s,int numRows){
        int length = s.length();
        if(numRows == 1 || numRows==length)
            return s;

        int key = (numRows-1)*2;
        String str = "";
        for(int i=0;i<numRows;i++){
            int index = i;
            if(i==0 || i==numRows-1){
                while(index<length){
                    str = str + s.charAt(index);
                    index += key;
                }
            }
            else{
                while(index<length){
                    str = str + s.charAt(index);
                    int j = index + key - (2*i);
                    if(j>=length){
                        break;
                    }
                    str = str + s.charAt(j);
                    index += key;
                }
            }

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(zigzag("abcdefghijklm",4));
    }
}
