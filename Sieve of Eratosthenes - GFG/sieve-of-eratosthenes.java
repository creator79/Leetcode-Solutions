//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
         ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i<=N;i++){
            int flag=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                al.add(i);
            }
        }
        return al;
    }
}