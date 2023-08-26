package Modulo_6.modulo6.interfaces;



import Modulo_6.modulo6.models.Usuario;

import java.util.List;

public interface IUsuarioDAO {

    public boolean registrar(Usuario usuario);
    public List<Usuario> listarUsuarios();
}

