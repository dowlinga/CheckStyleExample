package checkstylepack;

/**
 * 
 * @author Logan Crowe, Edward Johnson, Anthony Do
 *
 */
public final class Main {
	
	/**
	 * 
	 */
	private Main() {
		
	}
	
	public static void main(final String[] args) {
		IModel model = new CounterModel();
		CounterController controller = new CounterController(model);
		IView view = new CounterView(model, controller);
		controller.setView(view);
	}

}
