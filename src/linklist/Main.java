/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author afonso
 */
public class Main {
    
    public static void main(String[] args) {
        LinkList lista = new LinkList<Integer>();
        
        lista.insereInicio(23);
        lista.insereFinal(43);
        lista.insereFinal(98);
        
        
        
        lista.removeInicio();
        
        
        
        lista.insereFinal(43);
        lista.insereFinal(98);
        
        lista.exibeLista();
    }
    
    
    
}
