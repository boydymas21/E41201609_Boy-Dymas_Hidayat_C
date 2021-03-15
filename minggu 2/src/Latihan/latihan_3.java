package latihan;

class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        
        this.judul = judul;
        this.jumlah = jumlah;
        
    }
    
    public void showInfoBuku() {
        
        System.out.println("Informasi Buku");
        System.out.println("Judul\t: " + judul);
        System.out.println("Jumlah\t: " + jumlah);
        
    }
    
}

public class latihan_3 {
    public static void main(String[] args) {
        
        buku b1 = new buku();
        b1.setInfoBuku("JAVA TUTORIAL", 200);
        b1.showInfoBuku();
        
    }
}
