
public class CookieMachine {
	private Cookie cookie;//cookie必须是可复制的
	public CookieMachine(Cookie cookie){
		this.cookie=cookie;
	}
	public Cookie makeCookie(){
		try{
			return (Cookie)cookie.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return null;
	}
}
