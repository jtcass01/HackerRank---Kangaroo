///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//      HackerRank -- Week of Code -- Kangaroo
//      Written by: Jacob Taylor Cassady
//      Date Began: 06/27/2016
//      Date Completed: 06/28/2016
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1=0,v1=0,x2=0,v2=0,intersection=0;
        
        for(int testCase=0; testCase<1; testCase++){
            x1 = scan.nextInt();
            v1 = scan.nextInt();
            x2 = scan.nextInt();
            v2 = scan.nextInt();
            if(v1!=v2){
                if((x2-x1)%(v1-v2) != 0){
                    intersection = -1;
                } else {
                    intersection = (x2-x1)/(v1-v2);
                }
            } else {
                if(x2==x1){
                    intersection = 1;
                } else {
                    intersection = -1;
                }
            }
            if(intersection>=0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
