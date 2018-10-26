package pruebabdxml;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement 
public class Usuarios {
    List <Usuario> Usuarios;
    
    
    public void setUsuarios (List<Usuario> Usuarios){
        this.Usuarios=Usuarios;
    }
    
    public void add (Usuarios Usuario){
        
        this.Usuarios.add(Usuario);
    }
    
}
