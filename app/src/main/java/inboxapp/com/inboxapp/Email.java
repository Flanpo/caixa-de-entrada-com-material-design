package inboxapp.com.inboxapp;

/**
 * Created by Jelsafa on 03/03/2017.
 */

public class Email {

    private String Remetente;
    private String Titulo;
    private String Corpo;
    private int Perfil;

    public Email() {
    }

    public Email(String remetente, String titulo, String corpo, int perfil) {
        Remetente = remetente;
        Titulo = titulo;
        Corpo = corpo;
        Perfil = perfil;
    }

    public String getRemetente() {
        return Remetente;
    }

    public void setRemetente(String remetente) {
        Remetente = remetente;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCorpo() {
        return Corpo;
    }

    public void setCorpo(String corpo) {
        Corpo = corpo;
    }

    public int getPerfil() {
        return Perfil;
    }

    public void setPerfil(int perfil) {
        Perfil = perfil;
    }
}
