 Write a Program to  Find Targeted Value
   Targest = 6
	public static void main(String args []) {
		int ar [] = {1,4,5,8,9,3,6};
		int target = 6;
		int find = LinearSearch(ar,target);
		if(find!=-1)
		{
			System.out.println("Element is "+ target +" Found at "+find+" Index");
		}
		else {
			System.out.println("No Element Index Found");
		}
	}
	static int LinearSearch(int ar [], int target) {
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
