package Core_Java.Basics;

public class For1 {
    //for loops
    public static void main(String[] args) {
//        //increament
//         for (int i = 1; i <=5;i++){
//             System.out.println("Executed"+i);
//             //decreament
//             for (int j = 5; j >=1;j--){
//                 System.out.println("Executed J"+j);
//             }

// 9 to 5 hours time utilization table of a week
        for (int i = 1; i <=7; i++){
            System.out.println("Day "+i);
            for(int j=1 ; j <= 8; j++){
                System.out.println("    "+(j+8) + "-- "+(j+9));
            }
         }

    }
}
