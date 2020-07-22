import java.util.Scanner;
class Main{
    public static int GetMax(int nums[]){
        int maxValue = nums[0];
        for(int j = 0; j<nums.length;j++){
            if(maxValue < nums[j]){
                maxValue = nums[j];
            }
        }
        return maxValue;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        int max = GetMax(arr);
        System.out.println("Maximum value in the array :"+ max);
    }
}
