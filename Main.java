package com.company;

import java.util.Scanner;import java.util.Scanner;

public class Main{
    public int[] findAndReturnPrimeNumbers(int[] inputArray)
    {
        int k=0;
        int [] res = new int[inputArray.length];
        for(int i=0;i<inputArray.length-1;i++){
            int j,m=0,flag=0;


            m=inputArray[i]/2;
            if(inputArray[i]==0||inputArray[i]==1){
                flag=1;
            }else{

                for(j=2;j<=m;j++){
                    if(inputArray[i]%j==0){

                        flag=1;
                        break;
                    }
                }
                if(flag==0)  { res[k++]=inputArray[i]; }
            }//end of else
        }
        return res;
    }


    public static void main(String[] args) {

//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
        int[] arr = {10, 12, 5, 50, 11, 14, 15};
        Main obj = new Main();
        int[] res = obj.findAndReturnPrimeNumbers(arr);
        if (res[0] == 0)
            System.out.println("Prime number not found in the supplied Array");
        else {
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] == 0)
                    break;
                System.out.println(res[i]);

            }
//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following message:
// "Prime number not found in the supplied Array"
        }
    }
}




