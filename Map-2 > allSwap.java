public String[] allSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  
  for (int i = 0; i < strings.length; i++) {
    if (strings[i] != "") {
      if (!map.containsKey(strings[i].charAt(0))) {
        map.put(strings[i].charAt(0), i);
      }
      else {
       
          int index = map.get(strings[i].charAt(0));
          String temp = strings[index];
          strings[index] = strings[i];
          strings[i] = temp;
          map.remove(strings[i].charAt(0));
      }
    }
  }
  return strings;
}
