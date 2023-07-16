//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // If there is only one element in the array then we will return that element and if there is two element then we will return the sum of those two element
        // First we will sort the array because we need to find the minimum sum. 
        // Then we will initialize two variables then we will form the smallest element and get their sum. 
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return arr[0]+arr[1];
        }
        Arrays.sort(arr);
        long n1=0;
        long n2=0;
        for(int i=0; i<n;){
            n1=(n1)*10+(long)(arr[i]);
            i++;
            if(i==n){
                break;
            }
            n2=(n2)*10+(long)(arr[i]);
            i++;
        }
        return n1+n2;
    }
}