package com.artemis;

import com.artemis.interfaces.EntityObserver;
import com.artemis.interfaces.Renderable;

public class Renderer implements EntityObserver, Renderable
{
        private World world;

        protected final void setWorld(World world)
        {
                this.world = world;
        }
        
        @Override
        public void added( Entity e )
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void changed( Entity e )
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void deleted( Entity e )
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void enabled( Entity e )
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void disabled( Entity e )
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void render()
        {
                // TODO Auto-generated method stub
                
        }
        
}
