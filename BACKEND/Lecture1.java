public class Lecture1 {
    static int var = 10;

    public static void main(String[] args) {
        System.out.println(var + " Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);    
        System.out.println(Integer.toString(var)); // answer
        String Name = "Gautam Srivastava";
        System.out.println(Name);
        main1(args);
        main2(args);
        
        //Loops in java
        for(int i=0;i<10;i+=2){
            System.out.println(i);
        }

        //while loop in java
        int rem  = 1;
        while(rem < 10){
            System.out.println(rem);
            rem += 5;
        }
    }

    public static void main1(String[] args) {
        System.out.println("Hello World 1");

        // First Star Pattern
        char c = '*';
        for(int i=0;i<4;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(c);
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main2(String[] args) {
        System.out.println("Hello World " + var);

        //Second Star Pattern 
        char ch = '*';
        int n = 15;

        for(int row = n;row >= 1; row -=2){

            //first spaces 

            for(int r1_spaces = (row -1)/2 ; r1_spaces >=0 ; r1_spaces --){
                System.out.print(" ");
            }

            //Then stars
            
            for(int r2_stars = 1;r2_stars <= n-row+1 ;r2_stars++){
                System.out.print('*');
            }

            //Then spaces

            for(int r3_spaces = (row -1)/2;r3_spaces >=0 ;r3_spaces--){
                System.out.print(" ");
            }
          System.out.println();
        }
    }
}