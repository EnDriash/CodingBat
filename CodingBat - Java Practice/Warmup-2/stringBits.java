Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"


public String stringBits(String str) {
  String a="";
  for(int x=0; str.length()>x;){
    a = a + String.valueOf(str.charAt(x));
    x=x+2;
  }
  return a;
}


