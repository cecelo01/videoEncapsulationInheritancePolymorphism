/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Video implements AcoesVideo {

    // atributes
    private String titulo;
    private int avaliacao, curtida, visualizacoes;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.visualizacoes = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return "Video " + "titulo= " + titulo + ", avaliacao= " + avaliacao + 
                ", curtida= " + curtida + ", visualizacoes= " + visualizacoes +
                ", reproduzindo= " + reproduzindo;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtida(this.getCurtida()+1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova = (int) (this.getAvaliacao()+ avaliacao)/this.getVisualizacoes();
        this.avaliacao = nova;
    }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
}
