package crircular_Linked_List;

public class Linear_Linked_List {
	Node front, rear;

	void create_List() {
		front = rear = null;
	}

	void insert_left(int data) {
		Node n = new Node(data);
		if (rear == null) {
			front = rear = n;
			rear.next = front;
		} else {
			n.next = front;// 1
			rear = n; // 2
			rear.next = front;
		}
		System.out.println(data + " inserted");
	}

	void delete_left() {

		if (front == null)
			System.out.println("\nList Empty");
		else {
			Node t = front;// 1
			if (front == rear) {
				front = rear = null;// 2
			} else
				front = front.next;
			System.out.println(t.data + " deleted");// 3
		}

	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (front == null) {
			front = rear = n;// first
			rear.next = front;
		} else {
			rear.next = n;// 1
			rear = n;// 2
			rear.next = front;
		}
		System.out.println(data + " inserted");
	}

	void delete_right() {

		if (front == null)
			System.out.println("\nList Empty");
		else {
			Node t = front;// 1
			Node t2 = front;// 1
			while (t.next != front)// 2
			{
				t2 = t;
				t = t.next;
			}
			if (front == t)
				front = null;// 3 single node
			else {
				rear = t2;
				rear.next = front;
			}
			System.out.println(t.data + " deleted");// 3
		}
	}

	void print_list() {
		if (front == null)
			System.out.println("\nList Empty");
		else {
			Node t = front;// 1
			do {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			} while (t != front);
		}
	}

}