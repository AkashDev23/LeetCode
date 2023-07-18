//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends

class Activity{
    int start;
    int end;
    Activity(int a, int b){
        this.start=a;
        this.end=b;
    }
}
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // First we will sort the activities based on their end time.
        // Then we will take the first activity and after the the activity that starts after that activity.
        // Do this till all the activity is covered. 
        Activity[] activities=new Activity[n];
        for(int i=0; i<n; i++){
            activities[i]=new Activity(start[i], end[i]);
        }
        Arrays.sort(activities, (x,y)->x.end-y.end);
        int count=0;
        int lastDone=0;
        for(int i=0; i<n; i++){
            if(activities[i].start > lastDone){
                count++;
                lastDone = activities[i].end;
            }
        }
        return count++;
        
    }
}