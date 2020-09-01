//201951146 Shreyansh Mishra
#include<bits/stdc++.h>
using namespace std;

class Date2{
    public:
    int d,m,y;
    string month[12] = {"January", "February", "March", "April", "May", "June", "July", "August","September","October","November","December"}; 
    Date2(int d1, string m1, int y1){
        d = d1;
        y = y1;
        for(int i=0; i<12;i++){
            if(m1==month[i]){
                m = i+1;
                break;
            }
        }
    }

};

class Date{
    public:
    int d,m,y;
    int monthDays[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    Date(int d1,int m1,int y1){
        d = d1;
        m = m1;
        y = y1;
    }
    
int leaps() 
{ 
    int years=y; 
    if (m<3){ 
        years--; 
    }
    return years/4-years/100+years/400; 
} 
int leaps2(Date2 d) 
{ 
    int years = d.y; 
    if (d.m<3) {
        years--; 
    }
    return years/4-years/100+years/400; 
} 


long int operator - (Date2 const &dt2){
    long int n1 = y*365 + d; 
    for (int i=0; i<m - 1; i++) 
        n1 += monthDays[i]; 
    n1 += leaps(); 
    long int n2 = dt2.y*365 + dt2.d; 
    for (int i=0; i<dt2.m - 1; i++) 
        n2 += monthDays[i]; 
    n2 += leaps2(dt2); 
    return (n2 - n1); 
}

};




int main(){
    int d,m,y;
    string m1;
    cout<<"Enter Day: ";
    cin>>d;
    cout<<"Enter Month(in number): ";
    cin>>m;
    cout<<"Enter Year: ";
    cin>>y;
    Date d1(d,m,y);
    cout<<"***************Enter Second Date**********************";
    cout<<"\nEnter Day: ";
    cin>>d;
    cout<<"Enter Month(String: First letter capital): ";
    cin>>m1;
    cout<<"Enter Year: ";
    cin>>y;
    Date2 d2(d,m1,y);
    int difference = d1-d2;
    cout<<"Number of Days between the 2 dates: "<<abs(difference)<<endl;
    return 0;   
}