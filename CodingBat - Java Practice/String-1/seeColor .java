Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

public String seeColor(String str) {
  String a="";
  String b="";
  
if (str.length()>2 && str.substring(0,3).equals("red")){

str="red";
}
else if (str.length()>3 && str.substring(0,4).equals("blue")){
b=str.substring(0,4);
    
str="blue";
}
else {
str="";
}
  return str;
}
