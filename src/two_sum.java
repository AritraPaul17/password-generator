public class two_sum {
    public static void main(String[] args) {
        int []a = {11,7,15,2};
        int []value = new int[2];
        int target = 9;
        for(int i=0;i<3;i++){
            int flag = a[i];
            for(int j=i+1;j<4;j++){
                if(flag+a[j]==target){
                    value[0] = i;
                    value[1] = j;
                    break;
                }
            }
        }

        for (int i= 0 ;i<2;i++){
            System.out.println(value[i]);
        }

    }
}
