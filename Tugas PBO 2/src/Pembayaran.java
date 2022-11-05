import java.util.Scanner;

public class Pembayaran  {
    Scanner input = new Scanner(System.in);
    public String idTransaksi;
    public int harga;

    public int tglBayar;
    public int totalBayar;
    private int inap;

    private String noKmr;

    public String getNoKmr() {
        return noKmr;
    }

    public void setNoKmr(String noKmr) {
        this.noKmr = noKmr;
    }

    public void pembayaranKamar(){
        System.out.print("Id pembayaran    : ");
        idTransaksi = input.nextLine();
        System.out.println("Tgl pembayaran : ");
        tglBayar = input.nextInt();
        System.out.println("Lama inap    :");
        inap = input.nextInt();
        System.out.println("Harga kamar    :");
        harga = input.nextInt();
        System.out.print("Total sewa      : " + Pembayaran());
        totalBayar = input.nextInt();
        System.out.println();
    }

    public int Pembayaran(){
    return inap * harga;
    }


    public void transaksi(){

        System.out.println("Total sewa : ");
        System.out.println("");
    //    lama inap x harga kamar
    }
}
