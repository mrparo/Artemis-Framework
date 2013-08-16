package com.artemis.render;


/**
 * Any class that needs to have a render method should implement this interface.
 * 
 * @author Paro
 *
 */
public interface Spatial
{
        /**
         * Performs task of drawing onto specified {@link Renderer}.
         * 
         * @param renderer the renderer to draw onto.
         */
        void draw(Renderer renderer);
}
