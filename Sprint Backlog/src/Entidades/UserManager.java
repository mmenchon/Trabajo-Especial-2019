package Entidades;

import ciudad.Cuadra;

import java.util.Vector;

public class UserManager {
    private Vector<Usuario> users;


    public UserManager() {
        this.users = new Vector<Usuario>();
    }

    public static boolean isLogged(Usuario user) {
        return user.isLogged();
    }

    public boolean signIn(Usuario user) {
        boolean registred = false;
        for (int i=0; i<this.users.size(); i++) {
            if (((Usuario) this.users.get(i)).email.equals(user.email)) {
                if( ((Usuario) this.users.get(i)).contrasenia.equals(user.email)) {
                    registred = true;
                    this.users.get(i).setLoged(true);
                    break;
                }
            }
        }
        return registred;
    }

    public void signUp(Vecino user) {
        this.users.add(user);
        user.getManzana().addVecino(user);
    }
    
    public void signUp(Empleado user) {
        this.users.add(user);
    }

    public void logOut(Usuario user) {
        for (int i=0; i<this.users.size(); i++) {
            if (((Usuario) this.users.get(i)).email.equals(user.email)) {
                this.users.get(i).setLoged(false);
                break;
            }
        }
    }

}
