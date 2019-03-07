enum House{

Bhk3(14000),Bhk2(12000),Bhk1(8000);

private long price;
House(long price){
 this.price = price;
}

public long getPrice(){
	return this.price;
}
}


public class Question_9 {

Question_9(){
 System.out.println(House.Bhk3);
 System.out.println(House.Bhk2);
 System.out.println(House.Bhk1);
}

public static void main(String...args)
{
 Question_9 ob = new Question_9();
 System.out.println("Price Of 3BHK : "+House.Bhk3.getPrice());
 System.out.println("Price Of 2Bhk : "+House.Bhk2.getPrice());
 System.out.println("Price Of 1Bhk : "+House.Bhk1.getPrice());
}

}
