
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false


public boolean stringE(String str) {
  char[] tab=new char[str.length()];
  int i=0;
  boolean isOk;
    for (int x=0;x<str.length();x++){
     tab[x]= str.charAt(x);
       if (tab[x]=='e'){
          i++;
        }
    }
    
   if (i>0&&i<4){
   isOk=true;
   }
   else{
    isOk=false;
  }
  
  return isOk;
}
