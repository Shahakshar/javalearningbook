#include<iostream>
using namespace std;

class Node {
	
	public:
	int data;
	Node* next;
	
	Node(int data) {
		this->data = data;
		this->next = NULL;
	}
	
};

void insert(Node* head, int data) {
	
	Node* newNode = new Node(data);
	Node* temp = head;
	if(head == NULL) {
		head = newNode;
		return;
	}
	while(temp ->next != NULL) {
		temp = temp->next;
	}
	temp->next = newNode;
	temp = newNode;
	
}

Node* reverseK(Node* head, int k) {
	
	// base call
	if(head == NULL) {
		return NULL;
	}
	
	// step1 reverse first k Node
	Node* next = NULL;
	Node* curr = head;
	Node* prev = NULL;
	int count = 0;
	
	while(curr != NULL && count < k) {
		next = curr->next;
		curr->next = prev;
		prev = curr;
		curr = next;
		count++;
	}
	
	// step 2 recursion dekh lega
	if(next != NULL) {
		head->next = reverseK(next, k);
	}
	
	return prev;
	
}



void Display(Node* head) {
	Node* temp = head;
	while(temp != NULL) {
		cout<<temp->data<<"-->";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}

int main() {
	
	Node* head = new Node(10);
	insert(head, 20);
	insert(head, 30);
	insert(head, 40);
	insert(head, 50);
	insert(head, 60);
	Display(reverseK(head, 2));
	Display(head);
	
}
