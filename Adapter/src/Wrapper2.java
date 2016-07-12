/**
 * 接口的适配器模式
 * 有时候我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法，而在某些情况下我们
 * 只需要实现其中的某一些方法就可以了，为了解决这个问题，引入接口的适配器模式
 * 借助一个抽象类，该抽象类实现了接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联系
 * 我们只需要写一个类继承该抽象类，重写我们需要的方法就可以了*/
public abstract class Wrapper2 implements Souceable {

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

}
