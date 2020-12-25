import java.util.Scanner;

public class Main {
    public static final int MIN_INDEX = 0;
    public static BillManage billManage=new BillManage();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new bill");
            System.out.println("2. Get total money by client id");
            System.out.println("3. Display all");
            System.out.println("0. exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("enter n");
                    int n=Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        addNewBill();
                    }
                    break;
                case 2:
                    System.out.println("enter client id");
                    int clientId=Integer.parseInt(scanner.nextLine());
                    int result=billManage.getToltalMoneyById(clientId);
                    System.out.println(result);
                    break;
                case 3:
                    billManage.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice!=0);

    }
    public static void addNewBill(){
        System.out.println("enter customer 's name");
        String name=scanner.nextLine();
        System.out.println("enter house id");
        int houseId=Integer.parseInt(scanner.nextLine());
        System.out.println("enter client id");
        int clientId=Integer.parseInt(scanner.nextLine());
        int oldIndex;
        do {
            System.out.println("enter old index");
            oldIndex=Integer.parseInt(scanner.nextLine());
        }while (oldIndex< MIN_INDEX);
        int newIndex;
        do {
            System.out.println("enter new index");
            newIndex=Integer.parseInt(scanner.nextLine());
        }while (oldIndex>newIndex);
        Costumer costumer=new Costumer(name,houseId,clientId);
        Bill bill=new Bill(oldIndex,newIndex,costumer);
        billManage.addNewBill(bill);
    }
}
