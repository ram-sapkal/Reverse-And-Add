package com.company;

import java.util.Scanner;

public class ReverseAndAdd {
    public int reverseNumber(int num){
        int temp1=0,temp2;
        for(int i=num;i>0; )
        {
            temp2 = i % 10;
            temp1=temp1*10+temp2;
            i=i/10;
        }
        return temp1;
    }
    public int checkPalindrome(int num){
        int temp1=0,temp2;
        for(int i=num;i>0; )
        {
            temp2=i%10;
            temp1=temp1*10+temp2;
            i=i/10;
        }

        if(temp1==num){return 1;} else {return 2;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseAndAdd obj = new ReverseAndAdd();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int count=0,temp2;
            int num=sc.nextInt();
            Boolean b=true;
            do{
               count++;
               temp2 = obj.reverseNumber(num);
               num=num+temp2;
               int flag = obj.checkPalindrome(num);
               if(flag==1){b=false;}
            }while(b);
            System.out.println(count+" "+num);
        }
    }
}
