package TugasTelevisi;

//Owner : BOY
public class ModernTV extends Televisi {
    public ModernTV(String description,int jmlChnnels){
        super(description, jmlChnnels);
    }
    
    static String TELETEXT = "Teletext";
    static String Televisi = "Televisi";
    
    public void setModusTampilan(String out){
        ModernTV.TELETEXT = out;
    }
    
    public void getModusTampilan(){
        System.out.println("Modus Tampilan : "+TELETEXT);
    }
    
    public void setHalamanTeletext(int hal){
        System.out.println("Berpindah ke halaman teletext "+hal);
    }
    
    String cd = "";
    public void setDiscTray(String disc){
        this.cd = disc;
    }
    
    public void openCD(){
        if(cd.equals("")){
            System.out.println("Tidak ada CD dalam tray");
        }else{
            System.out.println("Memutar film " + cd);
        }
    }
}
