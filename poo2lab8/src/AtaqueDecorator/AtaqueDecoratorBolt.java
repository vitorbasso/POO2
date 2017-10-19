/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtaqueDecorator;
import Ataque.AtaqueInterface;

/**
 *
 * @author vitor
 */
public class AtaqueDecoratorBolt extends AtaqueDecorator{
    public AtaqueDecoratorBolt(AtaqueInterface ataque){
        super(ataque, " de Eletricidade", Element.BOLT, 2);
    }
}
