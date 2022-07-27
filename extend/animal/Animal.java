package extend.animal;

public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事を開始しました");
	}

	public abstract void cry();
}
