import  java.util.HashSet;
import  java.util.Iterator;
public class HashSetDsa {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
//        HashSet<Character>
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.remove(5);
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
