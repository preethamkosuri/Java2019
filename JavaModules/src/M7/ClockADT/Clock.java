/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */
package M7.ClockADT;

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    public int h,m;
    public Clock(int h, int m) {
        this.h=h;
        this.m=m;   
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        String[] st=s.split(":");
        h=Integer.parseInt(st[0]);
        m=Integer.parseInt(st[1]);
        
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        if(h<10 && m<10){
            return "0"+h+":0"+m;
        }
        else if(h<10){
            return "0"+h+":"+m;
        }
        else if(m<10){
            return h+":0"+m;
        }
        else{
            return h+":"+m;
        }
}

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if((this.h<=that.h && this.m<that.m)){
            return true;
        }
        return false;
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        m++;
        if(m==60){
            m=00;
            h++;
            if(h==24){
                h=00;
            }
        }  
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        int n1=delta%60;
        int n2=delta/60;
        if(h+n2>23){
            h=h+n2;
        }
        else{
            h=h+n2;
        }
        int N=60-m;
        if(N>n1){
            m=m+n1;
            if(m==60){
                m=00;
                h++;
                if(h==24){
                    h=00;
                }
            }
        }
        else{
            m=n1-N;
            h++;
            if(h==24){
                h=00;
            }
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }

}