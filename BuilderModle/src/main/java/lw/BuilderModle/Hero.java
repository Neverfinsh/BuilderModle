package lw.BuilderModle;
/******
 * 建造者模式：用来构建复杂的的对象的模式；
 * 
 * @author Administrator
 *
 */


public class Hero {
	
//	基本的属性
	private String name;
	private int age;
	private HairType haitype;
	private Weapon weapon;

//	利用建造者模式进行开发
	
	public Hero(HeroBilder builder){
		
		this.age=builder.age;
		this.name=builder.name;
		this.haitype=builder.haitype;
		this.weapon=builder.weapon;
		
	}
	
	
//显示其部分的属性:tostring()的方法;
	
   public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public HairType getHaitype() {
		return haitype;
	}
	public Weapon getWeapon() {
		return weapon;
	}


	//	 静态内部类
	public  static class HeroBilder  {

		//建造者的相同的属性
		private String name;
		private int age;
		private HairType haitype;
		private Weapon weapon;

		//属性的构造	
		public HeroBilder(String hname){
			this.name=hname;
		}
		
		public HeroBilder(int age){
			this.age=age;
		}

		//给其他属性进行构造
	    public  HeroBilder addHair(Weapon Weapon1){
	    	this.weapon=Weapon1;
	    	return this;
	    }
	    
	    //属性机构	    	    
		//给其他属性进行构造
	    public  HeroBilder addHair(HairType type){
	    	this.haitype=type;
	    	return this;
	    }
	    
	    //属性的值，武器的属性
	    public  HeroBilder addWeap(Weapon weapen){
	    	this.weapon=weapen;
	    	return this;
	    }

	    /****
	     * 放回一个对象的值；方法
	     * @return
	     */
		public Hero build() {
			// TODO Auto-generated method stub
			return new Hero(HeroBilder.this);
		}
		
		/****
		 * 输出对象的值
		 */
	    
	    	
	}
}
