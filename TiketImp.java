package org.example.tugas4;

public class TiketImp implements Tiket{

    private String nama;
    private String nomerHp;
    private String ttl;
    private String email;
    private String password;

    @Override
    public String getNama(){
        return nama;
    }
    @Override
    public String getNomerHp(){
        return nomerHp;
    }
    @Override
    public String getTtl(){
        return ttl;
    }
    @Override
    public String getEmail(){
        return email;
    }
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public void setNomerHp(String nomerHp){
        this.nomerHp = nomerHp;

    }
    @Override
    public void setTtl(String ttl){
        this.ttl = ttl;
    }
    @Override
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public void setPassword(String password){
        this.password = password;

    }

    public void register(){
        if(this.nomerHp.isEmpty()){
            System.out.println("Registrasi Gagal. Nomer hp kosong");
        } else if (this.nomerHp.isEmpty() || this.nama.isEmpty() || this.ttl.isEmpty() || this.email.isEmpty() || this.password.isEmpty() || this.nomerHp == null || this.nama == null || this.ttl == null || this.email == null || this.password== null) {
            System.out.println("Registrasi Gagal. Tolong lengkapi data! ");
        }else{
            System.out.println("Registrasi Sukses");

        }


    }

}
