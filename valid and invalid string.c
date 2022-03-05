/*
There must be no space before comma and full stop
There must be space after full stop and comma
The alphabet after full stop must be in upper case
The alphabet after comma must be in lower case

Input:
Hi,hello everyone. this is beautiful!
Output:
INVALID

Input:
Hi, hello everyone. This is beautiful!
Output: 
Valid
*/
#include<stdio.h>
#include<stdlib.h>

int main()
{
char str[101];
scanf("%[^\n]",str);
int count=0,temp=0;
for(int i=0;i<strlen(str);i++){
    if((str[i]==','&&str[i-1]!=' '&&str[i+1]==' '&&islower(str[i+2]))||(str[i]=='.'&&str[i-1]!=' '&&(str[i+1]==' '&&isupper(str[i+2])||i+1==strlen(str))))
        count++;
    if(str[i]==','||str[i]=='.')temp++;
}
if(temp==count)printf("VALID");
else printf("INVALID");
}
