package ar.edu.unlam.tallerweb1.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ServicioRegistracionTest {
    private ServicioRegistracion servicioRegistracion = new ServicioRegistracion();//intanceo una variable que contiene los servicios para poder usarlos
    private String mail;
    private String password;

    @Test
    public void alIngresarUnCorreoValidoMeDevuelveVerdadero(){
        Boolean esValido = servicioRegistracion.esValido("fabri@gmail.com");
        entoncesMiCorreo(esValido);
    }
    @Test
    public void alIngresarCredencialesValidasMePuedoRegistrarExitosamente(){
    dadQueTengoCredencialesValidas();
    Boolean registroExitoso =  cuandoMeRegistro(this.mail, this.password);
    entoncesEs(registroExitoso);
    }

    private void entoncesEs(Boolean registroExitoso) {
        assertThat(registroExitoso).isTrue();
    }

    private Boolean cuandoMeRegistro(String mail, String password) {
        return this.servicioRegistracion.registrarUsusario(mail, password);
    }


    private void entoncesMiCorreo(Boolean esValido) {
        assertThat(esValido).isTrue();
    }

    private void dadQueTengoCredencialesValidas() {
        this.mail = "fabri@gamil.com";
        this.password = "sabee";
    }

}
