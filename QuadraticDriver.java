import java.util.*;        //Importing Java package section (util)
public class QuadraticDriver        //Class declaration section

{
 
  public static void main(String[] args)    //Main declaration section
  
  {
  
 //Int variable declaration section
    
 int a = 0;
    
 int b = 0;
    
 int c = 0;
 
 //Scanner creation section
 
 Scanner quadraticRegister = new Scanner(System.in);
 
 //Beginning of input section
    
 System.out.println("The format for a quadratic equation is f(x) = y = ax^2 + bx + c.");
    
 System.out.println("Enter the value for a.");
 
 a = quadraticRegister.nextInt();
    
 System.out.println("Enter the value for b.");
    
 b = quadraticRegister.nextInt();
    
 System.out.println("Enter the value for c.");
    
 c = quadraticRegister.nextInt();
 
 //Creation of Quadratic object ("equationOne")
    
 Quadratic equationOne = new Quadratic(a, b, c);
    
 System.out.println(equationOne);
  
  }
  
  //End of program
  
  }