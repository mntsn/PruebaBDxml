package pruebabdxml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.*;

@XmlType (propOrder={"nombre","email","aparcamiento","objetivo"})

@XmlRootElement
public class Persona {
    private String nombre;
    private String email;
    private String aparcamiento;
    private String objetivo;
    
    @XmlElement (name="Nombre")
    public String getNombre (){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    @XmlElement (name="Email")
    public String getEmail (){
        return email;
    }
    public void setEmail (String email){
        this.email=email;
    }
    
    @XmlElement (name="Aparcamiento")
        public String getAparcamiento (){
        return aparcamiento;
    }
    public void setAparcamiento (String aparcamiento){
        this.aparcamiento=aparcamiento;
    }
    
    @XmlElement (name="Objetivo")    
    public String getObjetivo (){
        return objetivo;
    }
    public void setObjetivo(String objetivo){
        this.objetivo=objetivo;
    }
    
    public Persona(String nombre,String email,String aparcamiento,String objetivo){
        super();
        this.nombre=nombre;
        this.email=email;
        this.aparcamiento=aparcamiento;
        this.objetivo=objetivo;
    }
    public Persona (){
        super ();
    }
   
}
