
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false


public boolean mixStart(String str) {

boolean mixStartrue=false;
 if(str.length()>2){
   String s=str.substring(0,3);
  mixStartrue=s.contains("ix");
  
 }
 return mixStartrue;
} 
