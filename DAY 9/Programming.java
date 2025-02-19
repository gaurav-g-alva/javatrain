
// Write a Java Program to Count the number of characters in the given String and revrse the string
public class Programming {
    public static void main(String[] args) {
        String a = "Programming";
        System.out.println("length of String : "+a.length());
        //Printing the count of number of characters & characters
        int count=0;
        for(int i=0;i<a.length(); i++){
            System.out.print(a.charAt(i)+" ");
            count++;
        } 
        System.out.println("\n"+count);

        //Using the For Each loop to count the number of characters
        char[] Charr = a.toCharArray();
        int key=0;
        for (char c : Charr) {
            key++;
        }
        System.out.println("\n"+key);

        //Reverse the Given String
        String rev = "";
        for(int i=a.length()-1;i>=0  ; i--){
            char ch = a.charAt(i);
            rev += ch;
        } 
        System.out.print("Reverse String : "+rev);
    }
    
    
}
