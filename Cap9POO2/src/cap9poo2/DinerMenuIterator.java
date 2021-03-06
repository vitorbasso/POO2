/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;
import java.util.Iterator;

/**
 *
 * @author vitor
 */
public class DinerMenuIterator implements Iterator{
    
    MenuItem[] items;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    
    @Override
    public Object next(){
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
    
    @Override
    public boolean hasNext(){
        return !(position >= items.length || items[position] == null);
    }
    
    @Override
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException ("You can`t remove an item until you`ve done at least one next()");
        }
        if(items[position - 1] != null){
            for(int i = position-1 ; i < (items.length -1); i++){
                items[i] = items[i+1];
            }
            items[items.length - 1] = null;
        }
    }
    
}
