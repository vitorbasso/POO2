/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap92poo2;
import java.util.Iterator;

/**
 *
 * @author vitor
 */
public class NullIterator implements Iterator{
    
    @Override
    public Object next(){
        return null;
    }
    
    @Override
    public boolean hasNext(){
        return false;
    }
    
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}
