package TugasTelevisi;

//Owner : BOY
public class Televisi {
    String description = "";
    int jmlChnnel = 0;
    String[] chnnls = new String[jmlChnnel];
    int chnnlsActive = 0;
    int vol = 0;
    
    Televisi(final String description, final int jmlChnnel) {
        this.description = description;
        this.jmlChnnel = jmlChnnel;
    }
    
    public void getDescription() {
        System.out.println("ini adalah TV dengan model "+description);
    }
    
    public void setChannels(String[] chnnls) {
        if (chnnls.length > this.jmlChnnel) {
            System.out.println("Maaf, Televisi hanya dapat menampung " + this.jmlChnnel + " channels");
        }else{
            this.chnnls = chnnls;
            System.out.println("Sistem berhasil Mengupdate Informasi");
        }
    }
    
    public void getChannel() {
        if (this.chnnls.length == 0) {
            System.out.println("Belum Ada channel");
        } else {
            String data = "";
            for(String chnnls : this.chnnls){
                data += chnnls + " ";
            }
            System.out.println("ada " + data + " channel tersedia");
        }
    }
    
    public void setChannelActive(int act) {
        this.chnnlsActive = act;
        int data = act;
        System.out.println("Active Channel : " + this.chnnls[act-1]);
    }
    
    public void setVolume(int vol) {
        System.out.println("Volume :  " + vol);
    }
}
