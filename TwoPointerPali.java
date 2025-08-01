public class TwoPointerPali {
    public static void main(String[] args) {
        String str = "markram";
        System.out.println(ispalindrome(str));
    }

    public static boolean ispalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        } 
            
        return true;
    }
}
