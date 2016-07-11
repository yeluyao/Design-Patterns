import java.util.List;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Builder builder=new Builder();
		builder.produceMailSender(5);
		builder.produceSmsSender(5);
		List<Sender> list=builder.getList();
		Iterator<Sender> iterator=list.iterator();
		while(iterator.hasNext()){
			iterator.next().Send();
		}
		
	}

}
