package cn.blabla.web.employee;

import cn.blabla.entity.pojo.ResultBean;
import cn.blabla.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/employee/order")
public class Employee {
    @Autowired
    private OrderService orderService;

    @RequestMapping("receive_order.do")
    @ResponseBody
    public ResultBean<Boolean> receiveOrder(int orderId, HttpServletResponse response) throws IOException {
        orderService.receiveOrder(orderId);
        return new ResultBean<>(true);
    }

    @RequestMapping("request_sending.do")
    @ResponseBody
    public ResultBean<Boolean> requestSending(int orderId, HttpServletResponse response) throws IOException {
        orderService.requestSending(orderId);
        return new ResultBean<>(true);
    }
}
