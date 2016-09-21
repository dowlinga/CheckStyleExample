package checkstylepack;

public class CounterController {
	/**
	 * objects of IView and IModel
	 */
	private IView view;
	private IModel model;

	/**
	 * 
	 * @param pModel instance of IModel
	 */
	public CounterController(final IModel pModel) {
		this.model = pModel;
	}

	/**
	 * 
	 * @param pView instance of IView
	 */
	public final void setView(final IView pView) {
		this.view = pView;
	}
	
	/**
	 * 
	 * @param val an int for increment method
	 */
	public final void incr(final int val) {
		model.add(val);
		view.setResult(model.getValue());
	}
	
	/**
	 * decrement method with int as @param
	 */
	public final void decr(final int val) {
		model.sub(val);
		view.setResult(model.getValue());
	}
	
	/**
	 * reset method
	 * */
	public final void reset() {
		model.reset();
		view.setResult(model.getValue());
	}
}
