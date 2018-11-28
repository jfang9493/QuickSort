public class Runner {
    public static void main(String[] args)
    {
        Partition nums = new Partition();

        int[] intArr = nums.randomArr(10);
        long start = System.nanoTime();
        nums.quickSort(intArr,0,intArr.length-1);
        long elapsed = System.nanoTime() - start;
        for (int i = 0; i < intArr.length; i++)
        {
            if (i == intArr.length-1) System.out.println(intArr[i]);
            else System.out.print(intArr[i] + ",");
        }
        System.out.println("Quick Sort took: " + elapsed + " nanoseconds." + "\n");

    }
}
