
// if_condition

public class Controlstatement{
  public static void main(String[] args)
 {
   double a = 0.8;
    if (a>0)
    {
     System.out.println(a + " is a Positive Number!");
    }
  }
}

// If-else

public class Controlstatement{
  public static void main(String[] args)
  {
    double a = -0.8;
    if (a>0)
    {
      System.out.println(a + " is a Positive Number!");
    }
    else
    {
      System.out.println(a + " is a Negative Number!"); 
    }
  }
}

// NestedIfElseCondition

public class Controlstatement {
    public static void main(String[] args) {
        double totalMarks = 382;
        double perc = (totalMarks / 500) * 100;
        String grade;

        if (perc >= 80) {
            grade = "A+";
        } else if ((perc >= 70) && (perc < 80)) {
            grade = "A";
        } else if ((perc >= 60) && (perc < 70)) {
            grade = "B+";
        } else {
            grade = "B";
        }

        System.out.println("The percentage of the student is: " + perc);
        System.out.println("\nThe grade of the student is: " + grade);
    }
}

// Switch Statement

class Controlstatement {
  public static void main(String[] args)
  {
    char a = 'C';
    switch (a)
    {
      case 'A':
        System.out.println("Letter A");
        break;
      case 'C':
        System.out.println("Letter C");
        break;
      default:
        System.out.println("Default case: NO Letter Matched!");
    }
  }
}
