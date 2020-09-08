#include<iostream>
using namespace std;
class Counter{
   int count;
   public:
      Counter(): count(0)
      { }
      void get(){
         cout<<count<<endl;
      }
      void operator++ (int){        //postfix
         count++;
      }
      void operator ++(){
         ++count;
      }
      void operator -- (){
         count--;
      }
      void operator -- (int){
         --count;
      }
};

int main()
{
   Counter c1;
   c1++;
   c1.get();
   ++c1;
   c1.get();
   --c1;
   c1.get();
   c1--;
   c1.get();
}