package BinarySearch_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class checkIfN_2N_exist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 if(checkPairExist(arr,n)){
	            System.out.print("YES");
	        }else{
	            System.out.print("NO");
	        }
	}

	public static boolean checkPairExist(int arr[],int n){
        Arrays.sort(arr);

        for(int j=0;j<n;j++){
            int res=2*arr[j];

            if(binarySearch(arr,res,n)!=-1){
                return true;
            }
        }
        return false;
    }
    public static int binarySearch(int arr[], int res, int n){
        int low=0, high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==res){
                return mid;
            }else if(arr[mid]<res){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
