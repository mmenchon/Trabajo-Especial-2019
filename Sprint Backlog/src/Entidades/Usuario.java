package Entidades;

public  abstract class Usuario {
    String nombre ;
     String email;
     String contrasenia;
     boolean loged;

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

    public boolean isLoged() {
        return loged;
    }

    public void signIn(String email, String password) {
        if(this.email.equals(email) && this.contrasenia.equals(password)) {
            setLoged(true);
        }
    }

    public void signUp(String email, String password, String name) {
        this.contrasenia = password;
        this.nombre = name;
        this.email = email;
    }

    public void setLoged(boolean loged) {
        this.loged = loged;
    }
    // public String verRanking(Ciudad :Ciudad)  hacer
}
