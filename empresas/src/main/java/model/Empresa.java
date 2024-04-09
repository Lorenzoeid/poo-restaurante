package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Empresa {
    private String nome, endereço, cidade, estado;
    private int cep, fone;
    
    public Empresa(){
        this("","","","",0,0);
    }
    public Empresa(String nome, String endereço, String cidade, String estado, int cep, int fone){
        setNome(nome);
        setEnd(endereço);
        setCid(cidade);
        setEst(estado);
        setCep(cep);
        setFone(fone);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEnd(){
        return endereço;
    }
    public void setEnd(String endereço){
        this.endereço = endereço;
    }
    public String getCid(){
        return cidade;
    }
    public void setCid(String cidade){
        this.cidade = cidade;
    }
    public String getEst(){
        return estado;
    }
    public void setEst(String estado){
        this.estado = estado;
    }
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public int getFone(){
        return fone;
    }
    public void setFone(int fone){
        this.fone = fone;
    }
    public void leitura(){
        setNome(JOptionPane.showInputDialog("Digite o nome"));
        setEnd(JOptionPane.showInputDialog("Digite o endereço"));
        setCid(JOptionPane.showInputDialog("Digite a cidade"));
        setEst(JOptionPane.showInputDialog("Digite o estado"));
        setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o cep")));
        setFone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"O nome, endereço, cidade, estado, cep e telefone são, respectivamente: "
                + getNome()+" "+getEnd()+" "+getCid()+" "+getEst()+" "+getCep()+" "+getFone());
    }
}
