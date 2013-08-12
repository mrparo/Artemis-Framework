package com.artemis;
import java.util.HashMap;

/**
 * Barebone entity system. It is recommended that you use the other provided
 * entity system implementations.
 * 
 * @author MrParo
 *
 */
public abstract class EntitySystem implements EntityObserver {
        private final int systemIndex;
        
        protected World world;

        private boolean passive;
        
        /**
         * 
         * 
         */
        public EntitySystem()
        {
                systemIndex = SystemIndexManager.getIndexFor(this.getClass());
        }
        
        /**
         * Called before processing of entities begins. 
         */
        protected abstract void begin();
        
        /**
         * Called after the processing of entities ends.
         */
        protected abstract void end();
        

        /**
         * Override to implement code that gets executed when processors are initialized.
         */
        protected abstract void initialize();

        /**
         * Override to implement code that gets executed during processing.
         */
        public abstract void process();

        /**
         * Will check if the entity is of interest to this processor.
         * @param e entity to check
         */
        protected abstract void check(Entity e);
        
        @Override
        public abstract void added(Entity e);
        
        @Override
        public abstract void changed(Entity e);
        
        @Override
        public abstract void deleted(Entity e);
        
        @Override
        public abstract void disabled(Entity e);
        
        @Override
        public abstract void enabled(Entity e);
        

        protected final void setWorld(World world) {
                this.world = world;
        }
        
        public boolean isPassive() {
                return passive;
        }

        /**
         * 
         * 
         * @param passive State for system.
         */
        public void setPassive(boolean passive) {
                this.passive = passive;
        }
        
        protected final int getSystemIndex()
        {
                return this.systemIndex;
        }
        
        /**
         * Used to generate a unique bit for each processor.
         * Only used internally in EntityProcessor.
         */
        private static class SystemIndexManager {
                private static int INDEX = 0;
                private static HashMap<Class<? extends EntitySystem>, Integer> indices = new HashMap<Class<? extends EntitySystem>, Integer>();
                
                private static int getIndexFor(Class<? extends EntitySystem> es){
                        Integer index = indices.get(es);
                        if(index == null) {
                                index = INDEX++;
                                indices.put(es, index);
                        }
                        return index;
                }
        }

}
