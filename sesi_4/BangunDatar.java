class BangunDatar {
    public void gambar() {
        System.out.println("Menggambar sebuah bangun datar");
    }
}

class Lingkaran extends BangunDatar {
    @Override
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }

    public void gambar(int jariJari) {
        System.out.println("Menggambar lingkaran dengan jari-jari " + jariJari);
    }
}

class Main {
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar();
        BangunDatar lingkaran = new Lingkaran();

        bangun.gambar();       // Output: Menggambar sebuah bangun datar
        lingkaran.gambar();      // Output: Menggambar lingkaran
        ((Lingkaran) lingkaran).gambar(5);  // Output: Menggambar lingkaran dengan jari-jari 5
    }
}

