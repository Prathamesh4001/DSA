public class LinearSearch{
    public static void search(int key,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key found at index: "+i);
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int key=30;
        search(key,arr);
    }
}