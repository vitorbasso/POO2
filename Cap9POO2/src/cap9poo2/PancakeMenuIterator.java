/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class PancakeMenuIterator implements Iterator{
    
    ArrayList<MenuItem> items;
    int position = 0;
    
    public PancakeMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }
    
    @Override
    public Object next(){
        MenuItem menuItem = this.items.get(this.position);
        this.position += 1;
        return menuItem;
    }
    
    @Override
    public boolean hasNext(){
        return !(this.position >= this.items.size());
    }
    
}
