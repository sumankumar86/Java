class exmple {
	static int getOddfrequency(int arr[], int n2)
	{
		int i;
		for (i = 0; i < n2; i++) {
			int count = 0;
			for (int j = 0; j < n2; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return 0;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println("Total odd number is:-"+getOddfrequency(arr, n));
	}
}
