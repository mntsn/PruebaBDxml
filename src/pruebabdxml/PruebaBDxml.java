package pruebabdxml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;
import java.util.ArrayList;


public class PruebaBDxml {
     public static void main(String[] args) {
            
            Persona persona1 = new Persona ("jose","fsededf.es","Bami3","bami3");
            Persona persona2 = new Persona ("pedro","fsdf.es","Bami4","bami6");
            Usuarios listaUsuarios = new Usuarios();
            listaUsuarios.add(persona1);
            listaUsuarios.add(persona2);
         try{
            JAXBContext contexto = JAXBContext.newInstance(Usuarios.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            File file = new File ("parking.xml");
            marshaller.marshal(persona1, file);//como imprimir toda la lista?
            marshaller.marshal(persona1, System.out); 
         } 
         catch (javax.xml.bind.JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE,null,ex);
         } 
        
         
    }
    
}
