

/**
 * Interface for ForthStack
<p>
 * @author      
 * @version     1.0
 * @since       2017-05-22
<p>
 * This is the interface for ForthStack
 */
public interface Forth {

	/**
	 * Pops two values from the stack, adds them together, then pushes
	 * the result back onto the stack. Throws an exception if less than
	 * two items on the stack.
	 */
	public void add();
	
	/**
	 * Pops two values from the stack, subtracts the second popped from
	 * the first popped, then pushes the result back onto the stack. 
	 * Throws an exception if less than two items on the stack.
	 */
	public void sub();
	
	/**
	 * Pops two values from the stack, multiplies them together, then pushes
	 * the result back onto the stack. Throws an exception if less than two
	 * items on the stack.
	 */
	public void mult();
	
	/**
	 * Pops two values from the stack, divides the second popped by
	 * the first popped, then pushes the result back onto the stack. 
	 * Throws an exception if less than two items on the stack or if
	 * first popped is a zero.
	 */
	public void div();
	
	/**
	 * Peeks at the top value of the stack and pushes a copy of that
	 * value onto the stack.  Throws an exception if stack is empty
	 * or full.
	 */
	public void dup();
	
	/**
	 * Peeks at the top two values of the stack and pushes copies of those
	 * values in order onto the stack.  Throws an exception if stack does
	 * not have at least two items or if it doesn't have room for two more
	 * items.
	 */
	public void twoDup();
	
}
