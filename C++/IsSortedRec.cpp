#include<iostream>
using namespace std;

bool isSorted(int arr[], int size) {
	if(size == 0 || size == 1) {
		return true;
	}
	
	if(arr[size-1] < arr[size-2]) {
		return false;
	} else {
		bool ans = isSorted(arr-1, size-1);
		return ans;
	}
}

int main() {
	
	int arr[] = {5,2,1,2,3,5,5};
	int size = 5;
	
	bool ans = isSorted(arr, size);
	
	if(ans) {
		cout<<"arr is sorted!"<<endl;
	} else {
		cout<<"arr is not sorted!" << endl;
	}
	
	return 0;
}
