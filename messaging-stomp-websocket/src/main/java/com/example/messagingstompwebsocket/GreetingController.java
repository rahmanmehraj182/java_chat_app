/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.messagingstompwebsocket;

/**
 *
 * @author Student
 */
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Greeting greeting(HelloMessage message) throws Exception {
    Thread.sleep(500); // simulated delay
    System.out.println("Hello @!!!!!");
    return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) );
  }
  
  @MessageMapping("/message")
  @SendTo("/topic/greetings2")
  public Greeting greeting2(Message message) throws Exception {
    Thread.sleep(500); // simulated delay
      System.out.println("Hello @!!!!!");

      `<div class="form-group">
                    <label for="name">What is your name?</label>
                    <input type="text" id="name" class="form-control" placeholder="Your name here...">
                </div>`
    return new Greeting( "! \n" + HtmlUtils.htmlEscape(message.getMess()) );
  }

}