package com.company;

public class SteelBarCutting {
    private static final int a[]={1,5,8,9,10,17,17,20,24,30};
    private static int p[]=new int[10];
    public static void main(String[] args) {
        System.out.println(""+getM(10));


    }
    public static int getM(int n){
        int []m=new int[11];
        if(n==0)
            return 0;
        int max;
        max=a[n-1];
        for(int i=1;i<=n/2;i++)
        {
            max=Math.max(max,getM(i)+getM(n-i));
        }
        m[n-1]=max;
        return m[n-1];
    }
}
