Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9

public int strDist(String str, String sub) {
   if(str.contains(sub)){   
      if(str.substring(0,sub.length()).equals(sub)==false){
        return strDist(str.substring(1),sub);
      }
      if(str.substring(str.length()-sub.length()).equals(sub)==false){
        return strDist(str.substring(0,str.length()-1),sub);
      }
      if(str.substring(str.length()-sub.length()).equals(sub)&&str.substring(0,sub.length()).equals(sub)){
        return str.length();
      }}
  return 0;
}
