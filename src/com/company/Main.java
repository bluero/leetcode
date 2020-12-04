package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {1, 2, 3, 4, 5, 6, 7};
//        rotate(a, 3);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        rotate1(a,3);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

    public static void rotate(int[] nums, int k) {
        int temp;
        for(int i=0;i< k;i++){
            int previous=nums[nums.length-1];
            for(int j=0;j< nums.length;j++){
                temp=nums[j];
                nums[j]=previous;
                previous=temp;
            }
        }
    }
    public static void rotate1(int [] nums,int k){
        int []a=new int [nums.length];
        for(int i=0;i< nums.length;i++){
            a[(i+k)% nums.length]=nums[i];
            System.out.println();
        }
        for(int i=0;i< nums.length;i++){
            nums[i]=a[i];
        }
    }
}
