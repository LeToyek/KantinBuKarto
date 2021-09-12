public class Gorengan {
    private String name;
    private int price;
    private int gorenganPaid;

    public Gorengan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int payGorengan() {
        this.price = getPrice();
        gorenganPaid += this.price;
        Kantin.updateIncome(gorenganPaid);
        return gorenganPaid;
    }
    @Override
    public String toString() {
        return name +
                " = Rp" + getPrice()
                ;
    }
}