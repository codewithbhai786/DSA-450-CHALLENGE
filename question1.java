//Reverse the array

public class question1{
    public static void revArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={12,34,56,78,90};
        revArray(arr);
    }
    
}