package lw.BuilderModle;


/**
 * Hello world!
 *
 */

/****
 * 建造模式的开发
 * @author Administrator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Hero hero=new Hero.HeroBilder("hello")
    	  .addHair(HairType.GREEN)
    	  .addWeap(Weapon.AXO)
    	  .build();
    	
    	System.out.println("测试 :"+hero.getHaitype());
    	
    }
}
