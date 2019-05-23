
Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false


public boolean endsLy(String str) {
   boolean g=false;
    String a= "ly";
       if (1<str.length()){
           str=str.substring(str.length()-2,str.length());
            if (str.equals(a)){
             g=true;
                     }
         }
  return g;
}
