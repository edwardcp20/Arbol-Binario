/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author edward
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol BTree = new Arbol();
        BTree.Insertar(100);
        BTree.Insertar(90);
        BTree.Insertar(110);
        BTree.Insertar(85);
        BTree.Insertar(95);
        BTree.Insertar(105);
        BTree.Insertar(115);
        BTree.Insertar(105);
        BTree.Insertar(92);
        BTree.Inorden();
        System.out.println(BTree.ExisteR(95));
    }
    
}
