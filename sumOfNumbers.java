class SumOfNumbers{
	public int sum = 0;
	
	public static void main(String[] args){
		SumOfNumbers n = new SumOfNumbers();
		for(int i=0;i<args.length;i++){
			int num = Integer.parseInt(args[i]);
			n.sum+=num;
		};
		System.out.println("Sum is "+n.sum);
	};
};