package aca.com;

public class Time {
    private int second;
    private int hour;
    private int minute;

    public Time ( int h, int m, int s) {
        hour = h; minute=m; second=s;
    }
    public int GetHour() { return(hour); }
    public int GetMinute() { return(minute); }
    public int GetSecond() { return(second); }
    public void SetHour( int h) { hour=h; }
    public void SetMinute( int m) { minute = m; }
    public void SetSecond( int s) { second=s; }
    public String toString() {
        String outbuff="0";
        if (hour<10) {
            outbuff = outbuff+hour;
        } else {
            outbuff = ""+hour;
        }
        outbuff = outbuff + ":";
        if (minute<10) {
            outbuff = outbuff + "0" + minute;
        } else {
            outbuff = outbuff + minute;
        }
        outbuff = outbuff + ":";
        if (second<10) {
            outbuff = outbuff + "0" + second;
        } else {
            outbuff = outbuff + second;
        }
        return(outbuff);
    }

    public void SetTime ( int h, int m, int s) {
        hour=h; minute=m; second=s;
    }

    public Time( Time t){
        this.second = t.GetSecond();
        this.minute = t.GetMinute();
        this.hour = t.GetHour();
    }

    public Time nextSecond() {
        second++;
        if (second==60) {
            minute++;
            second=0;
        }
        if (minute==60) {
            hour++;
            minute=0;
        }
        if (hour==24) {
            hour=0;}
        return(this);
    }

    public static void main(String args[]) {
        Time t = new Time(0,0,0);
        do {
            System.out.println( t.toString());
            Time T = t.nextSecond();
            t = T;
        }
        while (!((t.GetHour()==0) && (t.GetMinute()==0) && (t.GetSecond()==0)));
    }
}

