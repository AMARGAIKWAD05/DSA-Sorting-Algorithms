Public class SelectionSort{

  public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp= arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void disply(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={5,10,3,7,9,6};
      
        selectionSort(arr);
        disply(arr);
    }
  
}
