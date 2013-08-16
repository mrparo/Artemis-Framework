package com.artemis;

import java.util.HashMap;

import com.artemis.interfaces.EntityObserver;
import com.artemis.interfaces.Renderable;
import com.artemis.render.Renderer;

public abstract class RenderSystem implements EntityObserver, Renderable
{
        private final int systemIndex;
        
        private World world;
        
        private final Renderer renderer;

        public RenderSystem(Renderer renderer)
        {
                this.renderer = renderer;
                systemIndex = SystemIndexManager.getIndexFor(this.getClass());
        }
        
        protected final void setWorld(World world)
        {
                this.world = world;
        }
        
        @Override
        public abstract void added( Entity e );

        @Override
        public abstract void changed( Entity e );

        @Override
        public abstract void deleted( Entity e );

        @Override
        public abstract void enabled( Entity e );

        @Override
        public abstract void disabled( Entity e );

        @Override
        public abstract void render();
        
        protected final int getSystemIndex()
        {
                return this.systemIndex;
        }
        
        /**
         * Used to generate a unique bit for each system.
         * Only used internally in EntitySystem.
         */
        private static class SystemIndexManager {
                private static int INDEX = 0;
                private static HashMap<Class<? extends RenderSystem>, Integer> indices = new HashMap<Class<? extends RenderSystem>, Integer>();
                
                private static int getIndexFor(Class<? extends RenderSystem> es){
                        Integer index = indices.get(es);
                        if(index == null) {
                                index = INDEX++;
                                indices.put(es, index);
                        }
                        return index;
                }
        }
}
