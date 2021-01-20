public class Timeprinter {

    public static void main(String []  args) {

       int s = 4500;
       int min = s/60;
       int sec = s%(min*60);
        
        System.out.println(min + " minutes " + sec + " seconds ");
       
       int m = (s-sec)/60;
       min = m%60;
       int h = (m-min)/60;
       
       System.out.println(h + " hours " + min + " minutes " + sec + " seconds");

       int d = 60*60*24;
       int day = s/d;
       
       System.out.println(day + " days " + h + " hours " + min + " minutes " + sec + " seconds");
       
       int w = 7*d;
       int week = s/w;
       
       System.out.println(week + " weeks " + day + " days " + h + " hours " + min + " minutes " + sec + " seconds");

    }
    
}