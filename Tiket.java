package org.example.tugas4;

public interface Tiket {
    String getNama();
    String getNomerHp();
    String getTtl();
    String getEmail();
    String getPassword();
    void setNama(String nama);
    void setNomerHp(String nomerHp);
    void setTtl(String ttl);
    void setEmail(String email);
    void setPassword(String password);

    void register();
}
