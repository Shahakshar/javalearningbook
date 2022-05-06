#include<iostream>
using namespace std;

int update(int a);

int main() {
	int a = 15;
	update(a);
	cout<<a<<endl;
}

int update(int a) {
	return a-5;
}
