
public class Test {

	public static void main(String[] args) {
		Cookie tempCookie=null;
		Cookie prot=new CoconutCookie();
		CookieMachine cm=new CookieMachine(prot);//设置原型
		for(int i=0;i<100;i++){
			tempCookie=cm.makeCookie();//通过复制原型返回多个cookie
		}
	}

}
