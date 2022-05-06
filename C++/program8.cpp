#include<iostream>
using namespace std;

class Node {
	public:
	int data;
	Node* next;
	Node* prev;
	
	// Constructor
	Node(int data) {
		this->data = data;
		this->next = NULL;
		this->prev = NULL;
	}
	~Node() {
		if(next != NULL)  {
			delete next;
			next = NULL;
		}
	}
};

void print(Node* &head) {
	Node* temp = head;
	cout<<"NULL"<<"<-->";
	while(temp != NULL) {
		cout<<temp->data<<"<-->";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}

int sizeList(Node* head) {
	int count = 0;
	Node* temp = head;
	while(temp != NULL) {
		count++;
		temp = temp->next;
	}
	return count;
}

void insertAtHead(Node* &head, Node* &tail, int data) {
	Node* newNode = new Node(data);
	if(head == NULL) {
		head = newNode;
		tail = newNode;
		return;
	}
	newNode->next = head;
	head->prev = newNode;
	head = newNode;
}

void insertAtTail(Node* &head, Node* &tail, int data) {
	
	Node* newNode = new Node(data);
	if(tail == NULL){
		tail = newNode;
		head = newNode;
		return;
	}
	tail->next = newNode;
	newNode->prev = tail;
	tail = newNode;
		
}

void insertAtPosition(Node* &head, Node* &tail, int data, int position) {
	if(position == 1) {
		insertAtHead(head, tail, data);
		return;
	} else if(position-1 == sizeList(head)) {
		insertAtTail(head, tail, data);
		return;
	} else {
		Node* newNode = new Node(data);
		int count = 1;
		Node* temp = head;
		while(count < position-1)  {
			count++;
			temp = temp->next;
		}
		newNode->next = temp->next;
		temp->next->prev = newNode;
		temp->next = newNode;
		newNode->prev = temp;
	}
}

void deleteAtPosition(Node* &head, Node* &tail, int position ) {
	if(position == 1) {
		Node* tamp = head;
		head = head->next;
		head->prev = NULL;
		tamp->next = NULL;
		delete tamp;
	} else {
		Node* curr = head;
		Node* prev = NULL;
		
		int count=1;
		while(count < position) {
			prev = curr;
			curr = curr->next;
			count++;
		}
		
		if(curr->next == NULL) {
			tail = prev;
		}
		
		prev->next = curr->next;
		curr->prev = NULL;
		curr->next = NULL;
		delete curr;
	}
}

int main() {
	
	
	Node* head = NULL;
	Node* tail = NULL;
	print(head);
	cout<<sizeList(head)<<endl;
	insertAtHead(head, tail, 20);
	print(head);
	insertAtHead(head, tail, 40);
	print(head);
	insertAtTail(head, tail, 20);
	print(head);
	insertAtTail(head, tail, 30);
	print(head);
	insertAtTail(head, tail, 40);
	print(head);
	insertAtPosition(head, tail, 30, 3);
	print(head);
	deleteAtPosition(head, tail, 6);
	print(head);
	deleteAtPosition(head, tail, 5);
	print(head);
	cout<<head->data<< " " << tail->data<<endl;
	cout<<sizeList(head);
	return 0;
}
