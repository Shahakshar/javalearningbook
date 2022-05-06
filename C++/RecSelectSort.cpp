#include<iostream>
using namespace std;

int findSmallEleIdx(int arr[], int size, int idx) {
	// base case
	if(size == idx) {
		return idx;
	}
	
	int k = findSmallEleIdx(arr, size, idx+1);
	
	// solve one case
	return arr[k] > arr[idx] ? idx : k;
}

void selectSort(int arr[], int size, int idx) {
	
	if(size == idx) {
		return;
	}
	
	// solve one case
	int min_idx = idx;
	for(int i=idx+1; i<=size; i++) {
		if(arr[i] < arr[min_idx]) {	
			min_idx = i;
		}
	}
		
	swap(arr[min_idx], arr[idx]);

	// recursive call
	selectSort(arr, size, idx+1);
}

int main() {
	
	int arr[] = {3,2,4,1,10,6,5,9,7,8};
	int size = 10;
	
	selectSort(arr, size-1, 0);
	
	for(int i=0; i<size; i++)  {
		cout<<arr[i]<<" ";
	} cout<<endl;
	
	return 0;
}
