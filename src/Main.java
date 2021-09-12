import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("KANTIN BU KARTO");

        Gorengan tempe = new Gorengan("Tempe", 1000);
        Gorengan tahu = new Gorengan("Tahu",500);
        Gorengan gedang = new Gorengan("Gedang Goreng",2000);

        List<Gorengan>gorenganList = new ArrayList<>();
        gorenganList.add(tempe);
        gorenganList.add(tahu);
        gorenganList.add(gedang);

        Wedang tehGelas = new Wedang("Teh Gelas",1000 );
        Wedang aqua = new Wedang("aqua", 500);
        Wedang boba = new Wedang("boba", 5000);

        List<Wedang>wedangList = new ArrayList<>();
        wedangList.add(tehGelas);
        wedangList.add(aqua);
        wedangList.add(boba);

        Student tukul = new Student("Tukul",20000);
        Student toyek = new Student("Toyek",15000);
        Student yanto = new Student("Yanto",25000);

        Kantin karto = new Kantin(gorenganList,wedangList);

        tukul.buyGorengan(gedang);
        toyek.buyGorengan(tahu);
        yanto.buyGorengan(tempe);

        tukul.buyWedang(boba);

        System.out.println("=======SEDIA GORENGAN=======");
        System.out.println(gorenganList);
        System.out.println("\n");
        System.out.println("=======SEDIA WEDANG=======");
        System.out.println(wedangList);

        System.out.println("\n=======DAFTAR UTANG=======");

        System.out.println(tukul.toString());
        System.out.println(yanto.toString());
        System.out.println(toyek.toString());
        System.out.println("\nBu Karto income\t= Rp" + karto.getIncome() + "\n");

        System.out.println("Sangu " + toyek.getName() + " = Rp" + toyek.sanguRemaining());
        System.out.println("Sangu " + tukul.getName() + " = Rp" + tukul.sanguRemaining());
        System.out.println("Sangu " + yanto.getName() + " = Rp" + yanto.sanguRemaining());
    }
}
