package Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.Serializable;

public class Persona 
{
    int id;
    String nombre;
    String apellido;
    int edad;
    String sexo;
    double estatura;
    double peso;
    double imc;
    String fecha;
    
    public Persona()
    {
        super();
    }
    
    public Persona(int id, String nombre, String apellido, int edad, String sexo, double estatura, double peso, double imc, String fecha)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.sexo=sexo;
        this.estatura=estatura;
        this.peso=peso;
        this.imc=imc;
        this.fecha=fecha;
    }
    
    public Persona(String nombre, String apellido, int edad, String sexo, double estatura, double peso, double imc, String fecha)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.sexo=sexo;
        this.estatura=estatura;
        this.peso=peso;
        this.imc=imc;
        this.fecha=fecha;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public String getSexo()
    {
        return sexo;
    }
    
    public double getEstatura()
    {
        return estatura;
    }
    
    public double getPeso()
    {
        return peso;
    }
    
    public double getImc()
    {
        return imc;
    }
    
    public String getFecha()
    {
        return fecha;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    public void setSexo(String sexo)
    {
        this.sexo=sexo;
    }
    
    public void setEstatura(double estatura)
    {
        this.estatura=estatura;
    }
    
    public void setPeso(double peso)
    {
        this.peso=peso;
    }
    
    public void setImc(double imc)
    {
        this.imc=imc;
    }
    
    public void setFecha(String fecha)
    {
        this.fecha=fecha;
    }
}
