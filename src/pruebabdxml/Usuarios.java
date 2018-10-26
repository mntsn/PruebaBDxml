package pruebabdxml;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement 
public class Usuarios {
    List <Persona> Usuarios;
    
    @XmlElement (name = "Persona")
    public void setUsuarios (List<Persona> Usuarios){
        this.Usuarios=Usuarios;
    }
    
    public void add (Persona Persona){
        if (this.Usuarios == null){
            this.Usuarios = new ArrayList <Persona>();
        }
        
        this.Usuarios.add(Persona);
    }
    
}
