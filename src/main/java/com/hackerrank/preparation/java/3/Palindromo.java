public class Palindromo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String palindrome = "Yes";
        for (int i=0, j = A.length()-1; i < A.length() && j>=0; i++, j--){
            // System.out.println("i"+i+ " = " + A.charAt(i));
            // System.out.println("j"+j+ " = " + A.charAt(j));
            if(A.charAt(i) != A.charAt(j)){
                palindrome = "No";
                break;
            }
        }
        System.out.println(palindrome);
    }

}