package Overriding;

//Owner : BOY
public class B extends A {
     public void tampilkanKeLayar() {
        super.tampilkanKeLayar();
        System.out.println("Method milik Class B dipanggil");
    }
}