class Linear{
public static int search(int arr[],int n, int x){
    for (int i = 0; i < n; i++) {
     if(arr[i]==x){
     return i;
     }
        
    }
    return -1;

}
public static void main(String[]args){
    int arr[]={2,5,7,3,8,9};
    int x= 8;
     int result = search(arr, arr.length, x);
      if(result==-1){
      System.out.print("element is not present");
      }else{
    System.out.println("element is present at index" +result);
}
      }
    }