
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"

public String minCat(String a, String b) {
  int al=a.length();
  int bl=b.length();
  String str="";
  
  if(al>bl){
    a = a.substring(al-bl);
    str=a+b;
  }
  
 if (al<bl){
  b=b.substring(bl-al);
  str=a+b;
 }
 
  if(a==b){
    str=a+b;
  }
  return str;
}
