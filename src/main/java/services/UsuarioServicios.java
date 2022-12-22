package services;

import models.ModeloUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UsuarioRepositories;

import java.util.ArrayList;

@Service
public class UsuarioServicios {
    @Autowired
    UsuarioRepositories usuarioRepositories;

    public ArrayList<ModeloUsuario> obtenerUsuarios(){
       return (ArrayList<ModeloUsuario>) usuarioRepositories.findAll();
    }
    public  ModeloUsuario guardarUsuario(ModeloUsuario usuario){
        return usuarioRepositories.save(usuario);
    }
}
