#include<iostream>
using namespace std;
int fact(int n){
    int fact=1;
    for (int i = 1; i <=n; i++)
    {
        fact=fact*i;
    }
    return fact;
    

}
int ncr(int n,int r) {
    int num= fact(n);
    int dem= fact(r) + fact(n-r);
    int ans= num/dem;
    return ans;
}
int main(){
    int n,r;
    cout<<"emter value of n";
    cin>>n;
     cout<<"emter value of r";
    cin>>r;
    cout<<"answer is"<<ncr(n,r)<<endl;
    return 0;
}