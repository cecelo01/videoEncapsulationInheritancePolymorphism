/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Usuario extends Pessoa{
    
    private String loguin;
    private int totAssistido;

    public Usuario(String loguin, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.loguin = loguin;
        this.totAssistido = 0;
    }

    @Override
    public String toString() {
        return "Usuario "+super.toString()+ " loguin= " + loguin + ", totAssistido= " + totAssistido;
    }
    
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
