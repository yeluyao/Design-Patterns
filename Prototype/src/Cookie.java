/**
 * 原型模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 * 在Java中，复制对象是通过clone()实现的
 * 原型模式多用于创建复杂的或者耗时的实例，因为在这种情况下，复制一个已经存在的实例使程序运行更高效；
 * 或者创建值相等，只是命名不一样的同类数据。*/
public class Cookie implements Cloneable {
	public Object clone() throws CloneNotSupportedException{
		return (Cookie) super.clone();
	}
}
