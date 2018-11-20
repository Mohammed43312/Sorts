public class Sort
{
    public static void ascendingSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[lowPosition])
                {
                    lowPosition = j;
                }
            swap(i, lowPosition, arr);
        }
    }

    public static void swap( int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static String printArr ( int[] arr)
    {
        String output = "";
        for (int num : arr)
        {
            output = output + num + " ";
        }
        return output;
    }
}

