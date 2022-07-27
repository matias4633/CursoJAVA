
package datos;

import domain.PersonaDTO;
import java.util.List;


public interface PersonaDao {
    
    public List<PersonaDTO> selecionar();
    
    public int insertar(PersonaDTO persona);
    
    public int eliminar(PersonaDTO persona);
    
    public int actualizar(PersonaDTO persona);
    
}
