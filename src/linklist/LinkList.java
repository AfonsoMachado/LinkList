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
public class LinkList<T> {
    
    private Link first;
    
    public boolean estaVazia() {
        return this.first == null;
    }

    public void insereInicio(T dado) {
        Link novo = new Link();
        novo.setDado(dado);
        novo.setNext(this.first);
        this.first = novo;
    }
    
    public Link removeInicio(){
        Link temp = this.first; 
        this.first = this.first.getNext(); 
        return temp;
    }
    
    public void exibeLista(){
        Link atual = this.first; 
        while(atual != null){
            System.out.println(atual.getDado());
            atual = atual.getNext(); 
        }
    }
    
    public Link buscarLista(T alvo){
        Link atual = this.first; 
        while(atual != null){
            if(atual.getDado() == alvo) 
                return atual;
            atual = atual.getNext(); 
        }
        return null;
    }
    
    public void insereFinal(T dado) {
        Link novo = new Link();
        novo.setDado(dado);
        Link atual = this.first; 
        while(atual != null){
            if(atual.getNext() == null){
                atual.setNext(novo);
                break;
            }
            atual = atual.getNext(); 
        }
        
    }
    
    public Link removeFinal() {
        Link atual = this.first; 
        while(atual != null){
            if(atual.getNext() == null) {
                Link temp = atual;
                atual = null;
                return temp;
            }
                
            atual = atual.getNext(); 
        }
        return null;
        
    }
    
}
