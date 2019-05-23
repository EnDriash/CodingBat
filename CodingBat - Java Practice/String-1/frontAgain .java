
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

public boolean frontAgain(String str) {
  boolean a =false;
  if(str.length()>1){
  if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
    a=true;
  }
  }
  else{
    a=false;
  }
  return a;
}
