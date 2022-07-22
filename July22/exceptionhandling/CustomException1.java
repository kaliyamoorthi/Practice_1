package exceptionhandling;
class InvalidAgeException1 extends Exception{

	@Override
	public String toString() {
		return "You are not eligible for vote";
	}
	
}
public class CustomException1 {
	static void  validate(int age)throws InvalidAgeException1{
		if(age<18){
			throw new InvalidAgeException1();
		}
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(15);
		}
		catch(InvalidAgeException1 e){
			System.out.println(e);
		}

	}

}
