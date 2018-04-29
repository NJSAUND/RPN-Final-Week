

/**
 * Stack class utilizing arrays
<p>

 * @version     2.0
 * @since       2017-05-22
<p>
 * This class implements a stack of doubles using arrays.  
 */
public class ArrayStack extends AbstractStack {
	private int size;			// Maximum size of the stack
	private int top; 			// Link to the top of the stack
	private double[] stack;		// The stack itself

	/**
	 * This method will create the stack if the size 
	 * parameter is a positive integer and shows an
	 * error message if it is not.
	 * @param size Integer size of the array.
	 */
	public void ArrayClass(int size)
	{
		// Check for a zero or a negative integer size
		if (size <= 0) {
			throw new RuntimeException("INVALID SIZE!");
		} 
		// Check for a non-integer size
		else if ((int)size != size) {
			throw new RuntimeException("INVALID SIZE!");
		}
		// Size is a positive integer
		else {
			this.size = size;
			// Create the stack
			stack = new double[size];
			// Top of the stack
			this.top = 0;
		}
	}
	
	/**
	 * This method will create stack of three if 
	 * the size parameter is not given.
	 */
	public void ArrayClass()
	{
		this.size = 3;
		// Create the stack
		stack = new double[size];
		// Top of the stack
		this.top = 0;
	}
	
	/**
	 * This method will push a item onto the stack.
	 * Returns an error message if unsuccessful.	
	 * @param 	item Double item to be pushed.
	 */
	public void push(double item)
	{
		// Check to see if the bounds have been exceeded
		if(top < size) {
			// Assign the value
			stack[top] = item;
			// Move the top pointer
			top++;
		}
		else {
				// Stack exceeds bounds.  Print error.
				throw new RuntimeException("OVERFLOW!");
		}
	}
	
	/**
	 * This method will test to see if the stack is
	 * empty.
	 * @return True if empty.  False if not.
	 */
	public boolean isEmpty()
	{
		// Return true if the top pointer is 0
		if (top == 0)
		{
			return true;
		}
		// Return false otherwise
		else
		{
			return false;
		}
	}

	/**
	 * This method will pop the stack if it is not
	 * empty.  If it is empty, it will print an error.
	 * @return poppedValue Double value that was popped.
	 */
	public double pop(){
		// Cannot pop if the stack is empty
		if (this.isEmpty())
		{
			// Throw exception if the stack is empty
			throw new RuntimeException("STACK EMPTY!");
		}
		else
		{
			// Get the value at the top of the stack
			double poppedValue = stack[top-1];
			// Clear the value
			stack[top-1] = 0.0d;
			// Move the pointer
			top--;
			return poppedValue;
		}
	}

	/**
	 * This method will return the value of the element
	 * requested.  If the requested element exceeds the
	 * length of the stack, an error will be returned.	
	 * @param n Integer value of requested element.
	 * @return Double value of the requested stack element.
	 */
	public double peek(int n) {
		if (n >= this.count()) {
			// The element requested doesn't exist
		throw new RuntimeException("DOES NOT EXIST!");
			}
		
		else if (this.isEmpty()) {
			// Stack is empty
			throw new RuntimeException("STACK EMPTY!");
		} 
		else if (n < 0) {
			throw new RuntimeException("INVALID ENTRY!");
		}
		else if (n == 0) {
			// Return the value of the element at the top
			return stack[top-1];
		}
		else
		{
				return stack[top-1-n];
		}
	}

	/**
  	 * This method will return the value of the top element
  	 * If the stack is empty, an exception is thrown.
 	 * @return Double value of the top stack element.
  	 */
	public double peek() {
		if (this.isEmpty()) {
			// Stack is empty
			throw new RuntimeException("STACK EMPTY!");
		}
		else
		{ 
			// Return the top stack element
			return stack[top-1];
		 } 
	}	
	
    /**
	 * Public accessor for the number of elements in
	 * the stack	
	 * @return Integer value of the number of elements
	 */
	public int count() {
		// Count is simply the top pointer
		return top;
	}

	/**
	 * This method will clear the stack.
	 */
	public void clear() {
		// As long as the stack is not empty, pop all the elements
		if (!this.isEmpty()) {
			for (int i = 0; i < this.count(); i++) {
				stack[i] = 0.0d;
			}
			this.top = 0;
		}
	}

	/**
	 * Public accessor for the maximum size of the stack
	 * @return Integer value of the size of the stack
	 */
	public int getSize() {
		return size;
	}
}
