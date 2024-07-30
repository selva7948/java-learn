package array;
//fid the least diffrence 
public class diffrence {
    public static void main(String[] args) {
        int arr[]={1,5,3,1,3};
        int min=Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]<min2 && arr[i] != min){
                min2=arr[i];
            }
        }


// second method

    //     int num1=arr[0];
    //     int num2=arr[1];
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length;j++){
    //           if(arr[i]>arr[j]&&arr[i]-arr[j]<min){
    //             num1=arr[i];
    //             num2=arr[j];
    //             min=arr[i]-arr[j];
    //           }
    //             if( arr[j] - arr[i] < min&&arr[j]>arr[i]) {
    //               num1 = arr[i];
    //               num2 = arr[j];
    //               min = arr[j] - arr[i];
    //           }
    //     }
    // }
        // System.out.println(num1+","+num2);
        System.out.println(min);
        System.out.println(min2);
        System.out.println("min diff is "+min2+","+min+" : "+( min-min2));
    }
}
