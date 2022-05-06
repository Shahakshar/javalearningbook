#include<iostream>
using namespace std;

void merge(int arr[], int s, int mid, int e) {
	
	int n1 = mid -s + 1;
	int n2 = e - mid;
	
	int *a = new int[n1];
	int *b = new int[n2];
	for(int i=0; i<n1; i++) {
		a[i] = arr[s+i];
	}
	for(int i=0; i<n2; i++) {
		b[i] = arr[mid+i+1];
	}
	
	int i = 0, j = 0;
	int k = s;
	while(i<n1 && j<n2) {
		if(a[i] < b[j]) {
			arr[k++] = a[i++];
		}else {
			arr[k++] = b[j++];
		}
	}
	
	while(i<n1) {
		arr[k++] = a[i++];
	}
	
	while(j<n2) {
		arr[k++] = b[j++];
	}
}

void mergeSort(int arr[], int s, int e) {
	if(s >= e) {
		return;
	}
	
	int mid = s + (e - s) / 2;
	
	// left part
	mergeSort(arr, s, mid);
	mergeSort(arr, mid+1, e);
	merge(arr, s, mid, e);
}

int main() {
	
	int arr[] = {4,5,2,1,3,8,7,6};
	int size = 8;
	
	mergeSort(arr, 0, size-1);
	
	for(int i=0; i<size; i++) {
		cout<<arr[i]<<" ";
	} cout<<endl;
	
	return 0;
}
