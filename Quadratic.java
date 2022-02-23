import java.util.*;      //Importing Java package section (util)
public class Quadratic       //Class declaration section ("Quadratic")

{

  //Declaring int variables (a, b, and c)
                                                                                                                                                                                                                                            
  private int a;
  private int b;
  private int c;
  
  //Default constructor (no-arg)
    
  public Quadratic()
  
  {
    a = 1;
    b = 1;
    c = 1;
  }
  
  //Second constructor with three arguments
  
  public Quadratic(int num1, int num2, int num3)
  	
  {
    a = num1;
    b = num2;
    c = num3;
  }
  
  //Mutator method section (setting a, b, and c)
  
  public void setA(int a)
  
  {
  	this.a = a;
  }
  
  public void setB(int b)
  
  {
    this.b = b;
  }
  
  public void setC(int c)
  
  {
    this.c = c;
  }
  
  //Accessor method section (getting a, b, and c)
  
  public int getA()
  
  {
    return a;
  }
  
  public int getB()
  
  {
    return b;
  }
  
  public int getC()
  
  {
    return c;
  }
  
  //End of program
  
} 