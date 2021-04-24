package Pewarisan;

//Owner : BOY
public class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B ();
        
        System.out.println("Super Class");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TambpilkanNilaiXY();
        
        System.out.println("Sub Class");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TambpilkanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}