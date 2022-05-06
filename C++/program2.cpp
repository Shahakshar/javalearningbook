#include<iostream>
#include<math.h>
using namespace std;

int main() {
	
	int n;
	cin >> n;
	
	int i = 0;
	
	int ans = 0;
	while(n != 0)
	{
		int bit = n & 1;
		ans = ans + bit * pow(10, i);
		n = n >> 1;
		i++;
	}
	cout << ans << endl;
	
	i=0;
	int result = 0;
	while(ans != 0) {
		int digit = ans % 10;
		if(digit == 1)
			result = result + pow(2, i);
		i++;
		ans = ans/10;
	}
	cout << result << endl;
	
	return 0;
}
