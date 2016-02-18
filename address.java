class Details{

	public String name ;
	public String house ;
	public int pin ;
	public int phoneNo;

	public Details(String name,String house,int pin){
		this.name = name;
		this.house = house;
		this.pin = pin;
	};

	public Details(String name,int phoneNo){
		this.name = name;
		this.phoneNo = phoneNo;
	};

	public void printDetails(){
			System.out.println("The name is "+this.name+" house name is "+this.house+" pin is "+this.pin);
	};

	public static void main(String[] args){
		Details shibi = new Details("shibi",680664);
		shibi.printDetails();
	};
};