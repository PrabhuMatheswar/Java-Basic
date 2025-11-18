class GrandFather {
    public void house() {
        System.out.println("2 BHK House");
    }
}
class father  extends GrandFather{
    public void land() {
        System.out.println("3 Arcs of Land");
    }
}
 
class son extends father {
    public void car() {
        System.out.println("Own Car");
    }
}
 
public class Multilevel {
    public static void main(String args[]) {
        son b = new son();
        b.car();
        b.house();
        b.land();
    }
}
 