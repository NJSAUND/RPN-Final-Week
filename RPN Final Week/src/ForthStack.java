

/**
 * Forth simulator
<p>
 * @author      
 * @version     2.0
 * @since       2017-05-22
<p>
 * This interface implements Forth and creates a basic
 * Forth simulator.
 */
public class ForthStack extends ArrayStack implements Forth {

	/**
	 * Pops two values from the stack, adds them together, then pushes the result 
	 * back onto the stack. Throws an exception if less than two items on the stack.
	 */
	public void add() {
		int count = this.count();
		if (count < 2) {
			// Throw an exception if there are less than two items.
			throw new RuntimeException("LESS THAN 2 ITEMS!");
		}
		else {
			// Pop the first two elements off of the stack
			double secondValue = this.pop();
			double firstValue = this.pop();
			// Add the two values together
			double returnValue = firstValue + secondValue;
			// Take negative sign off of zero result
			if (returnValue == -0.0d) {
				returnValue = 0.0d;
			}
			// Push the result back onto the stack
			this.push(returnValue);
		}
	}

	/**
	 * Pops two values from the stack, subtracts the second from the first, then pushes 
	 * the result back onto the stack. Throws an exception if less than two items on the 
	 * stack.
	 */
	public void sub() {
		// Check to see if there are at least two items on the stack
		int count = this.count();
		if (count < 2) {
			// Throw an exception if there are less than two items.
			throw new RuntimeException("LESS THAN TWO ITEMS!");
		}
		else {
			// Pop the first two elements off of the stack
			double secondValue = this.pop();
			double firstValue = this.pop();
			// Subtract the second value from the first value
			double returnValue = firstValue - secondValue;
			// Take negative sign off of zero result
			if (returnValue == -0.0d) {
				returnValue = 0.0d;
			}
			// Push the result back onto the stack
			this.push(returnValue);
		}
	}
	
	/**
	 * Pops two values from the stack, multiplies them, then pushes the result back 
	 * onto the stack. Throws an exception if less than two items on the stack.
	 */
	public void mult() {
		// Check to see if there are at least two items on the stack
		int count = this.count();
		if (count < 2) {
			// Throw an exception if there are less than two items.
			throw new RuntimeException("LESS THAN 2 ITEMS!");
		}
		else {
			// Pop the first two elements off of the stack
			double secondValue = this.pop();
			double firstValue = this.pop();
			// Multiply the two values
			double returnValue = firstValue * secondValue;
			// Take negative sign off of zero result
			if (returnValue == -0.0d) {
				returnValue = 0.0d;
			}
			// Push the result back onto the stack
			this.push(returnValue);
		}
	}
	
	/**
	 * Pops two values from the stack, divides the second by the first, then pushes 
	 * the result back onto the stack. Throws an exception if less than two items on the 
	 * stack or if the first number is a zero.
	 */
	public void div() {
		// Check to see if there are at least two items on the stack
		int count = this.count();
		if (count < 2) {
			// Throw an exception if there are less than two items.
			throw new RuntimeException("LESS THAN 2 ITEMS!");
		}
		else {
			// Pop the first two elements off of the stack
			double secondValue = this.pop();
			double firstValue = this.pop();
			// Multiply the two values
			double returnValue = firstValue / secondValue;
			// Take negative sign off of zero result
			if (returnValue == -0.0d) {
				returnValue = 0.0d;
			}
			// Push the result back onto the stack
			this.push(returnValue);
		}
	}
	
	/**
	 * Peeks at the top value of the stack and pushes a copy of that
	 * value onto the stack.  Throws an exception if stack is empty
	 * or full.
	 */
	public void dup() {
		// Get the size of the array
		int size = this.getSize();
		// See if the stack is empty
		if (this.isEmpty()) {
				throw new RuntimeException("STACK EMPTY!");
		}
		// See if the stack is full
		else if (this.count() == size) {
				throw new RuntimeException("OVERFLOW!");
			}
		else {
			// Perform the dup by peeking then pushing
			double value = this.peek();
			this.push(value);			
		}
	}
	
	/**
	 * Peeks at the top two values of the stack and pushes copies of those
	 * values in order onto the stack.  Throws an exception if stack does
	 * not have at least two items or if it doesn't have room for two more
	 * items.
	 */
	public void twoDup() {
		// Get the size of the array
		int size = this.getSize();
		// Get the number of elements in the array
		int currentCount = this.count();
		// See if the stack is empty
		if (currentCount < 2) {
			// Less than two items on the stack, so throw an exception
			throw new RuntimeException("LESS THAN 2 ITEMS!");
		}
		// See if the stack can hold two items
		else if ((size - currentCount) < 2) {
				throw new RuntimeException("OVERFLOW!");
		}
		else {
			// Perform the dup by peeking twice, then pushing twice
			double firstValue = this.peek();
			double secondValue = this.peek(1);
			this.push(secondValue);	
			this.push(firstValue);
		}
	}
	
}
