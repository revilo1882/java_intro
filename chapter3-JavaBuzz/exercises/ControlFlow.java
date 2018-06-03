import java.util.*;

public class ControlFlow {
  public static void main(String[] args) {
    int number = 0;
    while( number != 17) {
      System.out.println("Enter a number: ");
      Scanner scanner = new Scanner(System.in);
      number = scanner.nextInt();
        if(number % 2 == 0){
          System.out.println(number + " is even");
        }else {
        System.out.println(number + " is odd");
        }
    }
  }
}
