//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l=0, r=n-1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]==k)
            return m;
            else if(k>arr[m])
                l =m+1;
                else
                r=m-1;
        
            
        }
        return -1;
    }
}


// else if(k>arr[m])
//                 r=m+1;
//                 else
//                 l = m-1;