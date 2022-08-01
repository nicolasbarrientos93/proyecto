
package com.porfo.grnbm.Interface;

import com.porfo.grnbm.Entity.Persona;
import java.util.List;


public interface IPersonaService {
     //Traer Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
