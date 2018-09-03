package org.cherubic.demo.service;

import org.cherubic.demo.service.impl.UserServiceImpl;

import org.junit.jupiter.api.Test;

class UserServiceTests {
    
    private final UserService userService = new UserServiceImpl();
    
    @Test
    void testListAll() {
        System.out.println(userService.listAll().getMessage());
    }
}
