/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3poo2;

/**
 *
 * @author vitor
 */
public class HouseBlend extends Beverage{
    
    public HouseBlend(){
        description = "HouseBlend";
    }
    
    @Override
    public double cost(){
        return 0.89;
    }
    
}
