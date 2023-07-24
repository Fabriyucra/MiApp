package ar.edu.unlam.tallerweb1.delivery;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ControladorRegistracion {
    public ModelAndView registrarUsuario(String mail, String password) {
        ModelMap model = new ModelMap();
        String viewName = "";

        if(esValido(mail)) {
            model.put("msg", "Registro exitoso");
            viewName = "login";
        }else{
            model.put("msg", "Registro fallido");
            viewName = "registro-usuario";
        }
        return new ModelAndView(viewName, model); // viewModel es una variable que va contener el nombre de la vista a usar segun las condiciones del controller
    }

    private boolean esValido(String mail) {
        return mail.contains("@") && mail.endsWith(".com");
    }

    public ModelAndView registrarme() {
        return new ModelAndView("registro-usuario");
    }
}
