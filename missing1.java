 package Aksh;

public class missing1 {
    public static void main(String[] args){
        int []arr={1,2,4,5,6};
        int n=arr.length;
        int SofN=(n*(n+1))/2;
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
       
        int miss=total-SofN;
        System.out.println(miss);
        System.out.println("got it");
    }
}
