// for loop

public class Loopingstatement {
  public static void main(String[] args) {

    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("java");
    }
  }
}


// Program to find the sum of natural numbers from 1 to 2000.
public class Loopingstatement {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 2000;

    for (int i = 1; i <= n; ++i) {
      sum += i;  
    }
       
    System.out.println("Sum = " + sum);
  }
}


// while-loop
public class Loopingstatement {
  public static void main(String args[])
 {
  int i = 1;
   while (i<=10)
   {

    if (i%2==0)
     {
       System.out.println(i);
     }

    i++;
   }

 }
}

// Do-while
public class Loopingstatement{
  public static void main(String args[])
 {

  int i = 1; 
  do
   {
    System.out.println(i);

    i++; //increment
   } while (i%2==0);

 }
}
