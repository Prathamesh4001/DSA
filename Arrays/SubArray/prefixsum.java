public class prefixsum{
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int prefixsum[]=new int[arr.length];
        prefixsum[0]=arr[0];
        for(int i=1;i<prefixsum.length;i++){
            prefixsum[i]=arr[i]+prefixsum[i-1];
        }
        for(int i=0;i<prefixsum.length;i++){
            for(int j=i;j<prefixsum.length;j++){
                if(i==0){
                    sum=prefixsum[j];
                }
                else{
                    sum=prefixsum[j]-prefixsum[i-1];
                }
               
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
                sum=0;
              
            }
            System.out.println("Maximum SubArray Sum is: "+maxsum);
        }
    }

