/*
Question: Given a positive integer n, 
print a left-aligned triangle of n rows using stars.
*/

public class LeftAlignedTriangle{
    public static void printTriangle(int n){

        for(int i =1; i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printTriangle(5);
        
    }



}