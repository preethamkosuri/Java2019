package M3.Yahzee;
public class Yahzee{
    public int dice() {
        double n=Math.random();
        n=(n*6)+1;
        return (int)n;
    }
    public int count() {
        int d1=dice(),d2=dice(),d3=dice(),d4=dice(),d5=dice();
        int c=1;
        for( ;!(d1==d2 && d2==d3 && d3==d4 &&d4==d5); ){
            d1=dice();
            d2=dice();
            d3=dice();
            d4=dice();
            d5=dice();
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Yahzee y= new Yahzee();
        System.out.println(y.count());
        
    }
}