
package web.utp.interfaces;

import web.utp.modelo.UsuarioBean;

public interface UsuarioDAO{
    public UsuarioBean validar(String correo, String pssw);
}
