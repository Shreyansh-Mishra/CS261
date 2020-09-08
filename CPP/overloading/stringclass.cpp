#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
class String{
    char str[100];
    public:
    String(){
        strcpy(str,"");
    }
    String(char s[]){
        strcpy(str,s);
    }
    void display(){
        cout<<str;
    }
    String operator + (String s){
        String temp;
        strcpy(temp.str,str);
        strcat(temp.str,s.str);
        return temp;
    }
   
    
};

int main(){
    String s1 = "Shreyansh Mishra";
    String s2 = " is from indore";
    String s3;
    s3 = s1 + s2;
    
    s3.display();
}