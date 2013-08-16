package com.artemis.systems;

/**
 * Any class that needs to have a process method should implement this interface.
 * 
 * @author Paro
 *
 */
public interface Processable
{
        /**
         * Method invocation indicating implemented tasks should be performed.
         */
        void process();
}
