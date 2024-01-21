class Hewan {

    String jenis;

    // Constructor kelas dasar
    public Hewan(String jenis) { this.jenis = jenis; }

    // Metode kelasa dasar
    void bersuara() { System.out.println("Sebuah hewan bersuara"); }
}

// Kelas turunan atau subclass
class Kucing extends Hewan {
    public Kucing(String jenis) { super(jenis); } // Memanggil constructor kelas dasar

    // Metode kelas turunan yang meng-overide metode kelas dasar

    @Override
    void bersuara() { System.out.println("Meow!"); }

    // Metode kelas turunan tambahan
    void tidur() { System.out.println("Kucing Tidur... "); }
}

class ContohPewarisan {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Kucing kucing = new Kucing("Persia");

        // Mengakses atribute dari kelas dasar
        System.out.println("Jenis kucing: " + kucing.jenis);

        // Memanggil metode darikelas turunan yang meng-overide mnetode kelas dasar
        kucing.bersuara();

        // Memanggil metode tambahan dari kelas turunan
        kucing.tidur();
    }
}