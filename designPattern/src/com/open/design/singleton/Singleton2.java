package com.open.design.singleton;

/**
 *  饿汉方式
 * @author Administrator
 *
 */
public class Singleton2 {
	
	private static volatile Singleton2 INSTANCE = null;
	
	// Private constructor suppresses 
    // default public constructor
    private Singleton2() {}
 
    //thread safe and performance  promote 
    public static  Singleton2 getInstance() 
    {
        if(INSTANCE == null)
        {
             synchronized(Singleton2.class)
             {
                 //when more than two threads run into the first null check same time, to avoid instanced more than one time, it needs to be checked again.
                 if(INSTANCE == null)
                 { 
                     INSTANCE = new Singleton2();
                  }
              } 
        }
        return INSTANCE;
    }
    
 }
