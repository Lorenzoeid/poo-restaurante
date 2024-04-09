package principal;
import javax.swing.*;
import model.Empresa;
import model.Restaurante;
/**
 *
 * @author 1072419633
 */
public class Principal {
    public static void main (String[]args){
        Empresa empresa= new Empresa();
        empresa.leitura();
        empresa.imprimir();
        
        Restaurante restaurante = new Restaurante();
        restaurante.leitura();
        restaurante.imprimir();
    }
}
