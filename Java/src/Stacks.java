import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args){
        int i;
 
        Scanner sc = new Scanner(System.in);
        for (i=0; i < 3; i++){
            System.out.println("Enter Value");
            String getValue = sc.nextLine();
            Stack<String> stack = new Stack<>();
            stack.push(getValue);
            System.out.println("Added value" + stack);
            for (int j = i - 1; j < i; j++){
                System.out.println("Enter Delete Value");
                String searchedValue = sc.nextLine();
                //stack.search(searchedValue);
                if (searchedValue.equals(getValue)){
                    String deleteValue = stack.pop();
                    System.out.println(deleteValue);
                    System.out.println(stack);
                    System.out.println("delete success");
                }else {
                    System.out.println("data not matched");
                    System.out.println(stack);
                }
            }
        }


//        for (int j = 0; j < i; j++){
//            searchedValue = sc.nextLine();
//            String getSearchedValue = stack.search(searchedValue);
//            if (getSearchedValue.equals(searchedValue)){
//                String deleteValue = stack.pop();
//                System.out.println(deleteValue);
//                System.out.println(stack);
//            }else {
//                System.out.println("Not matched");
//            }
//
////            String deleteValue = stack.pop();
////            System.out.println(deleteValue);
////            System.out.println(stack);
//
////            if (searchedValue.equals(getValue)){
////                String deleteValue = stack.pop();
////                System.out.println(deleteValue);
////                System.out.println(stack);
////            }
//
//        }


    }



}
