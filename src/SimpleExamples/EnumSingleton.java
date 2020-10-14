package SimpleExamples;
public class EnumSingleton {
	
	public static void main(String []args) {
		SingletonEnum senum1 = SingletonEnum.INSTANCE;
		senum1.show();
		SingletonEnum.RAJESH.show();
		
	}

}

enum SingletonEnum{
	RAJESH(10),
	INSTANCE(20);
	
	int value;
	
	SingletonEnum(int i) {
		this.value = i;
	}
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
	public void show() {
		System.out.println(" inside Show method of enum value - "+this.value+" - "+this);
	}
}