import java.util.Scanner;

public class Place_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchVar;
        Cashier cs = new Cashier();
        Barista bs = new Barista();
        do{
            System.out.println("Choose An Option :\nPress 1 To Take New Order\nPress 2 To Exit :-");
            switchVar = sc.nextInt();
            switch (switchVar){
                case 1 :
                    System.out.println("Enter Order Details(Name,CoffeeQuantity)");
                    String name = sc.nextLine();
                    int quantity = sc.nextInt();
                    Customer c = new Customer(name,false,(float)(100*quantity),0,quantity);
                    cs.takeOrder(c, bs);
                    break;
                case 2:
                    System.out.println("Exiting....");
                    break;
                 default:
                     System.out.println("Choose Correct Option.");
            }

        }while(switchVar!=2);
        System.out.println("Your Order is placed.. Please Wait While it is being prepared !");
    }
}
