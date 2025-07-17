package Arrays;

public class largest {
    int slargest (int arr[], int n){
          int largest = arr[0];
          int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
return -1;

        }
        return largest;
    }
    public static void main(String[] args) {
        //brute force -> sorting and printing the last element
        //optimal -> keep largest as first element and check
        int arr [] = {3,7,1,5,2};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximun is:" +max);


        //Second-largest element
        //brute sort and start from last  and check for <=
        //better is to find largest

    }
}

