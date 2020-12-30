package com.open.design.strategy;

/**
	 * 角色基类
 * @author Administrator
 *
 */
public class AbsRole {
	
	IWeapon mWeapon;//每个角色有武器

	public AbsRole(IWeapon mWeapon) {
		super();
		this.mWeapon = mWeapon;
	}

	public IWeapon getWeapon() {
		return mWeapon;
	}

	public void setWeapon(IWeapon mWeapon) {
		this.mWeapon = mWeapon;
	}
	
	public void performAttack()
	{
		this.mWeapon.attack();
	}
	
	//骑士(使用刀剑)
	public static class Knight extends AbsRole
	{

		public Knight(IWeapon mWeapon) {
			super(mWeapon);
		}
	}
	
	//农民领袖
	public static class FarmerLeader extends AbsRole
	{
		public FarmerLeader(IWeapon mWeapon) {
			super(mWeapon);
		}
	}
	
	//...其它角色
}
