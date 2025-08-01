import java.util.Scanner;
class RevAStr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}