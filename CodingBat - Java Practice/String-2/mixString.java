Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"


public String mixString(String a, String b) {
  String ab="";
  int x=Math.min(a.length(),b.length());
  
  for (int i=0;i<x;i++){
  
      ab=ab + a.charAt(i) + b.charAt(i);
        
   }
      
  if(a.length()>b.length()){
    ab=ab+a.substring(x);
  }
  else{
    ab=ab+b.substring(x);
  }
      
  return ab;
}