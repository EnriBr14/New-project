package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroD {
    private Map<Long, Usuario> empleados = new HashMap<>();
    private Map<Long, List<Auto>> autosUsuario = new HashMap<>();

    //1.- Registro de ususarios
    public void agregarUsuario(Usuario usuarioRe) {
        //Verificar que el usuario a registrar no exista
        for(Usuario user : empleados.values()){
            if(user.getTelefono().equals(usuarioRe.getTelefono())){
                throw new IllegalArgumentException("Empleado ya registrado");
            }
        }
        empleados.put(usuarioRe.getId(), usuarioRe);
    }

    //2.- Registro de autos por ususarios
    public void registrarAuto(Auto autoRe) {
        //Verificar la existencia del empleado mediante el atributo de usuarioId
        //Mediante el operador NOT "!"
        if(!empleados.containsKey(autoRe.getUsuarioId())){
            throw new IllegalArgumentException("Usuario no registrado");
        }
        //Mediante computeIfAbsent
        autosUsuario.computeIfAbsent(autoRe.getUsuarioId(), f -> new ArrayList<>()).add(autoRe);
    }

    //3.- Listar autos por cada usuario registrado
    //Usar getOrDefolt
    public List<Auto> listarAutosPU(Long userId) {
        return new ArrayList<>(autosUsuario.getOrDefault(userId, new ArrayList<>()));
    }


}
