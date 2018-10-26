package pruebabdxml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;


public class PruebaBDxml {
     public static void main(String[] args) {
         ArrayList <Usuario> listaGente = new ArrayList(); //Array no sirve
             Usuario user1 = new Usuario ("jose","fsededf.es","Bami3","bami3");
             Usuario user2 = new Usuario ("pedro","fsdf.es","Bami4","bami6");
             listaGente.add(user1);
             listaGente.add(user2);//no he encontrado manera de imprimir este en xml
         try{
             JAXBContext contexto = JAXBContext.newInstance(user1.getClass());// por que user1?
             File file = new File ("parking.xml");
             Marshaller marshaller = contexto.createMarshaller();
             marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
             marshaller.marshal(user1, file);//como imprimir toda la lista?
             
         } 
         catch (javax.xml.bind.JAXBException ex) {
             java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE,null,ex);
         } 
        
         
    }
    
}
