Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"


public String altPairs(String str) {
  String a="";
  for(int i=0;i<str.length();i=i+4){
  if(i<str.length()){  a= a + str.charAt(i);}
  if(i+1<str.length()){  a= a + str.charAt(i+1);}
  }
  return a;
}



