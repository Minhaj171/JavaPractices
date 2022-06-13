import java.util.Scanner;

public class Solution {
//    public static void main(String[] args) {
//        // Create a new Adder object
//        Adder a = new Adder();
//
//        // Print the name of the superclass on a new line
//        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
//
//        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
//        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
//    }

//    public static void main(String[] args) {
//        // Create a new Adder object
//        Scanner sc=new Scanner(System.in);
//        String title = sc.nextLine();
//        MyBook new_novel=new MyBook();
//        new_novel.setTitle(title);
//        System.out.println("The title is: "+ new_novel.getTitle());
//        sc.close();
//    }

//    public static void main(String []args){
//        MyCalculator my_calculator = new MyCalculator();
//        System.out.print("I implemented: ");
//        ImplementedInterfaceNames(my_calculator);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(my_calculator.divisor_sum(n) + "\n");
//        sc.close();
//    }

//    static void ImplementedInterfaceNames(Object o){
//        Class[] theInterfaces = o.getClass().getInterfaces();
//        for (int i = 0; i < theInterfaces.length; i++){
//            String interfaceName = theInterfaces[i].getName();
//            System.out.println(interfaceName);
//        }
//    }

    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        int j = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                j = j + i;
            }
        }
        System.out.println("The Sum Of The Divisors is: ");
        System.out.println(j);
    }

}
