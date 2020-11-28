package dao;

import model.Triangulo;

/**
 *
 * @author Marcelo Saorim
 */
public class TrianguloDAO {
    
    public double areaTriangulo(Triangulo obj){
        double a = obj.getLadoA();
        double b = obj.getLadoB();
        double c = obj.getLadoC();
        
        double p = (a+b+c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
    
}
