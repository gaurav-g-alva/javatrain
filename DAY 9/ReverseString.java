// Write a Java Program to reverse the given string with the Spaces
public class ReverseString {
    public static void main(String[] args) {
        String a = "Hello How are you";
        System.out.println("length of String : "+a.length());
        
        String rev = "";
        String[] reverse = a.split(" ");
        for(int i=reverse.length-1;i>=0  ; i--){
            rev = rev+ reverse[i]+" ";
        } 
        System.out.print("Reverse String : "+rev);
    }
}
