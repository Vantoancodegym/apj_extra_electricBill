import java.util.Map;
import java.util.TreeMap;

public class BillManage {
    Map<Integer,Bill> billList=new TreeMap<>();
    public void addNewBill(Bill bill){
        int key=bill.getClientID();
        billList.put(key,bill);
    }
    public int getToltalMoneyById(int clientId){
        Bill bill=billList.get(clientId);
        if (bill==null)return 0;
        else return bill.getTotalMoney();
    };
    public void displayAll(){
        System.out.println(billList);
    }
}
