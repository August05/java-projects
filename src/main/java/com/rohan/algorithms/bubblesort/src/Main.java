public class Main {

    void BubbleSort(int arr[]){

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void printArray(int arr[]){

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[]){

        Main ob = new Main();
        int arr[] = {94, 34, 25, 12, 22, 11, 80};
        ob.BubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}