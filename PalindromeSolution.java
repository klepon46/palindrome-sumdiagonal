import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PalindromSolution {
    public static void main(String[] args) {
        String str1 = "isi";
        int i = 0; int j = str1.length()-1;
        boolean isPalindrome = true;
        while(i < j){
            if(str1.charAt(i) != str1.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


}
