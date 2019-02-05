package collections;

import java.util.*;

public class UniqunessApp {

    public static void main(String [] args){
        List<String> coll=new LinkedList<>();
        coll.add("A");
        coll.add("A");
        coll.add("A");
        coll.add("B");
        coll.add("B");
        System.out.println(coll);
        /*
        Set<String> collNew=new TreeSet<>();

        for(String s : coll)
            collNew.add(s);

        System.out.println(collNew);
        */

        List<String> collNew=new LinkedList<>();

        int rozmir=coll.size();
        boolean isDublicate;

        for (int i=0;i<rozmir;i++){
            if(i==0){
                collNew.add(coll.get(i));
                continue;
            }
            //System.out.println(i);
            isDublicate=false;
            for (int j=0;j<i;j++){
                if (coll.get(j).equals(coll.get(i)))
                    isDublicate=true;
            }
            if (!isDublicate)
                collNew.add(coll.get(i));
        }
        System.out.println(collNew);

    }
}
