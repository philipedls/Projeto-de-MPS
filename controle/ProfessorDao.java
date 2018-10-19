package controle;

import entidades.Usuario;
import interfaces.InterfaceProfessorDao;
import java.util.HashMap;
import java.util.Map;

public class ProfessorDao implements InterfaceProfessorDao {

    @Override
    public Map<String, Usuario> getAll() {
        return new HashMap<>();
    }
}
