// IMyAidlInterface.aidl
package com.example.rajareddy.hello;

// Declare any non-default types here with import statements

interface IMyAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
  String getMessage(String name);
  	int getResult(int val1, int val2);
}
