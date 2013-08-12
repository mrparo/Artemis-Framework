package com.artemis.render;

import com.artemis.interfaces.Disposable;
import com.artemis.interfaces.Renderable;

public interface RenderLayer extends Renderable, Disposable
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
