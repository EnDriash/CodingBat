Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

public String noX(String str) {
 if(str.length()>0){
  if(str.charAt(str.length()-1)=='x'){
    return noX(str.substring(0,str.length()-1)) + "";
    
  }
  else{
    return noX(str.substring(0,str.length()-1)) + String.valueOf(str.charAt(str.length()-1)) ;
  }}
  else{
    return "";
  }
}
