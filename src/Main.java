import java.util.*;



public class Main {


    //Question - for a given string convert each of the first letter of each word to uppercase
    public static String toUppercase(String str){
        StringBuilder sb =  new StringBuilder("");
        //firstly we will add first letter of string in capital form
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        //loop for elements from index 1
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i <str.length()-1){
                sb.append(str.charAt(i));
                //space is printed , now we will add next letter in capital form
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            //if above condition is not true then we will go with else statement
            else{
                sb.append(str.charAt(i));
            }
        }
        //now it's time to get our answer
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "this code is written by aman mittal.";
        System.out.println(toUppercase(str));
    }
}