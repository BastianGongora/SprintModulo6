package Modulo_6.modulo6.services;
import Modulo_6.modulo6.models.Capacitacion;
import Modulo_6.modulo6.models.Usuario;
import Modulo_6.modulo6.repository.ICapacitacionRepository;
import Modulo_6.modulo6.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepository;


    public List<Usuario> listarUsuarios(){
        List<Usuario> lusuarios = iUsuarioRepository.findAll();
        return lusuarios;
    }

    public Usuario buscarUsuario(String rut){
        Usuario usuario = iUsuarioRepository.findUsuarioByRut(rut);
        return usuario;
    }

    public void eliminarUsuario(String rut) {
        iUsuarioRepository.delete(buscarUsuario(rut));
    }

    public boolean anadirUsuario(Usuario usuario){
        if(iUsuarioRepository.save(usuario)!=null){
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getApellido());
            System.out.println(usuario.getCorreo());
            System.out.println(usuario.getRol());
            return true;
        }else{
            return false;
        }
    }
}
