#include<bits\stdc++.h>
#include<vector>
using namespace std;

void insert(vector<int> &a, int ele) {
	if(a.size() == 0 || a[a.size()-1] <= ele) {
		a.push_back(ele);
		return;
	}
	
	int val = a.back();
	a.pop_back();
	insert(a, ele);
	a.push_back(val);
}

void sortV(vector<int> &a) {
	if(a.size() == 1) {
		return;
	}
	int ele = a.back();
	a.pop_back();
	sortV(a);
	insert(a, ele);
}

int main() {
	
	// {3,4,2,1,5,3}
	vector<int> a;
	a[0] = 3;
	a[1] = 4;
	a[2] = 2;
	a[3] = 1;
	a[4] = 5;
	a[5] = 3;
	sortV(a);
	for(int i=0; i<a.size(); i++) {
		cout<<a[i];
	}
	
}
