package com.artemis.systems;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.EntityProcessor;
import com.artemis.utils.ImmutableBag;

/**
 * A system that processes entities at a interval in milliseconds.
 * A typical usage would be a collision system or physics system.
 * Other usage would be to regenerate ammo or health at certain intervals, no need
 * to do that every game loop, but perhaps every 100 ms or every second.
 * 
 * @author Arni Arent
 *
 */
public abstract class IntervalEntityProcessingSystem extends EntityProcessor {
        /** The interval. */
        private float interval;
        
        /** The accumulator. */
        private float acc;

        
	public IntervalEntityProcessingSystem(Aspect aspect, float interval) {
		super(aspect);
		this.interval = interval;
	}
	
        @Override
        protected boolean checkProcessing() {
                acc += world.getDelta();
                if(acc >= interval) {
                        acc -= interval;
                        return true;
                }
                return false;
        }
	
	/**
	 * Process a entity this system is interested in.
	 * @param e the entity to process.
	 * @param delta the delta time
	 */
	protected abstract void process(Entity e, float delta);

	
	@Override
	protected final void processEntities(ImmutableBag<Entity> entities) {
		for (int i = 0, s = entities.size(); s > i; i++) {
			process(entities.get(i), interval);
		}
	}

}

