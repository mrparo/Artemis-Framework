package com.artemis.render;


public interface Renderer
{
        /**
         * Performs task of drawing {@link Drawable} onto the screen.
         * 
         * @param drawable the Drawable to draw.
         */
        void draw(Drawable drawable);
}
