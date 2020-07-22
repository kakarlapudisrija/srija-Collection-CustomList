package collection.list;
import java.util.Arrays;
public class Collection<T> {
	private Object custom_collection[];
	private int initial_capacity = 10;
	private int length = 0;
	public Collection() {
		custom_collection = new Object[initial_capacity];
		for (int i = 1; i <= 10; i++)
			custom_collection[length++] = i;
	}
	public int s() {
		return length;
	}
	public void allocateMemory() {
		int s = custom_collection.length + 5;
		custom_collection = Arrays.copyOf(custom_collection, s);
	}
	public void add(T data) {
		if (length >= custom_collection.length) {
			allocateMemory();
		}
		custom_collection[length++] = data;
	}
	public Object get(int ind) {
		if (ind >= 0 && ind < length)
			return custom_collection[ind];
		else
			throw new IndexOutOfBoundsException();
	}
	public Object remove(int ind) {
		if (ind >= 0 && ind < length) {
			Object element = custom_collection[ind];
			int in = custom_collection.length - (ind + 1);
			System.arraycopy(custom_collection, ind + 1, custom_collection, ind, in);
			length--;
			return element;
		} else
			throw new IndexOutOfBoundsException();
	}
	public void print() {
		for (int i = 0; i < custom_collection.length; i++) {
			System.out.println(custom_collection[i] + " ");
		}
	}
}