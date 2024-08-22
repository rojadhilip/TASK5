package array;

public class Reverse {
    public static void main(String[] args) {
        String String= "Love All";
        //Store the reverse of given String
        String ReverseStr="";
        // iterate through the string from last and each character to variable reverseStr
        for(int i=String.length()-1;i>=0;i--){
           ReverseStr = ReverseStr+String.charAt(i);
        } 
        System.out.println("orignal String:"+String);
        //Displays the reverse of the given String
        System.out.println("Reverse of given Strin:"+ReverseStr);
   
       }    
    
}
