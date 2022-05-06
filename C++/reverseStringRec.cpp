#include<iostream>
using namespace std;

void reverse(string &s, int start) {
	
	if(s.length() == 0) {
		return;
	}
	
	char i = s[start];
	s.erase(s.begin()+0);
	reverse(s, start);
	s.push_back(i);
	
}

int main(){
	
	string s = "abcda";
	reverse(s, 0);
	cout << s << endl;
	
	return 0;
}
