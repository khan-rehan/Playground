#include<iostream>
using namespace std;
int main()
{
 
  //Type your code here.

 int prp_amt,roi,year,SI,amt;
  float discount,tot_amt;
  cin>>prp_amt>>roi>>year;
 SI = (prp_amt*year*roi)/100;
  cout<<SI<<endl;
  amt = prp_amt + SI;
  cout<<amt<<endl;
 discount = SI*0.02;
   cout<<discount<<endl;
  tot_amt = amt - discount;
   cout<<tot_amt<<endl;
  
  
  

}