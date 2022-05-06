#include<iostream>
using namespace std;

int findSmallEleIdx(int arr[], int size, int idx) {
	// base case
	if(size == idx) {
		return idx;
	}
	
	// solve one case
	int k = findSmallEleIdx(arr, size, idx+1);
	
	return arr[k] > arr[idx] ? idx : k;
}

int main() {
	int arr[] = {3,2,4,1};
	int size = 4;
	
	cout<< "smallest ele index: "<<findSmallEleIdx(arr, size-1, 0);
}
