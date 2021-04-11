import java.util.Scanner;

public class HelloName {
    public static void main(String[] args){
        System.out.print("Please enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello "+name);
    }
}
