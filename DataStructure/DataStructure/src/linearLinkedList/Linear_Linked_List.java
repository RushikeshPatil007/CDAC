package linearLinkedList;

public class Linear_Linked_List {
	DNode root;

	void create_List() {
		root = null;
	}

	void insert_left(int data) {
		DNode n = new DNode(data);
		if (root == null)
			root = n;// first
		else {
			n.right = root;// 1
			root.left=n;
			root = n; // 2
		}
		System.out.println(data + " inserted");
	}

	void delete_left() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			DNode t = root;// 1
			root = root.right;// 2
			root.left=null;
			System.out.println(t.data + " deleted");// 3
		}

	}

	void insert_right(int data) {
		DNode n = new DNode(data);
		if (root == null)
			root = n;// first
		else {
			DNode t = root;// 1
			while(t.right!=null);// 1
			t=t.right;
			t.right=n;
			n.left= t; // 2
		}
		System.out.println(data + " inserted");
	}

	void delete_right() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			DNode t = root;// 1
			
			while (t.right != null)// 2
			
				t = t.right;
				
			
			if (root == t)
				root = null;// 3 single node
			else
			    DNode.t2=root;
				t2.next = null;// 3
			System.out.println(t.data + " deleted");// 3
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("\nList Empty");
		else {
			DNode t = root;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.data + "|->");
				t = t.right;
			}
		}
	}

	boolean serach_key(int key) {

		if (root == null) {
			System.out.println("\n empty");
			return false;
		} else {
			DNode t = root;
			while (t != null) {
				if (key == t.data)
					return true;
				t = t.next;
			}
			return false;
		}
	}

	
	
}