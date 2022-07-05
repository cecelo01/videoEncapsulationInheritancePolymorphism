/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public abstract class Pessoa {
    
    //Atributes
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;
    
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }


    @Override
    public String toString() {
        return "Pessoa " + "nome= " + nome + ", sexo= " + sexo + ", idade= " + idade + ", experiencia= " + experiencia;
    }

    protected void ganharXp(){
        this.setExperiencia(this.getExperiencia()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
     
}
