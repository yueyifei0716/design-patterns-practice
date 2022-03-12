package Factory;

public abstract class Printer {
	protected boolean isSingleSided = true;

	public Printer(){}

	public Printer(boolean isSingleSided){
		this.isSingleSided = isSingleSided;
	}

	void print() {}
}
