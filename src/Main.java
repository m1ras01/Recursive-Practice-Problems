import java.util.Scanner;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of problem");
        int problem = s.nextInt();
        switch (problem){
            case 1:
                System.out.println("Lenth of array: ");
                int n = s.nextInt();
                System.out.println("Enter the array");
                int[] arr = new int[n];
                for(int i = 0 ; i < n ; i ++){
                    arr[i] = s.nextInt();
                }
                System.out.println("Minimum number is " + Task_1.minNum(arr ,n));
                break;
            case 2:
                System.out.println("Enter length of array");
                n = s.nextInt();
                System.out.println("Enter the array");
                arr = new int[n];
                for(int i = 0 ; i <n; i++){
                    arr[i] = s.nextInt();
                }
                System.out.println("The average is " + Task_2.averageNums(arr,n));
                break;
            case 3:
                System.out.println("Enter a number");
                n = s.nextInt();
                System.out.println("Your number is "+Task_3.checkNums(n));
                break;
            case 4:
                System.out.println("Enter a number for the find of factorial ");
                n = s.nextInt();
                System.out.println("Factorial "+n+"! is " +Task_4.factorial(n));
                break;
            case 5:
                System.out.println("Enter n-th elements in Fibonacci");
                n = s.nextInt();
                System.out.println(n+"-th elements in Fibonacci is " +Task_5.FastFibonacci(n));
                break;
            case 6:
                System.out.println("Enter a number A");
                n = s.nextInt();
                System.out.println("Enter the degree of the number a");
                int a = s.nextInt();
                System.out.println("Degree A of n is "+Task_6.Pow(a,n));
                break;
            case 7:

        }
    }

}