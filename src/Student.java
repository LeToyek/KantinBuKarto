import java.util.List;

public class Student {
    private String name;
    private int totalSangu;
    private int bill;
    private Gorengan gorengan;
    private Wedang wedang;
    private int totalBill;

    public Student(String name, int totalSangu) {
        this.name = name;
        this.totalSangu = totalSangu;
        this.bill = 0;
        this.totalBill = 0;
    }
    public int sanguRemaining(){
        return totalSangu - bill;
    }

    public String getName() {
        return name;
    }

    public void buyGorengan(Gorengan gorengan){
        bill = gorengan.payGorengan();
    }
    public void buyWedang(Wedang wedang){
        bill += wedang.payWedang() ;
    }

    @Override
    public String toString() {
        return "name\t= " + name +
                "\t||\t"+" bill\t= " + bill;
    }

}
