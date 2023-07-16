//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // Make a treeset and add all the rupee available in it as data.
        // Take the floor value of the input. eg if the value is 125 then we will take 100, then 20 then 5
        // Add all these value in an arraylist then return it. 
        
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(100);
        ts.add(200);
        ts.add(500);
        ts.add(2000);
        List<Integer> ans=new ArrayList<>();
        while(N>0){
            Integer temp=ts.floor(N);
            if(temp!=null){
                N=N-temp;
                ans.add(temp);
            }
        }
        return ans;
        
    }
}