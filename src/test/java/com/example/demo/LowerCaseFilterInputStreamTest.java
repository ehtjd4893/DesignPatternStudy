package com.example.demo;

import com.example.demo.decorator.LowerCaseFileInputStream;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseFilterInputStreamTest {

  @Test
  void streamTest() {
    int c;

    try {
      InputStream in = new LowerCaseFileInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

      while((c = in.read()) >= 0) {
        System.out.print((char)c);
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
