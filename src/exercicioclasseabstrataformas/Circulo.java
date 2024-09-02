/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioclasseabstrataformas;

/**
 *
 * @author Computador
 */
public class Circulo extends Formas{
    
    private Double raio;

    public Circulo() {
    }

    public Circulo(Double raio, Color cor) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        Double pi = 3.14;
        return pi * (raio * raio);
    }
    
}
