package com.crawler.controllers;

import com.crawler.dao.UserMapper;
import com.crawler.element.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @RequestMapping(value = "/users")
  public List<User> getUsers() {
    return userMapper.findAll();
  }
}
