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

    public void signUp(Usuario user) {
        this.users.add(user);
        ((Cuadra) ((Vecino)user).getCuadra()).addVecino((Vecino) user);
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
