class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}

class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Hewan anjing = new Anjing();

        hewan.suara(); 
        anjing.suara(); 
    }
}
