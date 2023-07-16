//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // We will traverse the string and if it is a digit then we will subtract the ascii value of 0 from it so that we get that character as a number.
        // Then we will enter the two numbers and as soon as we get an operator we will pop the two numbers and do as the operator says.
        // At last we will return the pop of the stack which is also the top value. 
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<S.length(); i++){
            char c=S.charAt(i);
            if(Character.isDigit(c)){
                int x=c-'0';
                st.push(x);
            }else{
                int a=st.pop();
                int b=st.pop();
                
                if(c=='+'){
                    st.push(b+a);
                }
                else if(c=='-'){
                    st.push(b-a);
                }
                else if(c=='*'){
                    st.push(b*a);
                }
                else if(c=='/'){
                    st.push(b/a);
                }
            }
        }
    return st.pop();
    }
}