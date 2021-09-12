import java.util.List;

public class Kantin {
    private String name = "Kantin Bu Tedjo";
    private static int income ;
    private List<Gorengan> gorenganList;
    private List<Wedang> wedangList;

    public Kantin(List<Gorengan> gorenganList,List<Wedang> wedangList){
        this.gorenganList = gorenganList;
        this.wedangList = wedangList;
        this.income = 0;
    }

    public void addGorengan(Gorengan gorengan){
        gorenganList.add(gorengan);
    }
    public void addWedang(Wedang wedang){
        wedangList.add(wedang);
    }

    public static int getIncome() {
        return income;
    }

    public static void updateIncome(int pemasukan) {
        income += pemasukan;
    }

}
