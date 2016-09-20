package checkstylepack;

public class CounterModel implements IModel {
	
	private int data;

	public CounterModel() {
		data = 0;
	}
	
	@Override
	public final int getValue() {
		return data;
	}

	@Override
	public final void add(final int val) {
		data += val;
	}

	@Override
	public final void sub(final int val) {
		data -= val;
	}

	@Override
	public final void reset() {
		data = 0;
	}
	
}
