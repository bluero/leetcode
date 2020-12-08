package com.company;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int []a={4,5,6,0,0,0};
        int []b={1,2,3};

//        merge(a,3,b,3);
//        merge1(a,3,b,3);
        merge2(a,3,b,3);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
    static public void merge1(int []nums1,int m,int []nums2,int n){
        int a=0;
        int b=0;
        int temp=0;
        while (a<m&&b<n)
        {
            if(nums1[a]<=nums2[b]){
                a++;
            }
            else {
                temp = nums1[a];
                nums1[a]=nums2[b];
                nums1[a+1] = temp;
                b++;

            }
        }

//        if(a<m)
//        System.arraycopy(nums1,a,nums2,);
        if(b<n)
            System.arraycopy(nums2,b,nums1,a+b,n-b);
    }
    static public void merge2(int []nums1,int m,int []nums2,int n){
        int a=m-1;
        int b=n-1;
        int p=nums1.length-1;
        while (a>=0&&b>=0)
        {
            if(nums1[a]<=nums2[b]){
                nums1[p]=nums2[b];
                b--;
                p--;
            }
            else{
                nums1[p]=nums1[a];
                a--;
                p--;
            }
        }
        System.arraycopy(nums2,0,nums1,0,b+1);
    }

}
