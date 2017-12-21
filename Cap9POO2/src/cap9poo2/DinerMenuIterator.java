/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;

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
    
}
