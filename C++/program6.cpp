#include<iostream>
using namespace std;

int firstOccurrence(int arr[], int size, int key) {
	int start = 0;
	int end = size-1;
	int mid = (start + end) / 2;
	
	int ans = 0;
	while(start<end) {
		
		if(arr[mid] == key) {
			ans = mid;
			end = mid -1;
		} else if(arr[mid] < key) {
			start = mid + 1;
		} else if(arr[mid] > key) {
			end = mid - 1;
		}
		mid = (start + end) / 2;
	}
	return ans;
}

int lastOccurrence(int arr[], int size, int key) {
	int start = 0;
	int end = size-1;
	int mid = (start + end) / 2;
	
	int ans = 0;
	while(start<end) {
		
		if(arr[mid] == key) {
			ans = mid;
			start = mid +1;
		} else if(arr[mid] < key) {
			start = mid + 1;
		} else if(arr[mid] > key) {
			end = mid - 1;
		}
		mid = (start + end) / 2;
	}
	return ans;
}

int main() {
	int arr[] = {1,2,3,4,4,4,4,5};
	
	cout<< "first occurrence of 4 is at index " << firstOccurrence(arr, 8, 4)<<endl;
	cout<< "last occurrence of 4 is at index " << lastOccurrence(arr, 8, 4)<<endl;

	return 0;
}
