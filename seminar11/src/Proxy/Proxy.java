package Proxy;

public class Proxy implements Credit  {
    private Credit credit;
    private Client client;

    public Proxy(Credit credit, Client client) {
        this.credit = credit;
        this.client = client;
    }

    @Override
    public boolean approved() {
        if (client.getIncome() > 6000) {
            return credit.approved();
        } else return false;
    }
}
