#For Loops in Java
#@codingwithec

import java.util.*;
import java.io.*;
//series a+2^0*b, a+2^0*b+2^1*b, a+2^0*b+2^1*b+2^2*b
class Solution{
    public static void main(String []argh){
      
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
      
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //for loop for n
          
            for(int j=0; j<n;j++){
                //a+2^0*b
                a += (Math.pow(2, j)*b);
                //printing them in the same line
                System.out.print(Integer.toString(a)  + ' ');            
            }
            //for the second part go to next line
            System.out.print('\n');
        }
        in.close();
    }
}
