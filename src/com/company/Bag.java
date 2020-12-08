package com.company;

public class Bag {
    static int a[]={1,4,3};
    static int b[]={1500,3000,2000};
    //p[]存储前n磅的最大价格
    static int p[]=new int[5];
    //m[]记录前n磅所放的重量
    static int m[]=new int[5];
    static int max=0;
    public static void main(String[] args) {

        for(int i=1;i<=4;i++) {
            for (int j = 0; j < 3; j++) {
                if(a[j]<=i)
                    max=b[j];
                if (m[i-1]+a[j] <= i) {
                    max=Math.max(max,p[i-1]+a[j]);
                    m[i] += a[j];
                    p[i] += b[j];
                }
            }

        }
        for(int i=0;i<4;i++){
            System.out.println(p[i]);
            System.out.println(m[i]);
        }
//        System.out.println(getM(4));

    }
//    static int getM(int n){
//        if(n==0)
//            return 0;
//        if([n-1]>n)
//            return getM(n-1);
//        int max=b[n-1];
//        for(int i=0;i<a.length;i++){
//                if(a[i]+a[n-1]<=n) {
//                    max+=b[i];
//                    max = Math.max(max, getM(n - 1) );
//                    m[i]+=i;
//                }
//        }
//        p[n-1]=max;
//        return p[n-1];
//    }
}
