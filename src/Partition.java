public class Partition {
    public void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public int partition(int[] arr, int left, int right)
    {
        int x;
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
        x = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = x;
        return i+1;
    }

    public int[] randomArr (int count)
    {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100);
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ",");
        }
        return arr;
    }
}
