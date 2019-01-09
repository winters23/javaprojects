package concatination_perfectsquare;
import java.lang.*; 
class concatination { 
    static void checkSquare(String s1, String s2) 
    { 
  
       
        int c = Integer.valueOf(s1 + s2); 
  
        int d = (int)Math.sqrt(c); 
  
        if (d * d == c) { 
            System.out.println("Yes"); 
        } 
        else { 
            System.out.println("No"); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "12"; 
        String s2 = "1"; 
  
        checkSquare(s1, s2); 
    } 
} 
