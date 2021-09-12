public class Wedang {
    private String name;
    private int price;
    private int wedangPaid;

    public Wedang(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public int payWedang(){
        this.price = getPrice();
        wedangPaid += this.price;
        Kantin.updateIncome(wedangPaid);
        return wedangPaid;
    }

    @Override
    public String toString() {
        return
                name+
                " = " + price
                ;
    }
}
