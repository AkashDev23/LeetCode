//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        HashMap<Integer, Integer> map=new HashMap<>();
         Node curr=head;
        while(curr!=null){
            int val=curr.data;
            map.put(val, map.getOrDefault(val, 0)+1);
            curr=curr.next;
        }
        Node sortedList=null;
        Node tail=null;
        for(int i=0; i<=2; i++){
            int count=map.getOrDefault(i, 0);
            for(int j=0; j<count; j++){
                Node newNode=new Node(i);
                if(sortedList==null){
                    sortedList=newNode;
                    tail=newNode;
                }else{
                    tail.next=newNode;
                    tail=newNode;
                }
            }
        }
        return sortedList;
    }
}

