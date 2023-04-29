package Repository;

import Model.Persona;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class Repositorio 
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    public void save(int id, Persona persona)
    {
        String sql="INSERT INTO personas(id,nombre,apellido,edad,sexo,estatura,peso,imc,fecha) VALUES(?,?,?,?,?,?,?,?,?)";
        
        jdbcTemplate.update(sql,id,persona.getNombre(),persona.getApellido(),persona.getEdad(),persona.getSexo(),persona.getEstatura(),persona.getPeso(), persona.getImc(), persona.getFecha());
        
    }
    
    
    public List<Persona>findAllDb()
            {
                String sql="SELECT * FROM personas";
                List<Persona> personas=new ArrayList<>();
                
                List<Map<String, Object>> dbs=jdbcTemplate.queryForList(sql);
                for(Map<String,Object> db:dbs)
                {
                    Persona personadb=new Persona();
                    personadb.setId((int)db.get("id"));
                    personadb.setNombre((String)db.get("nombre"));
                    personadb.setApellido((String)db.get("apellido"));
                    personadb.setEdad((int)db.get("edad"));
                    personadb.setSexo((String)db.get("sexo"));
                    personadb.setEstatura((double)db.get("estatura"));
                    personadb.setPeso((double)db.get("peso"));
                    personadb.setImc((double)db.get("imc"));
                    personadb.setFecha((String)db.get("fecha"));
                }
                
                return personas;
            }
    
    public Persona findByIdDb(int id)
    {
        String sql="SELECT * FROM personas WHERE id=?";
        Map<String,Object> resultado=jdbcTemplate.queryForMap(sql, id);
        Persona persona= new Persona((int)resultado.get("id"), (String)resultado.get("nombre"), (String)resultado.get("apellido"), (int)resultado.get("edad"), (String)resultado.get("sexo"), (double)resultado.get("estatura"), (double)resultado.get("peso"), (double)resultado.get("imc"), (String)resultado.get("fecha"));
        return persona;
    }
    
    public boolean updateByIdDb(int id, Persona persona)
    {
        String sql="UPDATE personas SET nombre=?, apellido=?, edad=?, sexo=?, estatura=?, peso=?, imc=?, fecha=? WHERE id=?";
        
        int rowsAffected=jdbcTemplate.update(sql, persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getSexo(), persona.getEstatura(), persona.getPeso(), persona.getImc(), persona.getFecha());
        if (rowsAffected==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
