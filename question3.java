import java.util.*;
//Find the kth max and min element of an array
public class question3 {
    public static void kthsmallest(Integer a[],int k){
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
    public static void kthlargest(Integer a[],int l){
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(a[l-1]);

    }
    public static void main(String args[]){
        Integer []a={22,11,9,7,16};
        int k=2;
        int l=3;
        kthsmallest(a,k);
        kthlargest(a,l);
    }
    
}
