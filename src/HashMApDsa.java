import java.util.HashMap;
import java.util.Map;

public class HashMApDsa {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> map = new HashMap<>();

        //add
        map.put("India",120);
        map.put("China",110);
        map.put("Russia",80);
        map.put("Germany",12);
        map.put("Portugal",10);
        //delete
//        map.remove("China");
        System.out.println(map);
        //searching
//        String coun = "China";
//        if(map.containsKey(coun)){
//            System.out.println(coun+" key is present and the value is "+map.get(coun));
//        }else{
//            System.out.println(coun+" key is not present.");
//        }
//        if(map.containsValue(120)){
//            System.out.println("120 key is present and the value is ");
//        }else{
//            System.out.println(" 120 is not present.");
//        }

        //iterator

//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey()+" = "+e.getValue());
//        }
//        map.put("Portugal",map.get("Portugal")+40);
        System.out.println(map);
    }
}
