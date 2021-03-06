Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

public String changeXY(String str) {
  if(str.length()>0){
    if(str.charAt(str.length()-1)=='x'){
      return changeXY(str.substring(0,str.length()-1)) + "y";
    }
    else{
      return changeXY(str.substring(0,str.length()-1)) + String.valueOf(str.charAt(str.length()-1));
    }
  }
  else{
      return "";
    
  }
}
