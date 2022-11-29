class rectangle{
    private int length;
    private int breath;
    private int area;
    public rectangle(){
        length =10;
        breath =10;
    }
    public rectangle(int l , int b){
        this.length = l;
        this.breath = b;
    }
    
   /**
     * @return int return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return int return the breath
     */
    public int getBreath() {
        return breath;
    }

    /**
     * @param breath the breath to set
     */
    public void setBreath(int breath) {
        this.breath = breath;
    }

    /**
     * @return int return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea() {
        System.out.println("Area   : "+length*breath);
    }
    
    public void display(){
        System.out.println("***********************");
		System.out.println("Length  : "+this.getLength());
		System.out.println("Breath  : "+this.getBreath());
		System.out.println("Area    : "+this.getArea());
		System.out.println("***********************");
    }


    
}
public class q6 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.display();
        rectangle r2 = new rectangle(20,30);
        r2.display();
        
    }
    

    
}
