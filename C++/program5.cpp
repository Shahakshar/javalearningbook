#include<iostream>
using namespace std;

void swapAlternative(int arr[], int size) {
	for(int i=0; i<size; i+=2) {
		if(i+1<size) {
			swap(arr[i], arr[i+1]);
		}
	
	}
}

int findUnique(int arr[], int size) {
	int ans = 0;
	for(int i=0; i<size; i++) {
		ans = ans ^ arr[i];
	}
	return ans;
}

int main() {
	int arra[]= {1,3,1,4,3,5,5};
	swapAlternative(arra, 6);
	for(int i=0; i<6; i++) {
		cout<<arra[i]<<" ";
	}
	cout<<endl;
	cout<<findUnique(arra, 7);
	return 0;
}


