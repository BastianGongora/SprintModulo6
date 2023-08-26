package Modulo_6.modulo6.impl;

import Modulo_6.modulo6.interfaces.IUsuarioDAO;
import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {

    @Override
    public boolean registrar(Usuario usuario) {
        return false;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();


        return usuarios;

    }
}
