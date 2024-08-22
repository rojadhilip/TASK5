package array;

public class palindrometest1 {
    public static void main (String[] args) {
        String str ="Radar", reverseStr ="";
        int StrLength = str.length();
        for (int i = (StrLength -1);i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + "is a palindrome String.");
        }
        else {
            System.out.println(str + "is a not palindrome String.");
        }
     }


}

    
    

