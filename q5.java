public class q5 {
    public static void main(String[] args) {    
        String str = "sourabh pandey ooooo0000[[[[";   
        str= str.toLowerCase();
        for (char i = '0'; i <= 'z'; i++) {
            int count=0;
            // System.out.println(i);
            for (int j = 0; j < str.length(); j++) {
                if(i == str.charAt(j)){
                   count++; 
                }
            }
            if(count!=0){
                System.out.println(i +"="+count);
            }
        }  
    }    
} 
/*
PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q5.java } ; if ($?) { java q5 }
0=4
[=4
a=2
b=1
d=1
e=1
h=1
n=1
o=6
p=1
r=1
s=1
u=1
y=1
*/   

