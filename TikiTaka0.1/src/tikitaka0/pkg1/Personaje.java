/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikitaka0.pkg1;

/**
 *
 * @author Estudiantes
 */
public abstract class Personaje {
    
    int x;
    int y;
    int vida;
    public void dibujar (int x, int y){};
    public abstract void animacion();
    public void mover(){};
    public void atacar(Arma ar){};
    public void defender(Arma ar){};
    public void usarPoder(Poder po){};
    
    
}
