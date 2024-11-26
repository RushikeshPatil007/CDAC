package assignment2;

public class Circular_Doubly_LinkedList {
 DNode next,right;
 
   void create_List() {
	  next=right=null; 
   }
 
 void insert_left(int data) {
	 DNode t=new DNode(data);
	 if(next==null) {
		 t.left=t.right=t;
		 next=t;
	 }
	 else {
		 DNode t2=next.left;
		 t.right=next;
		 t.left=t2;
		 next.left=t;
		 t2.right=t;
		 next=t;
	 }
	 System.out.println(data+" inserted");
 }
 
 void delete_left() {
	 if(next==null) {
		 System.out.println("List is empty");
		 return;
	 }
	 DNode t=next;
	 if(t.right==t) {
		 next=null;
	 }
	 else {
		 DNode t2=t.right;
		 DNode t3=t.left;
		 t3.right=t2;
		 next=t2;
	 }
	 t.left=t.right=null;
 }
 
 void insert_right(int data) {
	 DNode t=new DNode(data);
	 if(next==null) {
		 t.right=t.left=t;
		 next=t;
	 }
	 else {
		 DNode t2=next.left;
		 t.right=next;
		 t.left=t2;
		 t2.right=t;
		 next.left=t;
	 }
	 System.out.println(data+" inserted");
 }
 
 void delete_right() {
	 if(next==null) {
		System.out.println("List is empty");
		 return;
	 }
	 DNode t=next.left;
	 if(t==next) {
		 next=null;
	 }
	 else {
		 DNode t2=t.left;
		 t2.right=next;
		 next.left=t2;
	 }
	 t.left=t.right=null;
 }
 
 void print_list() {
	 if(next==null) {
		 System.out.println("List is Enpty");
		 return;
	 }
	 DNode t=next;
	 do {
		 System.out.print("<-|"+t.data+"|->");
		 t=t.right;
	 }while(t!=next);
 }
}
