/* 
 * Copyright (C) 2017 Laboratory of Experimental Biophysics
 * Ecole Polytechnique Federale de Lausanne
 * 
 * Author: Marcel Stefko
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.epfl.leb.alica.controllers;

import ch.epfl.leb.alica.Controller;

/**
 * Abstract controller class to reduce boilerplate code.
 * @author Marcel Stefko
 */
public abstract class AbstractController implements Controller {

    /**
     * Current input setpoint value.
     */
    protected double setpoint = 0.0;

    /**
     * Maximal possible output value.
     */
    protected double maximum = 0.0;
    
    /**
     * Initialize the controller with a maximal output value.
     * @param maximum max output value
     */
    public AbstractController(double maximum) {
        this.maximum = maximum;
    }
    
    @Override
    public void setSetpoint(double new_setpoint) {
        setpoint = new_setpoint;
    }
    
    @Override
    public double getSetpoint() {
        return this.setpoint;
    }
    
}
