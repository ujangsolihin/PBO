public class Perhitungan {
    public int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Perhitungan perhitungan = new Perhitungan();
        System.out.println("Luas persegi dengan sisi 5: " + perhitungan.hitungLuas(5));
        System.out.println("Luas persegi panjang dengan panjang 3 dan lebar 4: " + perhitungan.hitungLuas(3, 4));
    }
}
