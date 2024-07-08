package org.example.tugas4;

public class Coba {

    public static void main(String[] args) {
        Tiket tiket1 = new TiketImp();

        tiket1.setNama("Budi");
        tiket1.setNomerHp("081234567");
        tiket1.setEmail("budi@email.com");
        tiket1.setTtl("Denpasar/12/12/2000");
        tiket1.setPassword("");

        tiket1.register();

    }
}
