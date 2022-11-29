class a{
    static int x;
    a(){
        x=100;
    }
}
class b extends a{
    int x;
    b(){
        x=10000;
    }
    public void display(){
        System.out.println("i belongs to class b="+x);
        System.out.println("i belongs to class a="+super.x);
    }
}
public class q9 {
    public static void main(String[] args) {
      b obj = new b();
      obj.display();  
    }
}
/*_________output__________
 * i belongs to class b=10000
i belongs to class a=100
 */
