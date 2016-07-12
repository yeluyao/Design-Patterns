
public class AdapterTest2 {
	public static void main(String[] args){
		Souceable source1=new SourceSub1();
		Souceable source2=new SourceSub2();
		
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}
}
