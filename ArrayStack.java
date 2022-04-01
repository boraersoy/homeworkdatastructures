import java.util.Arrays;

public class ArrayStack<T> {
	private T[] Stack;
	private final int MAX_CAPACITY = 10000;
	private boolean initialized = false;
	private int TopIndex;
	public static final int DEFAULT_CAPACITY = 31;

	ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	public ArrayStack(int capacity) {
		//Checkcapacity
		T[] tempstack = (T[]) new Object[capacity];
		Stack = tempstack;
		TopIndex = -1;
		initialized = true;
	}
	public void push(T entry) {
		//checkinitialization
		//ensureCapacity
		Stack[TopIndex + 1] = entry;
		TopIndex++;
		
	}
	public void pop() {
		//checkinitaliztion
		Stack[TopIndex] = null;
		TopIndex--;
	}
	private void ensureCapacity() {
		if (TopIndex > Stack.length - 1) {
			int newLength = Stack.length * 2;
			T[] tempArray = null;
			//for (int i = 0; )
}
	}
	public T returnStackItems(int number) {
		return Stack[number];
	}
}