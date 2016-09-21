package checkstylepack;

public class CounterModel implements IModel {
	
	private int data;
	
	/**
	 * default constructor for CounterModel class
	 */
	public CounterModel() {
		data = 0;
	}
	
	/**
	 * getter that returns the data from CounterModel
	 */
	@Override
	public final int getValue() {
		return data;
	}
	
	/**
	 * add method that adds the @param "val" to the current data
	 */
	@Override
	public final void add(final int val) {
		data += val;
	}
	
	/**
	 * subtract method that subtracts "val" from data
	 */
	@Override
	public final void sub(final int val) {
		data -= val;
	}
	
	/**
	 * method that resets data to 0
	 */
	@Override
	public final void reset() {
		data = 0;
	}
	
}
