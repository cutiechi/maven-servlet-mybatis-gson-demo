package org.cherubic.demo.web.servlet;

import org.cherubic.demo.model.dto.JsonResponse;
import org.cherubic.demo.model.dto.ServiceResult;
import org.cherubic.demo.service.UserService;
import org.cherubic.demo.service.impl.UserServiceImpl;
import org.cherubic.demo.util.JsonUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    
    private final UserService userService;
    
    public UserServlet () {
        userService = new UserServiceImpl();
    }
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServiceResult serviceResult = userService.listAll();
        String json = JsonUtils.toJson(new JsonResponse(JsonResponse.Status.SUCCESS.getCode(), serviceResult.getMessage(), serviceResult.getResult()));
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(json);
    }
}
