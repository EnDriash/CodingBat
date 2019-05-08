
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"


public String endUp(String str) {
  String tlt;
  if (str.length()>2){
    tlt=str.substring(str.length()-3,str.length());
    str=str.replace(tlt,tlt.toUpperCase());
  }
  else{
    str=str.toUpperCase();
  }
  return str;
}
