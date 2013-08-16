package com.artemis.render;


public interface Renderer
{
        /**
         * Performs task of drawing {@link Spatial} onto the screen.
         * 
         * @param spatial the Spatial to draw.
         */
        void draw(Spatial spatial);
}
