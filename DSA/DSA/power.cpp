#include<iostream>
using namespace std;

int power(){
    int a,b;
    cout<<"enter value of a";
    cin>>a;

      cout<<"enter value of b";
    cin>>b;
    
    int ans=1;
    for ( int i = 1; i <= b; i++)
    {
        ans=ans*a;
    }
    return ans;
}
int main (){
   int  ans=power();
    cout<<"power is"<<ans << endl;
    return 0;
}