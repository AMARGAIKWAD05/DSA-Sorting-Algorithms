public class InsertionSort{

  public static void insetionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int currentElement=arr[i];
            int prev = i-1;
            // finding out the currect position to insert 
            while(prev >=0 && arr[prev] > currentElement){
                arr[prev + 1] = arr[prev];
                prev --;
            }
            // insertion
            arr[prev + 1] = currentElement;
        }
    }
    public static void disply(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
       
        int arr[]={5,10,3,7,9,6};
    
        insetionSort(arr);
        disply(arr);
    }
}
