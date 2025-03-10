import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int row,column;
    System.out.println("Welcome to the minefield !");
    System.out.println("Please enter the dimensions you want to play");
    System.out.println("Number of rows");
    row=scan.nextInt();
    System.out.println("Number of column");
    column=scan.nextInt();
    Minefield mine =new Minefield(row,column);
    mine.run();
   } 
}
