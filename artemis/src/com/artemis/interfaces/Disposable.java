package com.artemis.interfaces;

/**
 * Any class that needs to have a dispose method should implement this interface.
 * 
 * @author Paro
 *
 */
public interface Disposable
{
        /**
         * Performs tasks associated with freeing, releasing, or resetting resources.
         */
        void dispose();
}
