import java.util.Stack;

public class StackInteger {
    public static void main(String[] args) {
        int[] integer = {5,7,3,1,6,9,8};
        Stack stack = new Stack();
        for (int i = 0; i < integer.length; i++) {
            stack.push(integer[i]);
        }
        for (int i = 0; i < integer.length; i++) {
            integer[i] = (int) stack.pop();
        }
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i]);
        }
        System.out.println();
        System.out.println("dao chuoi");
        String str = "hello I love you";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (String) stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
