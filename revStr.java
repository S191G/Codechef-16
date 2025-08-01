
public class revStr {
    public static void main(String[] args) {
        String original= "Hello World";
        String reverse = "";
        for(int i=original.length()-1;i>=0;i--){
            reverse += original.charAt(i);
        }
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reverse);
    }
}
