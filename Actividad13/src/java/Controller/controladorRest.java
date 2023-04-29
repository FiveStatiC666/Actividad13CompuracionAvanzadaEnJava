package Controller;

import Model.Persona;
import Repository.repositorioPersona;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladorRest 
{
    @Autowired
    private repositorioPersona RepositorioPersona;
    
    @RequestMapping(value="/personas", method=RequestMethod.GET)
    public ArrayList<Persona> getPersonaList()
    {
        List<Persona> personas = RepositorioPersona.findAllDb();
        ArrayList<Persona> personas_all= new ArrayList<Persona>(personas);
        return personas_all;
    }
    
    @RequestMapping(value="/personas/(id)", method=RequestMethod.GET)
    public Persona getPersona(@PathVariable("id") int id)
    {
        Persona persona=RepositorioPersona.findByIdDb(id);
        return persona;
    }
    
    @PutMapping("/personas/(id)")
    public boolean updatePersona(@PathVariable("id") int id, @RequestBody Persona persona)
    {
        boolean hayPersona;
        
        hayPersona=RepositorioPersona.updateByIdDb(id,persona);
        if(hayPersona==false)
        {
            RepositorioPersona.save(id,persona);
        }
        return hayPersona;
    }
    
    @GetMapping(value="/personas/nombre/(nombre)")
    public ArrayList<Persona> getPersonaListByNombre(@PathVariable("nombre") String texto)
    {
        String metodo="byNombre";
        List<Persona> personas=RepositorioPersona.findAllByTextoDb(texto,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/apellido/(apellido)")
    public ArrayList<Persona> getPersonaListByApellido(@PathVariable("apellido") String texto)
    {
        String metodo="byApellido";
        List<Persona> personas=RepositorioPersona.findAllByTextoDb(texto,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/edad/(edad)")
    public ArrayList<Persona> getPersonaListByEdad(@PathVariable("edad") int entero)
    {
        String metodo="byEdad";
        List<Persona> personas=RepositorioPersona.findAllByEnteroDb(entero);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/sexo/(sexo)")
    public ArrayList<Persona> getPersonaListBySexo(@PathVariable("sexo") String texto)
    {
        String metodo="bySexo";
        List<Persona> personas=RepositorioPersona.findAllByTextoDb(texto,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/estatura/(estatura)")
    public ArrayList<Persona> getPersonaListByEstatura(@PathVariable("estatura") double decimal)
    {
        String metodo="byEstatura";
        List<Persona> personas=RepositorioPersona.findAllByDecimalDb(decimal,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/peso/(peso)")
    public ArrayList<Persona> getPersonaListByPeso(@PathVariable("peso") double decimal)
    {
        String metodo="byPeso";
        List<Persona> personas=RepositorioPersona.findAllByDecimalDb(decimal,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/imc/(imc)")
    public ArrayList<Persona> getPersonaListByImc(@PathVariable("imc") double decimal)
    {
        String metodo="byImc";
        List<Persona> personas=RepositorioPersona.findAllByDecimalDb(decimal,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    @GetMapping(value="/personas/fecha/(fecha)")
    public ArrayList<Persona> getPersonaListByFecha(@PathVariable("fecha") String texto)
    {
        String metodo="byFecha";
        List<Persona> personas=RepositorioPersona.findAllByTextoDb(texto,metodo);
        ArrayList<Persona> personas_busqueda=new ArrayList<Persona>(personas);
        return personas_busqueda;
    }
    
    
}
