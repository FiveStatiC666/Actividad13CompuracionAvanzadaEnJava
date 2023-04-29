package Repository;

import Model.Persona;
import java.util.List;

public interface repositorioPersona 
{
    void save(int id, Persona persona);
    List<Persona> findAllDb();
    Persona findByIdDb(int id);
    boolean updateByIdDb(int id, Persona persona);
    
    List<Persona> findAllByTextoDb(String texto,String metodo);
    List<Persona> findAllByDecimalDb(double decimal, String metodo);
    List<Persona> findAllByEnteroDb(int entero);

}
