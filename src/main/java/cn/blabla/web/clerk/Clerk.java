package cn.blabla.web.clerk;

import cn.blabla.entity.pojo.ResultBean;
import cn.blabla.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/clerk/order")
public class Clerk {
    @Autowired
    private OrderService orderService;

    @RequestMapping("begin_sending.do")
    @ResponseBody
    public ResultBean<Boolean> beginSending(int orderId, HttpServletResponse response) throws IOException {
        orderService.beginSending(orderId);
        return new ResultBean<>(true);
    }
}
