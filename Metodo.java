/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Scanner;
import java.util.Stack;


public class Metodo {

    
    Scanner leer=new Scanner(System.in);
    //inicialiazamos la pila , que es de la clase stack
    Stack pila =new Stack();
    
    public static int tamano;
    //metodo
    public void tamaño(){
        System.out.println("ingrese la cantidad de datos de la pila");
        tamano=leer.nextInt();
        System.out.println("**************");
    }
    
    //metod que va permitir que se ingrese los datos que dice el tama;o 
    
    public void ingresoDatos(){
        while (pila.size()<tamano) {
         String a =null;
            System.out.println("ingrese el dato");
            //metodo push capturamos los datos
            pila.push(a=leer.next());
        }
        System.out.println(pila);
    }
    
    public void validar(){
        
        System.out.println("ingrese el dato a validar");
        //creamos una variagble de tipo objet
        Object a =pila.contains(leer.next());
        System.out.println(a);
    }
    
    public void mostrarElemento(){
        
        Object a =pila.lastElement();
        System.out.println(a);
    }
    
    public void EliminarUltimo(){
        //eliminando con la operacion pop
        Object a =pila.pop();
        System.out.println(a);
        System.out.println(pila);
    }
    
    public void vaciar(){
        pila.removeAllElements();
        System.out.println(pila);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodo met=new Metodo();
        met.tamaño();
        met.ingresoDatos();
       // met.validar();
       // met.mostrarElemento();
       // met.EliminarUltimo();
        met.vaciar();
        
    }
    
}
