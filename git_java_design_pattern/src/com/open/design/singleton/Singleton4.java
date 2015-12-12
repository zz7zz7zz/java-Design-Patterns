package com.open.design.singleton;

/**
 *  懒汉式方式3
 * @author Administrator
 *
 */
public class Singleton4 {
	
	private static volatile Singleton4 INSTANCE = null;
	
	// Private constructor suppresses 
    // default public constructor
    private Singleton4() {}
 
    //thread safe and performance  promote 
    public static  Singleton4 getInstance() 
    {
        if(INSTANCE == null)
        {
             synchronized(Singleton4.class)
             {
                 //when more than two threads run into the first null check same time, to avoid instanced more than one time, it needs to be checked again.
                 if(INSTANCE == null)
                 { 
                     INSTANCE = new Singleton4();
                  }
              } 
        }
        return INSTANCE;
    }
    
 }
