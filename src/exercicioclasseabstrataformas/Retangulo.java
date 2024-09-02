/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioclasseabstrataformas;

/**
 *
 * @author Computador
 */
public class Retangulo extends Formas{
    
    private Double altura;
    private Double largura;

    public Retangulo() {
    }

    public Retangulo(Double altura, Double largura, Color cor) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double area() {
        return altura * largura;
    }
    
}
