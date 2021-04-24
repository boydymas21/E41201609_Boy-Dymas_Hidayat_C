package TugasTelevisi;

//Owner : BOY
public class User {
    
    
    public static void main(String[] args) {
        ModernTV user = new ModernTV("Panasonic, 21 inch", 10);
        String[] channels = {
            "RCTI", "INDOSIAR", "TV ONE", "NET TV", "MNC TV", "ANTV", "LATIVI",
            "SPACETOON", "INEWS", "NHK"
        };   
        System.out.println("Pak Lukman membeli televisi : " + user.description);
        
        user.getChannel();
        user.setChannels(channels);
        user.setChannelActive(5);
        user.setChannelActive(2);
        user.setVolume(30);
        user.setChannelActive(6);
        
        user.setModusTampilan(ModernTV.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(250);
        user.setModusTampilan(ModernTV.Televisi);
        user.getModusTampilan();
        
        user.openCD();
        user.setDiscTray("Midsommar");
        user.openCD();
    }
}
