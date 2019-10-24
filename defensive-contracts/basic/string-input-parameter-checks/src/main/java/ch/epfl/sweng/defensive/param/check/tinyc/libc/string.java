package ch.epfl.sweng.defensive.param.check.tinyc.libc;

import ch.epfl.sweng.defensive.param.check.tinyc.type.cstring;
import java.lang.IllegalArgumentException;

public class string {

  /*
  Every string here ends with a /0 so we can find the index and work with it that way
  there is an issue with java readinf /0 as a string
   */
  private static void nullcheck(cstring destination,cstring source){
      if(destination == null || source == null){
        throw new IllegalArgumentException();
      }
  }

  public static cstring strcpy(cstring destination, cstring source) {
    nullcheck(destination, source);
    lengthOfSource = strlen(source);
    lengthOfDestination = strlen(destination);
    if(lenOfSource <= lengthOfDestination){
      for(int x = 0; x <= lengthOfDestination; x++ ){
        destination.set(x, source.get(x));
        //at index x set the destination value to be what source has at index x
      }
    }else{
      //EXCEPTION BUFFER OVERFLOW
    }
  }

  public static cstring strncpy(cstring destination, cstring source, int num) {
    lenOfSource = strlen(source);
    lenOfDest = strlen(destination);
    if (lenOfSource <= num && lenOfDest <= num){
      for(int x = 0; x < num; x++){
        destination.set(x,source.get(x));
      } destination.set(x, '\0');
    }else{
      //EXCEPTION BUFFER OVERFLOW
    }
    return destination;
  }

  public static cstring strcat(cstring destination, cstring source) {
    lengthOfDest = strlen(destination); //where the string ends
    lengthOfSource = strlen(source); //how long the new string is to be added
    for(int x = lengthOfDest; x < lengthOfDest + lengthOfSource; x++){
      destination.set(x, source.get(x - lengthOfDest));
    } destination.set(x, '\0');


    return destination;
  }

  public static cstring strncat(cstring destination, cstring source, int num) {
    return null;
  }

@requires({cstring != null})
  public static int strlen(cstring str) {
    int x = 0;
    while(str.get(x) != (char) '\0'){
      x++;
    }
    return x;
  }

  public static int strcmp(cstring str1, cstring str2) {
    return 0;
  }

  public static int strncmp(cstring str1, cstring str2, int num) {
    return 0;
  }
}