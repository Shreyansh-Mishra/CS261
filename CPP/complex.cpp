//201951146 Shreyansh Mishra
#include<bits/stdc++.h>
using namespace std;
class Complex{
     public:
    int r,im;
    int r1,im1;
    Complex(int r1,int im1){
        r = r1;
        im = im1;
    }
    
Complex operator + (Complex c2){
    Complex temp(r + c2.r,im + c2.im);
    return(temp); 
}

void operator *= (Complex c2){
    Complex temp((r * c2.r) - (im * c2.im),(im * c2.r) + (r * c2.im));
    r=temp.r;
    im=temp.im;
}

operator float() const{
    float a = im;
    int i=0;
    while(a>=1){
    i++;
    a/=10;
    }
    a+=r;
    return a; 
}

operator int() const{
    int i=0;
    int a= im;
    while(a>=1){
        i++;
        a/=10;
    }
    return i;
}

};

int main(){
    int r,im;
    cout<<"Enter Real Part: ";
    cin>>r;
    cout<<"Enter Imaginary Part: ";
    cin>>im;
    Complex c1(r,im);
    cout<<"***************Enter Second Number**********************";
    cout<<"\nEnter Real Part: ";
    cin>>r;
    cout<<"Enter Imaginary Part: ";
    cin>>im;
    Complex c2(r,im);
    Complex c3 = c1+c2;
    int prec1 = c1;
    int prec2 = c2;
    float x = c1;
    float x2 = c2;
    c1*=c2;
    cout<<"Float Representation of First Complex Number:"<<fixed<<setprecision(prec1)<<x<<endl;
    cout<<"Float Representation of Second Complex Number:"<<fixed<<setprecision(prec2)<<x2<<endl;
    cout<<"Sum of the 2 Complex Number: "<<c3.r<<"+"<<c3.im<<"i"<<endl;
    cout<<"Product of the 2 Complex Number: "<<c1.r<<"+"<<c1.im<<"i"<<endl;
    return 0;   
}