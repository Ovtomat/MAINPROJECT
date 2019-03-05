package com.example.student8.maybeproject2;

public class Detail {
    int numberenterence;
    int[] centercord=new int[2];
    int ressistance;
    int moshnost;
    Integer[][] entrancecoord;

    String imaged;
    EFFECT ef;
    Detail(int n,int r,int m,String imaged,EFFECT e){
        this.numberenterence=n;
        this.entrancecoord=new Integer[n][2];
        this.ressistance=r;
        this.moshnost=m;
        this.imaged=imaged;
        this.ef=e;
    }
    public void setCenter(int x,int y){
        this.centercord[0]=x;
        this.centercord[1]=y;
    }
    public void setcordofentarance(int n,int a,int b){
        this.entrancecoord[n-1][0]=centercord[0]+a;
        this.entrancecoord[n-1][1]=centercord[1]+b;


    }
    


}
