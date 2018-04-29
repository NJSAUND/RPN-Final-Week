

/**
 * Test class for ForthStack
<p>
 * @author     
 * @version     2.0
 * @since       2017-05-22
<p>
 * This class will run a series of tests on the ForthStack
 * class and test functionality.
 */
public class TestForthStack {
	
	/**
	 * This is the main entry point for the class.
	 * @param args Unused.
	 */
	public static void main(String[] args) {	
		
		
		// Test ArrayStack for a negative number size
		// Should print an error
		System.out.print("Testing a stack size of -1: ");
		try {
			ForthStack negativeStack = new ForthStack();
			negativeStack.ArrayClass(-1);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}


		// Test ArrayStack for a zero size
		// Should print an error
		System.out.print("Testing a stack size of 0: ");
		try {
			ForthStack zeroStack = new ForthStack();
			zeroStack.ArrayClass(0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// Create a legitimate stack of size 5
		// Should NOT throw an exception
		System.out.print("Testing a stack size of 5: ");
		ForthStack testStack = new ForthStack();
		testStack.ArrayClass(5);
		System.out.println("PASS!");

		// Push five items to the stack
		try {
			System.out.print("Pushing 1.1111 to the stack: ");
			testStack.push(1.1111);
			System.out.println("PASS!");
			System.out.print("Pushing 2.2222 to the stack: ");
			testStack.push(2.2222);
			System.out.println("PASS!");
			System.out.print("Pushing 3.3333 to the stack: ");
			testStack.push(3.3333);
			System.out.println("PASS!");
			System.out.print("Pushing 4.4444 to the stack: ");
			testStack.push(4.4444);
			System.out.println("PASS!");
			System.out.print("Pushing 5.5555 to the stack: ");
			testStack.push(5.5555);	
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Show the count.  Should be 5
		System.out.println("Number of elements: " + testStack.count());

		// Attempt to push a sixth item.  Should throw an exception.
		try {
			System.out.print("Attempting to push a 6.666 to the stack: ");
			testStack.push(6.6666);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}

		// Show the count and test isEmpty.  Should return 5 and false.
		System.out.println("Number of elements: " + testStack.count());
		System.out.println("Is empty: " + testStack.isEmpty());
		
		// Pop the stack five times.
		try {
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should pop 5.5555
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should pop 4.4444
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should pop 3.3333
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should pop 2.2222
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should pop 1.1111
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Show count and empty.  Should be 0 and true
		System.out.println("Number of elements: " + testStack.count());
		System.out.println("Is empty: " + testStack.isEmpty());

		// Attempt to pop a sixth time.  Should throw an exception.
		try {
			System.out.print("Popping this value from the stack: ");
			testStack.pop();
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}

		// Push five items to the stack.
		try {
			System.out.print("Pushing 1.1111 to the stack: ");
			testStack.push(1.1111);
			System.out.println("PASS!");
			System.out.print("Pushing 2.2222 to the stack: ");
			testStack.push(2.2222);
			System.out.println("PASS!");
			System.out.print("Pushing 3.3333 to the stack: ");
			testStack.push(3.3333);
			System.out.println("PASS!");
			System.out.print("Pushing 4.4444 to the stack: ");
			testStack.push(4.4444);
			System.out.println("PASS!");
			System.out.print("Pushing 5.5555 to the stack: ");
			testStack.push(5.5555);	
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Get the number of elements.  Should be 5
		System.out.println("Number of elements: " + testStack.count());
		// This should return false
		System.out.println("Is empty: " + testStack.isEmpty());
		// Peek each value
		try {
			System.out.print("The value at the top is ");
			System.out.println(testStack.peek(0)); // Should be 5.5555
			System.out.print("The value at position 1 is ");						
			System.out.println(testStack.peek(1)); // Should be 4.4444
			System.out.print("The value at position 2 is ");
			System.out.println(testStack.peek(2)); // Should be 3.3333
			System.out.print("The value at position 3 is ");
			System.out.println(testStack.peek(3)); // Should be 2.2222
			System.out.print("The value at position 4 is ");
			System.out.println(testStack.peek(4)); // Should be 1.1111
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}

		// Attempt to peek at position five. Should throw an exception.
		try {
			System.out.print("The value at position 5 is " );
			testStack.peek(5);
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}

		// Attempt to peek at a negative position. Should throw an exception.
		try {
			System.out.print("The value at position -1 is " );
			testStack.peek(-1);
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}


		// Check the default constructor
		System.out.print("Creating a default stack: ");
		testStack = new ForthStack();
		testStack.ArrayClass();
		System.out.println("PASS!");
		
		// Push three items onto the stack
		try {
			System.out.print("Pushing 1.1111 to the stack: ");
			testStack.push(1.1111);
			System.out.println("PASS!");
			System.out.print("Pushing 2.2222 to the stack: ");
			testStack.push(2.2222);
			System.out.println("PASS!");
			System.out.print("Pushing 3.3333 to the stack: ");
			testStack.push(3.3333);
			System.out.println("PASS!");
			System.out.println("Number of elements: " + testStack.count()); // Should be 3
			System.out.println("Is empty: " + testStack.isEmpty()); // Should be false
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// Testing peek without a parameter
		try {
			System.out.print("Testing peek without a parameter.  Peek value is ");
			System.out.println(testStack.peek()); // Should return 3.3333
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should return 3.3333
			// Testing peek without a parameter again
			System.out.print("Testing peek without a parameter.  Peek value is ");
			System.out.println(testStack.peek()); // Should return 2.2222
			// Pop the stack clear
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should return 2.2222
			System.out.print("Popping this value from the stack: ");
			System.out.println(testStack.pop()); // Should return 1.1111
			// Show count and test isEmpty.  Should show 0 and true.
			System.out.println("Number of elements: " + testStack.count());
			System.out.println("Is empty: " + testStack.isEmpty());
			// Test peek without a parameter again.  Should throw an exception.
			System.out.print("Testing peek without a parameter.  Peek value is ");
			testStack.peek();
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// Testing the clear method
		// Push 3 items onto the stack
		try {
			System.out.print("Pushing 1.1111 to the stack: ");
			testStack.push(1.1111);
			System.out.println("PASS!");
			System.out.print("Pushing 2.2222 to the stack: ");
			testStack.push(2.2222);
			System.out.println("PASS!");
			System.out.print("Pushing 3.3333 to the stack: ");
			testStack.push(3.3333);
			System.out.println("PASS!");
			System.out.println("Number of elements: " + testStack.count()); // Should be 3
			System.out.println("Is empty: " + testStack.isEmpty()); // Should be false
			// Now clear the stack
			System.out.print("Clearing the stack: ");
			testStack.clear();
			System.out.println("PASS!");
			System.out.println("Number of elements: " + testStack.count()); // Should be 0
			System.out.println("Is empty: " + testStack.isEmpty()); // Should be true 
			// Check a clear when the stack is empty
			System.out.print("Clearing the stack: ");
			testStack.clear();
			System.out.println("PASS!");
			System.out.println("Number of elements: " + testStack.count()); // Should be 0
			System.out.println("Is empty: " + testStack.isEmpty()); // Should be true
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// Testing the add method
		// First create a new instance of ForthStack
		System.out.print("Creating a new default stack: ");
		ForthStack myStack = new ForthStack();
		myStack.ArrayClass();
		System.out.println("PASS!");
		// Add two elements together.  Should throw an exception.
		try {
			System.out.print("Adding: ");
			myStack.add();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push an item onto the stack
		try { 
			System.out.print("Pushing 10.0 to the stack: ");
			myStack.push(10.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Add two elements together.  Should throw an exception.
		try {
			System.out.print("Adding: ");
			myStack.add();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push another item onto the stack
		try {
			System.out.print("Pushing 55.5 to the stack: ");
			myStack.push(55.5);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Add the two elements together.
		try {
			System.out.print("Adding: ");
			myStack.add();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 65.5
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
			
		// Testing the sub method
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Subtract two elements.  Should throw an exception.
		try {
			System.out.print("Subtracting: ");
			myStack.sub();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push an item onto the stack
		try {
			System.out.print("Pushing 4.0 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Subtract two elements.  Should throw an exception.
		try {
			System.out.print("Subtracting: ");
			myStack.sub();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push another item onto the stack
		try {
			System.out.print("Pushing 3.5 to the stack: ");
			myStack.push(3.5);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Subtract the two elements.
		try {
			System.out.print("Subtracting: ");
			myStack.sub();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 0.5
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items onto the stack
		try {
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
			System.out.print("Pushing 3.5 to the stack: ");
			myStack.push(3.5);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Subtract the two elements.
		try {
			System.out.print("Subtracting: ");
			myStack.sub();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be -7.5
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items onto the stack
		try {
			System.out.print("Pushing 4.0 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
			System.out.print("Pushing 5.5 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Subtract the two elements.
		try {
			System.out.print("Subtracting: ");
			myStack.sub();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 0.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// Test the mult method
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply two elements.  Should throw an exception.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push an item onto the stack
		try {
			System.out.print("Pushing 4.0 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply two elements.  Should throw an exception.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result. Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push another item onto the stack
		try {
			System.out.print("Pushing 5.0 to the stack: ");
			myStack.push(5.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply the two elements.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 20.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items onto the stack
		try {
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
			System.out.print("Pushing 5.0 to the stack: ");
			myStack.push(5.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply the two elements.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be -20.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items onto the stack
		try {
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
			System.out.print("Pushing -5.0 to the stack: ");
			myStack.push(-5.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply the two elements.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 20.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items onto the stack
		try {
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
			System.out.print("Pushing 0.0 to the stack: ");
			myStack.push(0.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Multiply the two elements.
		try {
			System.out.print("Multiplying: ");
			myStack.mult();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 0.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}

		// Test the div method
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide two elements.  Should throw an exception.
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.  Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push one item to the stack
		try {
			System.out.print("Pushing 12.0 to the stack: ");
			myStack.push(12.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide two items.  Should throw an exception.
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.  Should not execute.
			System.out.println(myStack.peek());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push another item onto the stack
		try {
			System.out.print("Pushing 4.0 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide the two elements
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 3.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items to the stack
		try {
			System.out.print("Pushing -12.0 to the stack: ");
			myStack.push(-12.0);
			System.out.println("PASS!");
			System.out.print("Pushing 4.0 to the stack: ");
			myStack.push(4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide the two elements
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be -3.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items to the stack
		try {
			System.out.print("Pushing 12.0 to the stack: ");
			myStack.push(12.0);
			System.out.println("PASS!");
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide the two elements
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be -3.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push two items to the stack
		try {
			System.out.print("Pushing -12.0 to the stack: ");
			myStack.push(-12.0);
			System.out.println("PASS!");
			System.out.print("Pushing -4.0 to the stack: ");
			myStack.push(-4.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Divide the two elements
		try {
			System.out.print("Dividing: ");
			myStack.div();
			// Peek the result.
			System.out.println(myStack.peek()); // Should be 3.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
								
		// dup method testing
		// Clear the stack
		try {
			System.out.print("Clearing the stack: ");
			myStack.clear();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Try to dup.  Should throw an exception
		try {
			System.out.print("Duplicating: ");
			myStack.dup();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push three items onto the stack, filling it
		try {
			System.out.print("Pushing 1.0 to the stack: ");
			myStack.push(1.0);
			System.out.println("PASS!");
			System.out.print("Pushing 2.0 to the stack: ");
			myStack.push(2.0);
			System.out.println("PASS!");
			System.out.print("Pushing 3.0 to the stack: ");
			myStack.push(3.0);
			System.out.println("PASS!");
			System.out.println("Number of elements: " + myStack.count());
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Try to dup.  Should throw an exception
		try {
			System.out.print("Duplicating: ");
			myStack.dup();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Pop the stack, creating room for the dupe
		try {
			System.out.print("Popping this value from the stack: ");
			System.out.println(myStack.pop()); // Should be 3.0
			// Show the top of the stack.
			System.out.print("The value at the top of the stack is: ");
			System.out.println(myStack.peek()); // Should be 2.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Perform the dupe
		try {
			System.out.print("Duplicating: ");
			myStack.dup();
			System.out.println("PASS!");
			// Show the top of the stack.
			System.out.print("The value at the top of the stack is: ");
			System.out.println(myStack.peek()); // Should be 2.0
			// Show the next element in the stack.
			System.out.print("The value below the top of the stack is: ");
			System.out.println(myStack.peek(1)); // Should be 2.0
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		// twoDup method testing
		// Create a new stack of four elements
		System.out.print("Creating a stack size of 4: ");
		ForthStack dupStack = new ForthStack();
		dupStack.ArrayClass(4);
		System.out.println("PASS!");
		// Try twoDup.  Should throw an exception
		try {
			System.out.print("Duplicating twice: ");
			dupStack.twoDup();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push one item onto the stack
		try {
			System.out.print("Pushing 1.0 to the stack: ");
			dupStack.push(1.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Try twoDup.  Should throw an exception
		try {
			System.out.print("Duplicating twice: ");
			dupStack.twoDup();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Push another item onto the stack
		try {
			System.out.print("Pushing 2.0 to the stack: ");
			dupStack.push(2.0);
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Perform the twoDup
		try {
			System.out.print("Duplicating twice: ");
			dupStack.twoDup();
			System.out.println("PASS!");
			// Print the values of the stack
			for (int i=0; i<4; i++) {
				System.out.print("The value at position " + i + " on the stack is: ");
				System.out.println(dupStack.peek(i));
			}
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		// Stack is full at this point.
		// Try to twoDup again.  Should throw an exception
		try {
			System.out.print("Duplicating twice: ");
			dupStack.twoDup();
			System.out.println("PASS!");
		}
		catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
	}
}