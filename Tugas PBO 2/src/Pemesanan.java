import java.util.Objects;
import java.util.Scanner;

public class Pemesanan {
    Scanner input = new Scanner(System.in);
    private String idPemesanan;
    private int jkamar;
    private int tglMasuk;
    private int tglKeluar;

    public int pil;
    private String idPetugas;

    public void inputPemesanan() {
        System.out.print("Id Pemesanan    : ");
        idPemesanan = input.nextLine();
        System.out.print("Id petugas      :");
        idPetugas = input.nextLine();
        System.out.print("Tanggal chek in : ");
        tglMasuk = input.nextInt();
        System.out.print("Tanggal chek out: ");
        tglKeluar = input.nextInt();
        System.out.println("Apakah anda ingin lanjut ke pembayaran");
        System.out.print("Jika yes klik [1] batal klik [2]: ");
        pil = input.nextInt();

        if (pil == 1)
        {
            System.out.println("berhasil");
        } else if (pil == 2) {
            System.out.println("Tambah pesanan");
        }else {
            System.out.println("input salah");
        }

    }

}


