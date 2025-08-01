class paalinDrome{
    public static void main(String[] args) {
        int number = 2112;
        int reversed = 0;
        int original = number;

        while(number>0){
            int digit = number%10;
            reversed = reversed *10+digit;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}