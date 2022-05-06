#include<iostream>
#include<math.h>
using namespace std;

int main() {
	
	int n;
	cin>>n; 
	
	switch(1) {
		case 1:
				cout<< "number of 100 notes are: "<<n/100<<endl;
				n = n % 100;
				
		case 2: cout<< "number of 50 notes are: "<<n/50<<endl;
				n = n % 50;
		
		case 3:cout<< "number of 20 notes are: "<<n/20<<endl;
				n = n % 20;
		case 4: cout<< "number of 1 notes are: "<<n/1<<endl;
			break;
	}
}
