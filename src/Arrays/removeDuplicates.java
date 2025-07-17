package Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,2,2,2,3,3,3,4,4,5,5,6,6,6,6};
        int i = 0;
        for (int k = 1; k < arr.length ; k++) {
            if(arr[k]!=arr[i]){
                arr[i+1]=arr[k];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
