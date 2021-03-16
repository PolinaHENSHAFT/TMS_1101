package com.tms;

public class bankomat {

    private int twenty;
    private int fifty;
    private int onehundred;

    public  int getnumoftwenty() {
        return twenty;
    }
    public void setnumoftwenty(int twenty){
        this.twenty= twenty;
    }
    public  int getnumoffifty() {

        return fifty;
    }
    public void setnumoffifty(int fifty){
        this.fifty= fifty;
    }
    public  int getnumofonehundred() {
        return onehundred;
    }
    public void setnumofonehundred(int onehundred){
        this.onehundred= onehundred;
    }
    public bankomat(int twentyamount,int fiftyamount, int onehundredamount){
        this.twenty= twentyamount;
        this.fifty= fiftyamount;
        this.onehundred= onehundredamount;
    }

     public void addmoney(int twenty,int fifty,int onehundred) {
         System.out.println("now in the bankomat we have twenty : "+ this.twenty + "fifty : " + this.fifty + "onehundred : " + this.onehundred);
         this.twenty += twenty;
         this.fifty += fifty;
         this.onehundred += onehundred;
     }
      public void takemoney(int twenty,int fifty,int onehundred) {
          System.out.println("now in the bankomat we have tewnty : "+ this.twenty + "fifty : " + this.fifty + "onehundred : " + this.onehundred);
        boolean Succeeded= true;

        this.twenty-=twenty;
        if (this.twenty<0){
            this.twenty=0;
            Succeeded=false;
        }
          this.fifty-=fifty;
          if (this.fifty<0){
              this.fifty=0;
              Succeeded=false;
          }
          this.onehundred-=onehundred;
          if (this.onehundred<0){
              this.onehundred=0;
              Succeeded=false;
          }
          System.out.println("We pulled away from the bankomat : " + twenty + " twenty: " + fifty + " fifty " + onehundred + " onehundred" );

          System.out.println("now in the bankomat we have tewnty: "+ this.twenty + "fifty: " + this.fifty + "onehundred : " + this.onehundred);

          if(Succeeded){
              System.out.println(" we succeeded to take money");
          }
          if (!Succeeded){
              System.out.println(" we didn't succeeded to take money");
          }
}

    @Override
    public String toString() {
        return "bankomat{" +
                "twenty=" + twenty +
                ", fifty=" + fifty +
                ", onehundred=" + onehundred +
                '}';
    }
}



