#include<iostream>
using namespace std;

int findFact(int n) {
	if(n == 1) {
		return 1;
	}
	
	int ans = n * findFact(n-1);
	return ans;
}

int main() {
	int n = 5;
	int ans = findFact(n);
	cout<< ans;
}
