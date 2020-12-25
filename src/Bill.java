public class Bill {
    private int oldIndex;
    private int newIndex;
    private Costumer costumer;
    public Bill(int oldIndex, int newIndex, Costumer costumer) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.costumer = costumer;
    }
    public int getTotalMoney(){
        return (newIndex-oldIndex)*750;
    };
    public int getClientID(){
        return this.costumer.getClientId();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", costumer=" + costumer +
                '}';
    }
}
