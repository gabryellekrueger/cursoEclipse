package br.com.caelum.empresa;

import java.util.List;
import br.com.caelum.empresa.dao.GastoDAO;
import br.com.caelum.empresa.modelo.Gasto;

public class TesteDAO {
    public static void main(String[] args) {

        GastoDAO gastoDAO = new GastoDAO();
        List<Gasto> buscaTodos = gastoDAO.buscaTodos();
        
        for (Gasto gasto : buscaTodos) {
            System.out.println(gasto.getTipo());
        }
    }
}
