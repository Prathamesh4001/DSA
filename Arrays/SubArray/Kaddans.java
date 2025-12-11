public class Kaddans{
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println("Maximum SubArray Sum is: "+maxsum);
      
        
        
    }
}