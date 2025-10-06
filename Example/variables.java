public class variables{
int data=50;//instance variable
static int b=100;//static variable
void main(){
int n=90;//local variable
}
}//end of class 




// Add Two Numbers

public class variables{
public static void main(String[] args){
int a=10;
int b=10;
int c=a+b;
System.out.println(c);
}
} 

// Widening

public class variables{
public static void main(String[] args){
int a=25;
float f=a;
System.out.println(a);
System.out.println(f);
}
} 


// Overflow

public class variables{
public static void main(String[] args){
int a=140;
byte b=(byte)a;
System.out.println(a);
System.out.println(b);
}
}