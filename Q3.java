import java.util.Scanner;
public class Q3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int average;
    System.out.println("What is your mid-year average in Java Programming.");
    average = in.nextInt();
    if (average >= 65)
      choice1();
    else 
      choice2();

  }
  public static void choice1() {
System.out.println("You are passing");
  }
  public static void choice2() {
    System.out.println("Hook up with a smart classmate and STUDY!");
  }

}
