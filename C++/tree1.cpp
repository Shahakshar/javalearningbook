#include<iostream>
#include<queue>
#include<stack>
using namespace std;

class node {
	public:
		int data;
		node* left;
		node* right;
		
	node(int data) {
		this->data = data;
		this->left = NULL;
		this->right = NULL;
	}
};

node* buildTree(node* root) {
	
	cout<<"Enter data for tree: "<<endl;
	int data;
	cin>>data;
	root = new node(data);
	
	if(data == -1) {
		return NULL;
	}
	cout<<"Enter data for left of "<<data<<endl;
	root->left = buildTree(root->left);
	cout<<"Enter data for right of "<<data<<endl;
	root->right = buildTree(root->right);
}

void levelOrderTerversal(node* root) {
	queue<node*> q;
	q.push(root);
	q.push(NULL);
	
	while(!q.empty()) {
		node* temp = q.front();
		q.pop();
		
		if(temp == NULL) {
			cout<<endl;
			if(!q.empty()) {
				q.push(NULL);
			}
		} else {
			cout<<temp->data<<" ";
			if(temp->left) {
				q.push(temp->left);
			}
			if(temp->right) {
				q.push(temp->right);
			}	
		}
		
	}
}

void reverseOrderTraversal(node* root) {
	queue<node*> q;
	stack<int> s;
	
	q.push(root);
	
	while(!q.empty()) {
		node* temp = q.front();
		q.pop();
		s.push(temp->data);
		
		if(temp->right != NULL) {
			q.push(temp->right);
		}
		if(temp->left != NULL) {
			q.push(temp->left);
		}
	}
	
	while(!s.empty()) {
		cout<< s.top()<<" ";
		s.pop();
	}
}

void inorderTraversal(node* root) {
	if(root == NULL) {
		return;
	}
	
	inorderTraversal(root->left);
	cout<<root->data<<" ";
	inorderTraversal(root->right);
}

int main() {
	node* root = NULL;
	root = buildTree(root);
	cout<<"level order output of tree"<<endl;
	levelOrderTerversal(root);
	cout<<"reverse level order output of tree"<<endl;
	reverseOrderTraversal(root);
	cout<<"Inorder Traversal of tree"<<endl;
	inorderTraversal(root);
}

//1 2 3 -1 -1 4 -1 -1 5 6 -1 -1 -1 ->>> real tree
// 1 2 3 -1 -1 4 -1 -1 5 -1 6 -1 -1 ->> it also a tree but some differance 
