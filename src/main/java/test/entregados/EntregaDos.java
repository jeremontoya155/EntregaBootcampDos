

package test.entregados;

import java.util.Scanner;


public class EntregaDos {

    public static void main(String[] args) {
       
        //Dejo un ingreso generado por fuerza bruta para la prueba y otro sin 
        //double precio=cargarNumero("Ingrese  el precio que desee:");
        //double iva=cargarNumero("Ingrese  el porcentaje que desee para el iva:");
        double precio=10;
        double precio_final=retornarFinal(precio,19);
        System.out.println("El precio final mas iva es de:"+precio_final);
    }
    
    public static  double retornarFinal(double precio,double valor_iva){
        
        return precio+(precio*(valor_iva/100));
    }
    
    //Funcion para el ingreso dinamico
    public static double cargarNumero(String texto){
    
        Scanner sn=new Scanner(System.in);
        System.out.println(texto);
        double retorno=sn.nextDouble();
        return retorno;
    }
}
