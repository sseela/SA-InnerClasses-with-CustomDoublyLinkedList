
public class DoublyLinkedList {

	private int head;
	private int tail;
	private int length;
	  
	class Node {
		private int previousValue;
		private int nextValue;
		private int data;
		public int getPreviousValue() {
			return previousValue;
		}
		public void setPreviousValue(int previousValue) {
			this.previousValue = previousValue;
		}
		public int getNextValue() {
			return nextValue;
		}
		public void setNextValue(int nextValue) {
			this.nextValue = nextValue;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
