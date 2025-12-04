import java.util.*;

public class hashMap {
    public static void main(String[] args){

        //creating
        HashMap<String, Integer> mpp = new HashMap<>();

        //adding pairs
        mpp.put("India", 120);
        mpp.put("US", 120);
        mpp.put("China", 120);

        System.out.println(mpp);

        mpp.put("China", 150); // updating the value for china

        System.out.println(mpp);


        // searching
        if(mpp.containsKey("India")){
            System.out.println("India is there");
        }else{
            System.out.println("India is not there");
        }


        // getting value
        System.out.println(mpp.get("China"));        // prints 150(Value of china)
        System.out.println(mpp.get("Indonesia"));   // prints null


        // size
        System.out.println("Size: " + mpp.size());


        //Iteration in HashMap
        for(Map.Entry<String, Integer> e: mpp.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }



        // store keys
        Set<String> keys = mpp.keySet();
        for(String key : keys){
            System.out.println(key+ " " +mpp.get(key));

        }


        //delete pairs
        mpp.remove("China");        // pass the key
        System.out.println(mpp);
    }
    
}
