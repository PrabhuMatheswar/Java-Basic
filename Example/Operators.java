// Arithmetic Operator

public class Operators{
 public static void main(String[] args)
 {

  // declare variables
  int a = 15, b = 5;

  // addition operator
  System.out.println("a + b = " + (a + b));

  // subtraction operator
  System.out.println("a - b = " + (a - b));

  // multiplication operator
  System.out.println("a * b = " + (a * b));

  // division operator
  System.out.println("a / b = " + (a / b));

  // modulo operator
  System.out.println("a % b = " + (a % b));

 }
}

// Assignment Operator 
public class Operators
{
  public static void main(String[] args)
  {

   int a = 5;
   int var;

   var = a;

   System.out.println("var using =: " + var);

   var += a;

   System.out.println("var using +=: " + var);

   var *= a;

   System.out.println("var using *=: " + var);

  }
 }

//  Relational Operator

public class Operators
{
  public static void main(String[] args)
  {

   int a = 7, b = 11;

   System.out.println("a is " + a + " and b is " + b);

   System.out.println(a == b);

   System.out.println(a != b); 

   System.out.println(a > b); 

   System.out.println(a < b); 

   System.out.println(a >= b); 

   System.out.println(a <= b); 

  }
 }

//  Logical Operator

public class Operators
 {
  public static void main(String[] args)
  {

   
   System.out.println((6 > 3) && (8 > 6)); 

   System.out.println((6 > 3) && (8 < 6));

   System.out.println((6 < 3) || (8 > 6)); 

   System.out.println((6 > 3) || (8 < 6)); 

   System.out.println((6 < 3) || (8 < 6));

   System.out.println(!(6 == 3)); 

   System.out.println(!(6 > 3)); 

  }
 }

//  Bitwise Operator

 public class Operators
 {
  public static void main(String[] args)
  {

   String str = "Hollyday";
   boolean result;

   // checks if str is an instance of
   // the String class
   result = str instanceof String;

   System.out.println("Is str an object of String? " + result);
  }
 }

//  Comparison Operator


public class Operators {
public static void main(String[] args) {
int num1 = 10;
int num2 = 20;

boolean isEqual = (num1 == num2);
System.out.println("num1 is equal to num2: " + isEqual);

boolean isNotEqual = (num1 != num2);
System.out.println("num1 is not equal to num2: " + isNotEqual);

boolean isGreaterThan = (num1 > num2);
System.out.println("num1 is greater than num2: " + isGreaterThan);

boolean isLessThan = (num1 < num2);
System.out.println("num1 is less than num2: " + isLessThan);

boolean isGreaterThanOrEqual = (num1 >= num2);
System.out.println("num1 is greater than or equal to num2: " + isGreaterThanOrEqual);

boolean isLessThanOrEqual = (num1 <= num2);
System.out.println("num1 is less than or equal to num2: " + isLessThanOrEqual);
}
}

// Ternary Operator

public class Operators {
public static void main(String[] args) {
int num1 = 10;
int num2 = 20;

// Using the ternary operator to find the maximum of two numbers
int max = (num1 > num2) ? num1 : num2;

System.out.println("The maximum number is: " + max);
}
}

