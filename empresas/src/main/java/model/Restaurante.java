package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Restaurante extends Empresa {
    private String comida;
    private double preço;
    
    public Restaurante(){
        this("",0);
    }
    public Restaurante(String comida, double preço){
        setComida(comida);
        setPreço(preço);
    }
    public String getComida(){
        return comida;
    }
    public void setComida(String comida){
        this.comida = comida;
    }
    public double getPreço(){
       return preço;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }
    public void leitura(){
        super.leitura();
        setComida(JOptionPane.showInputDialog("Digite a comida"));
        setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço")));
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A comida e seu preço são, respectivamente: "
                +getComida()+" "+getPreço());
    }
}
