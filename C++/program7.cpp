#include<iostream>
using namespace std;

class Node {
	public:
	int data;
	Node* next;
		
	// constructor
	Node(int data) {
		this->data = data;
		this->next = NULL;
	}
	~Node() {
		int value=this->data;
		if(this->next != NULL) {
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free for node with data " << value<<endl;
	}
};


int countSize(Node* &head) {
	Node* temp = head;
	int count = 1;
	while(temp != NULL) {
		count++;
		temp = temp->next;
	}
	return count;
}

void insertAtTail(Node* &head, int data) {

	Node* tail = head;
	Node* temp = new Node(data);
	while(tail->next != NULL) {
		tail = tail->next;
	}
	tail->next = temp;
	tail = temp;
}

void insertAtHead(Node* &head, int data) {
	Node* temp = new Node(data);
	temp->next = head;
	head = temp;
}

void insertAtPosition(Node* &head, int data, int position) {
	
	// insert at start case
	if(position == 1) {
		insertAtHead(head, data);
		return;
	}
	// insert at last vala case
	else if(countSize(head) == position) {
		insertAtTail(head, data);
	}
	// middle vala case
	else {
		Node* temp = head;
		Node* newNode = new Node(data);
		int count = 1;
		while(count < position - 1) {
			temp = temp -> next;
			count++;
		}
		newNode->next = temp->next;
		temp->next = newNode;
	}
}

void DisplayLinkedList(Node* &head) {
	Node* temp = head;
	while(temp != NULL){
		cout<< temp->data << "-->";
		temp = temp->next;
	}
	cout<< "NULL";
}

void deleteNode(int position, Node* &head) {
	// start case
	if(position == 1) {
		Node* temp = head;
		head = head->next;
		// memory free
		temp->next = NULL;
		delete temp;
	} else {
		Node* curr = head;
		Node* prev = NULL;
		int count = 1;
		while(count<position) {
			prev = curr;
			curr = curr->next;
			count++;
		}
		prev->next = curr->next;
		curr->next = NULL;
		delete curr;
	}
}

int main() {
	Node* n1 = new Node(10);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtTail(n1, 20);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtTail(n1, 40);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtTail(n1, 50);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtPosition(n1,30,3);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtPosition(n1, 60, 6);
	DisplayLinkedList(n1);
	cout<<endl;
	insertAtPosition(n1, 70, 7);
	DisplayLinkedList(n1);
	cout<<endl;
	deleteNode(3, n1);
	DisplayLinkedList(n1);
}
