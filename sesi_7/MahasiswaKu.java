public class MahasiswaKu {

    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("20220040053");
        m.setName("ujang solihin");
        m.setClas(22);

        System.err.println(m.getNim());
        System.err.println(m.getName());
        System.err.println(m.getClas());
    }

}
