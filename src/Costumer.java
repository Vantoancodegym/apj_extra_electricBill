public class Costumer {
    private String name;
    private int houseId;
    private int clientId;

    public Costumer(String name, int houseId, int clientId) {
        this.name = name;
        this.houseId = houseId;
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", houseId=" + houseId +
                ", clientId=" + clientId +
                '}';
    }
}
