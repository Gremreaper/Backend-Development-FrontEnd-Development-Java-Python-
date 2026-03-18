import java.util.*;
public class Lecture2{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        Map<String,Integer> marks = new HashMap<>();

        marks.put("Rahul",100);
        marks.put("Simmy",200);

        arr.add(1);
        arr.add(2);
        arr.add(3);

        int[] arr1 = {1,2,3};
        char[] arr2 = {'a','b','c'};

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
            System.out.println(arr.get(i));
        } 

        for(Map.Entry<String,Integer> entry: marks.entrySet()){
           System.out.print(entry.getKey());
           System.out.println(entry.getValue());
           System.out.println("--------");
        }

        //null pointer exception
       // System.out.println(marks.get("Rohit") > 10);

        Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("Rohit"));
        System.out.println(marksOfRohit);
        if(marksOfRohit.isPresent()){
            System.out.println("Present");
        }else{
            System.out.println("I am not Present");
        }
    }
}