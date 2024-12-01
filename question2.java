//Find the maximum and minimum element in an array

public class question2 {
    public static void main(String args[]){
        int arr[]={2,3,5,1,7};
        int min,max;
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }else{
            max=arr[1];
            min=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("maximum element is:"+max+" "+"minimum element is:"+min);
    }
    
}
