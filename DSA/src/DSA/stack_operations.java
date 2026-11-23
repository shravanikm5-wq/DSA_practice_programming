package DSA;

public class stack_operations {


	
	int[] stack;
	int top;
	//Creation
	public stack_operations(int s) {
	stack=new int[s];
	top=-1;
	}
	//isempty
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==stack.length-1;
	}
	//Insertion or push
	void push(int value) {
		if(isFull()) {
		System.out.println("Stack is full");
	}
	else{
	stack[++top]=value;
	System.out.println("The value"+value+ "is inserted");
	}
	}
	//pop
	void pop() {
		if(isEmpty()) {
			System.out.println("the Stack is empty");
		}else {
			int value=stack[top];
			System.out.println("The value " + value+" is deleted");
		}
	}
	//peek
	void peek() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
		}
		else {
			System.out.println("the value at the top is"+stack);
		}
	}
	//delete stack
	void delete() {
		stack=null;
		System.out.println("stack is deleted");	
	}
	public static void main(String[] args) {
		stack_operations st=new stack_operations(5);
	 st.push(10);
	 st.push(20);
	 st.push(30);
	 st.push(40);
	 st.push(50);
	 st.push(60);
	 System.out.println(st.isEmpty());
	 System.out.println(st.isFull());
	 st.peek();
	 st.pop();
	 st.peek();
	 st.pop();
	 st.delete();
	}
	}


