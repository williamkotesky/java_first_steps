package Secao9;

public class Constructor {

	public String variableOne;
	public String variableTwo;
	
	public Constructor(String variableOne, String variableTwo) {
		this.variableOne =  variableOne; //this = object attribute
		this.variableTwo = variableTwo;
	}
	
	public void print() {
		System.out.println(variableOne);
	}
	
	//outside this class, will the instance will be:
	//Constructor constructor = new Constructor(variable1, variable2);
	
}
