public class BruteForce{
    public static void main(String[] args){
        int maxsum=Integer.MIN_VALUE;
       int sum=0;
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               for(int k=i;k<=j;k++){
                     sum+=arr[k];
               }
               if(sum>maxsum){
                   maxsum=sum;
               }
               sum=0;
                System.out.println();
            }
           
        }
        System.out.println("Maximum SubArray Sum is: "+maxsum);
    }
}