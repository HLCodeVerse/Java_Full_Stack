package Challanges;

public class Array2 {
    public static void main(String[] args) {
        int [] array={1,2,2,5,2,5,6,4,6,3,3,4,4,1};
        int[] countArray= new int[array.length];
        for (int num: array){
            countArray[num] ++;
        }
        for (int i=0;i<countArray.length;i++){
            if (countArray[i]>1){
                System.out.println(i+"occurs"+countArray[i]+"times");
            }
        }
    }

    }

