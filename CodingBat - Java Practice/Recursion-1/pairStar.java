
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"

public String pairStar(String str) {
  if(str.length()>1){
    if(str.charAt(str.length()-1)==str.charAt(str.length()-2)){
      return pairStar(str.substring(0,str.length()-1)) + "*" + String.valueOf(str.charAt(str.length()-1));
    }
    else{
      return pairStar(str.substring(0,str.length()-1)) + String.valueOf(str.charAt(str.length()-1));
    }
  }
  else if(str.length()==1){
    return String.valueOf(str.charAt(0)) ;
  }
  else{
    return "";
  }
}
