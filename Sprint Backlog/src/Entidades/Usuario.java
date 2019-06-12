package Entidades;

public  abstract class Usuario {
    String nombre ;
     String email;
     String contrasenia;
     boolean logged;

     public Usuario(String nombre ,String mail, String contrasenia) {
         this.nombre=nombre;
         this.email=mail;
         this.contrasenia =contrasenia;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isLogged() {
        return logged;
    }


    public void setLoged(boolean logged) {
        this.logged = logged;
    }
    // public String verRanking(Ciudad :Ciudad)  hacer
}
