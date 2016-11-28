/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator.eventHandling;

import simulator.entities.Entity;

/**
 *
 * @author Roman Vais
 */
public interface Event {

    public String getType();
    public Entity getSource();
    public int getTimestamp();
    

}
