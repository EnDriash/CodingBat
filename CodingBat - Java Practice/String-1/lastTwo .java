Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

public String lastTwo(String str) {
  if(str.length()>1){
    str= str.substring(0,str.length()-2)+
    String.valueOf(str.charAt(str.length()-1))+
    String.valueOf(str.charAt(str.length()-2));
  }
  else{
    str=str;
  }
  return str;
}
