package Proxy;

public class Client {
    private String name;
    private int income;

    public Client(String name, int income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", income=" + income +
                '}';
    }
}
