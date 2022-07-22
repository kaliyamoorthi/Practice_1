package exceptionhandling;
class Amountmin extends Exception{
	int balance=1000;
	 void validate(int amount)throws Amountmin{
        if(amount>balance) {
            throw new Amountmin();
        }
        else 
            System.out.println("transaction successfull");
        }
	
    public Amountmin() {
       
    }
    @Override
    public String toString(){
    	return "Insufficient balance";
    }
}
public class lessAmount  {
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            new Amountmin().validate(1500);
        }
        catch(Amountmin e) {
           System.out.println(e);
            
        }
    }
}
