import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNIM() {
        return nim;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        ArrayDeque<Integer> daftarNIM = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cetak Daftar Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    scanner.nextLine(); 
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    int nim = scanner.nextInt();

                    daftarMahasiswa.add(new Mahasiswa(nama, nim));
                    daftarNIM.add(nim);
                    System.out.println("Mahasiswa ditambahkan!");
                    break;
                case 2:
                    System.out.println("Daftar Mahasiswa:");
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada mahasiswa dalam daftar.");
                    } else {
                        for (int i = 0; i < daftarMahasiswa.size(); i++) {
                            Mahasiswa mahasiswa = daftarMahasiswa.get(i);
                            int nimMahasiswa = daftarNIM.toArray(new Integer[0])[i];
                            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + nimMahasiswa);
                        }
                    }
                    break;
                case 3:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada mahasiswa dalam daftar.");
                    } else {
                        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                        int nimHapus = scanner.nextInt();

                        Iterator<Mahasiswa> iteratorMahasiswa = daftarMahasiswa.iterator();
                        Iterator<Integer> iteratorNIM = daftarNIM.iterator();
                        while (iteratorMahasiswa.hasNext() && iteratorNIM.hasNext()) {
                            Mahasiswa mahasiswa = iteratorMahasiswa.next();
                            int nimMahasiswa = iteratorNIM.next();
                            if (nimMahasiswa == nimHapus) {
                                iteratorMahasiswa.remove();
                                iteratorNIM.remove();
                                System.out.println("Mahasiswa dengan NIM " + nimHapus + " telah dihapus.");
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
