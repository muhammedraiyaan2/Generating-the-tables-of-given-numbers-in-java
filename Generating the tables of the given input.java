import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the tables generate");
    System.out.println("Enter the number");
    Scanner inpu=new Scanner(System.in);
    int input=inpu.nextInt();
   int tables=0;
   int a=0;
    while(a<10){
      tables++;
      System.out.println(input+"*"+tables+"="+input*tables);
      a++;
    }
  }
}
