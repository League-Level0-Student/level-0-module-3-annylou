int bottle = 0;

for(bottle=99; bottle>0; bottle--) {
  print(bottle," bottles of beer on the wall, ");
  print(bottle, " bottles of beer. ");
  print("take one, pass it around,", bottle - 1, "bottles of beer on the wall. ");
   if(bottle==1) {
    print("no more bottles of beer on the wall, no more bottles of beer. ");
    print("go to the store and buy some more, 99 bottles of beer on the wall.");
  }
}
