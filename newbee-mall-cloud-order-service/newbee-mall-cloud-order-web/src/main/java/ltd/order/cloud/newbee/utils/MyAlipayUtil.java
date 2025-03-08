package ltd.order.cloud.newbee.utils;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import ltd.order.cloud.newbee.config.AlipayConfig;

public class MyAlipayUtil {
    public static String createOrderForm(String orderNo) throws AlipayApiException {
        DefaultAlipayClient alipayClient = new DefaultAlipayClient(
                AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key,
                "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setNotifyUrl(AlipayConfig.notify_url);
        request.setReturnUrl(AlipayConfig.return_url+"/"+orderNo);
        JSONObject bizContent = new JSONObject();
        bizContent.put("out_trade_no", orderNo);
        bizContent.put("total_amount", 88.88);
        bizContent.put("subject", "Iphone6 16G");
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");
        request.setBizContent(bizContent.toJSONString());
        AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
        String body = response.getBody();
        return body;
    }

    public static void main(String[] args) throws AlipayApiException {
        DefaultAlipayClient alipayClient = new DefaultAlipayClient(
                AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key,
                "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setNotifyUrl(AlipayConfig.notify_url);
        request.setReturnUrl(AlipayConfig.return_url);
        JSONObject bizContent = new JSONObject();
        bizContent.put("out_trade_no", SnowflakeIdWorker.getId());
        bizContent.put("total_amount", 0.01);
        bizContent.put("subject", "测试商品");
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");
        request.setBizContent(bizContent.toJSONString());
        AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
        String body = response.getBody();
        System.out.println(body);
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
