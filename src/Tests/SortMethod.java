package Tests;

public class SortMethod {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 65, 33, 12};
        //selectSort(arr);
        insertSort(arr);

    }

    /**
     * 选择排序,无论数组有多大，都会进行n*(n-1)/2次比较，时间复杂度O(n^2),空间复杂度O(1)
     * @param arr
     */
    private  static void selectSort(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * 插入排序法
     * @param arr 平均O(n^2),最好O(n),最坏O(n^2);空间复杂度O(1);稳定;简单
     */
    private static  void insertSort(int[] arr){
        for (int num:arr){
            System.out.print(num+" ");
        }
        for (int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
