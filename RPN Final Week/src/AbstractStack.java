

/**
 * Pure abstract stack class
 <p>
 * @author      
 * @version     1.0
 * @since       2017-05-22
 <p>
 * This class implements a pure abstract class that has no
 * implementation.
 */
public abstract class AbstractStack {
	/**
	 * This method pushes a double named item
	 * onto the stack.
	 * @param item Double value to be pushed
	 */
	public abstract void push(double item);
	
	/**
	 * This method will pop an item from
	 * the stack.
	 * @return Popped value as a double.
	 */
	public abstract double pop();
	
	/**
	 * This method will test it the stack
	 * is empty.
	 * @return True if stack is empty. False if not.
	 */
	public abstract boolean isEmpty();
	
	/**
	 * This method will return the value
	 * of the item at the specified stack
	 * location.
	 * @return Double value at the location.
	 */
	public abstract double peek();
	
	/**
	 * Empties the stack
	 */
	public abstract void clear();

}
