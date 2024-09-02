/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioclasseabstrataformas;

/**
 *
 * @author Computador
 */
public abstract class Formas {
    private Color cor;

    public Formas() {
    }

    public Formas(Color cor) {
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public abstract Double area();
 
}
