class Numbers{
	int num1;
	int num2;

	Numbers(int a,int b){
		this.num1 = a;
		this.num2 = b;
	};

	public int addNumbers(){
		return this.num1+this.num2;
	};

	public int subtract(){
		return this.num1-this.num2;
	};

	public double divide(){
		return this.num1/this.num2;
	};

	public int multiply(){
		return this.num1*this.num2;
	};
};

class Add{
	public static void main(String[] args){
		Numbers num = new Numbers(10,5);
		System.out.println("Sum is "+num.addNumbers());
		System.out.println("Difference is "+num.subtract());
		System.out.println("Quotient is "+num.divide());
		System.out.println("Product is "+num.multiply());
	};
};