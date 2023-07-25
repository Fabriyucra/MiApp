package ar.edu.unlam.tallerweb1.delivery;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;

public class ControladorRegistracionTest {
    private ControladorRegistracion controladorRegistracion = new ControladorRegistracion();

    @Test
    public void alIngresarCredencialesCorrectasDeUnUsusarioQueNoExisteMeRegistraYLlevaAlLogin(){
        //Correo y una contraseña valida

        //Preparacion
        dadoQueNoExisteElUsuario();
        //Ejecucion
        ModelAndView mav = cuandoMeRegistro("fabri@gmail.com", "sabee");

        //Verificacion
        entoncesElRegistroEsExitosio(mav);
    }

    @Test
    public void alIngresarCredencialesInvalidasNoMePermitaRegistrarme(){
        //Preparacion
        dadoQueNoExisteElUsuario();
        //Ejecucion
        ModelAndView mav = cuandoMeRegistro("fabri", "sabee");
        //Verificacion
        entoncesElRegistroFalla(mav);
    }
    @Test
    public void alIngresarARegistrameMeMuestraLaPantallaDeRegistro(){
        //Preparacion
        dadoQueNoExisteElUsuario();
        //Ejecucion
        ModelAndView mav = cuandoMeQuieroRegistrar();
        //Verificacion
        entoncesMeLlevaALaPantallaDeRegistracion(mav);
    }

    private void entoncesMeLlevaALaPantallaDeRegistracion(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("registro-usuario");
    }

    private ModelAndView cuandoMeQuieroRegistrar() {
        return controladorRegistracion.registrarme();
    }

    private void dadoQueNoExisteElUsuario() {
    }
    private ModelAndView cuandoMeRegistro(String mail, String password) {
        return controladorRegistracion.registrarUsuario(mail, password);//es cuando se usa el controller, desde aca voy a crear el controller
    }
    private void entoncesElRegistroEsExitosio(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("login");
        assertThat(mav.getModel().get("msg")).isEqualTo("Registro exitoso");
    }
    private void entoncesElRegistroFalla(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("registro-usuario"); //falla y nos mantenemos en la misma view de registracion
        assertThat(mav.getModel().get("msg")).isEqualTo("Registro fallido"); //enviamos como mensaje que el registro fallo "getModel().get("msg")" es lo que devolveria el mensaje, literal el texto
    }

   



}
