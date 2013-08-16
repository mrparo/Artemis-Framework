package com.artemis.render;

import com.artemis.interfaces.Disposable;

public interface RenderLayer extends Drawable, Disposable
{
        /**
         * Performs initialization.
         */
        void init();
        
        /**
         * Returns true if the layer is enabled, false otherwise.
         */
        boolean isEnabled();
        
        /**
         * Set if the layer should be enabled or not.
         */
        void setEnabled( boolean enabled );
}
