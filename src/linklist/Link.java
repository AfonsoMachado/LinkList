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
public class Link<T> {
    
    private T dado;

    public T getDado() {
        return dado;
    }
    private Link next;

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getNext() {
        return next;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
    
    
    
    
    
}
