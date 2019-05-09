
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"


public String stringSplosion(String str) {
 String a="";
  for(int x=0;x<=str.length();x++){
    a =a+ str.substring(0,x); 
  }
  return a;
}



