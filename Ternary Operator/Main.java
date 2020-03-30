#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int input;
  string output;
  string e ="Even";
  string o = "Odd";
  cin>>input;
  output = ((input%2) == 0)? e : o;
  cout<<output;
}