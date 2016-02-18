class BMICalculator{

	public double calculateBmi(double weight,double height){
		height /= 100;
		return weight/(height*height);
	};

	public static void main(String[] args){
		BMICalculator bmi = new BMICalculator();
		double weight = Integer.parseInt(args[0]);
		double height = Double.parseDouble(args[1]);
		System.out.println("BMI of the person is "+(bmi.calculateBmi(weight,height)));
	};
};