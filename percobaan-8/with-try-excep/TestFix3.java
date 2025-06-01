import java.io.*; 

public class TestFix3 { 
    public void methodA(){ 
        System.out.println("Method A"); 
    } 
    public void methodB() throws IOException 
    { 
        System.out.println(20/0); 
        System.out.println("Method B"); 
    } 
} 

// Kode Perbaikan
class Utama  
{ 
     public static void main(String[] args) 
     { 
           TestFix3 o=new TestFix3(); 
           o.methodA(); 
           try 
           { 
                o.methodB(); 
           } 
           catch(Exception e) 
           { 
               System.out.println("Error di Method B"); 
           } 
           finally 
           { 
               System.out.println("Ini selalu dicetak"); 
           }; 
     } 
} 