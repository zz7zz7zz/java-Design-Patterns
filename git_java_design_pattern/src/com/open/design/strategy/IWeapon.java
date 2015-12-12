package com.open.design.strategy;


public interface IWeapon {
	
		void attack();
	
		//枪
		public static class Gun implements IWeapon
		{

			@Override
			public void attack() {
				System.out.print("I am gun, now i attack !\n");
				
			}
			
		}
		
		//刀剑
		public static class Sword implements IWeapon
		{

			@Override
			public void attack() {
				System.out.print("I am Sword, now i attack !\n");
				
			}
			
		}
		
		//斧头
		public static class Axe implements IWeapon
		{

			@Override
			public void attack() {
				System.out.print("I am Axe, now i attack !\n");
				
			}
			
		}
}
