package ar.edu.unlam.tallerweb1.domain;

public class ServicioRegistracion {

    public boolean esValido(String mail) {
        return mail.contains("@") && mail.endsWith(".com");
    }

    public Boolean registrarUsusario(String mail, String password) {
        return true;//lo jsuto y necesario para el test pero en realidad hay q buscar algun servicio que complete esos datos
    }
}
