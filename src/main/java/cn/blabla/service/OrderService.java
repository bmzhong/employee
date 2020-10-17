package cn.blabla.service;

import cn.blabla.entity.Order;
import cn.blabla.entity.OrderItem;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface OrderService {

    /**
     * 订单状态 1:等待接收订单 2:未付款 3:备餐中 4:正在请求送餐 5：送餐中 6：订单完成
     */
    int WAIT_TO_ACCEPT=1;
    int STATE_NO_PAY = 2;
    int RREPAREMENT = 3;
    int WAIT_TO_SEND = 4;
    int SENDING = 5;
    int COMPLETION = 6;


    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    Order findById(int id);

    /**
     * 分页查询所有
     *
     * @param pageable
     * @return
     */
    Page<Order> findAll(Pageable pageable);

    /**
     * 按条件查询
     *
     * @param example
     * @return
     */
    List<Order> findAllExample(Example<Order> example);

    /**
     * 更新
     *
     * @param order
     * @return
     */
    void update(Order order);

    /**
     * 创建
     *
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 根据Id删除
     *
     * @param id
     * @return
     */
    void delById(int id);

    /**
     * 查询订单的订单项
     *
     * @param orderId
     * @return
     */
    List<OrderItem> findItems(int orderId);

    /**
     * 更改订单状态
     *
     * @param id
     * @param status
     */
    void updateStatus(int id, int status);

    /**
     * 查找用户的订单列表
     *
     * @param request
     * @return
     */
    List<Order> findUserOrder(HttpServletRequest request);

    /**
     * 支付
     * @param orderId
     */
    void pay(int orderId);

    void receiveOrder(int orderId);

    void beginSending(int orderId);

     void requestSending(int orderId);
    /**
     * 提交订单
     * @param name
     * @param phone
     * @param addr
     * @param request
     * @param response
     */
    void submit(String name, String phone, String addr, HttpServletRequest request, HttpServletResponse response) throws Exception;

    /**
     * 确认收货
     * @param orderId
     */
    void receive(int orderId);
}
