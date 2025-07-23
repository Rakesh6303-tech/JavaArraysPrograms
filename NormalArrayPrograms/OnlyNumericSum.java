Given  string contain alpha,numbers,special charactes you need to do only addition
	public static void main(String args []) {
		String ar [] = {"1","4","r","5","3","$","9", "@"};
		int sum = SumOnlyNumbers(ar);
		System.out.println(sum);
	}
	static int SumOnlyNumbers(String ar [])
	{
		int sum =0;
		for(String element : ar)
		{
			try {
				int num = Integer.parseInt(element);
				sum += num;
			}catch(NumberFormatException e) {
				
			}
		}
		return sum;
	}
