/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.messagingstompwebsocket;

/**
 *
 * @author Student
 */
public class Message {
  
  private String mess;

  public Message() {
  }

  public Message(String mess) {
      System.out.println(mess);
    this.mess = mess;
  }
  
  public String getMess(){
      return this.mess;
  }
  
  public void setMess(String mess){
      this.mess = mess;
  }


}
