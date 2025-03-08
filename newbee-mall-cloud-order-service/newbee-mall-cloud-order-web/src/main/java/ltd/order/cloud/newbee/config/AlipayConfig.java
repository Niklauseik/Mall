package ltd.order.cloud.newbee.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000121624982";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCHgwrDrpiO8PuyFJFPl7m873fQGMRBt+hCQl+rH0cyo48yHBujjHpSHZgnpy0E4Aeis6s4HGg75Yfr6IFkuMBvijNzH/bWwpQBfF7dQgEl9jG2RvmWUDyEf1JLHPwERqCNuKjuMMciDMVY2NnH8/+y+sks7ti84FycpmXv+/K/4Om2Mam58TFxTvy5LStaLsOOecq64aZOYB/xJMRaZ4cPD9sbPeVt39J5YzHnVpKuwGkq5Ixfy9GHnutbg7y7nCeRhpUdymIiFEv+G3xNe/oDV76FfBncrJCdBoH5PQZyX2eKn1AXaiHD0NjE4C3lAKWh6qMw5m85G9l2gp2J5z5/AgMBAAECggEBAIG1ujkCR38TRij4LPs9pQknQs0K19h7+7JorAA1SUY8btWtN/t9fJxbPYg/KgVvl39ycSKddlxW4Zq7DBfoDDL32zWIVBLPXzJo5Lju9ABtPrpWB5OMq9C7un6xeL1zCT1+kxyjzghWpxPbReJyOMAN80CyQv3P2HYNhKeIx5xHdY77hY0NbcDMDXegvn+4mFKuW/VNbLdazsMK0e0i0oH06DAuzLTdwZZoWmOc084jNyk1m4xwAfnfi8GAh/xZBcfvrudu8FKSyI0ehKS+o8RJfVK0YfFSyFddC0P23iEZ3A/nOYFrqqs3FodQecO45kTlL/fwsAXPPGms2yLzo+kCgYEA5eT3d9k+vbdDniBExqIqCXfTfyT2IuAxRj/p+ZUpFUfb2RJA4vobkoQQ1zuKCUXqGxMnyCvfonzPS46DNyUTWiWOyz7ilsG2dqaqQu2f27ePJ8cKSo0LXrt3DdZMCXa8miUJAw4aKZYj+xq/LscXYq+wL2CxhfWjmUtQqf26hA0CgYEAluZf0qKLd8Ue7aOJp4illIS3oN2tYJWYKG8oQKoNxdZ32kQmQHR3dRZKqqQQk4B0DC8miV9Ej/9EoCjjBNXpNqw/pmtYxYOfA2UmWTJFUGsL4XPVmQtSAH9QlrGTt+4M9WQKDfFZOX+AsfCih1Ml6ozgfCyxo/amRS8+Bw4crbsCgYEAzz9n3JJrXko9WerLNapxbRGqB6ABiJVFtofd3RMb80RRrFIpTrWcb6xBJldVbGCr2HafUXRD6k7L7dhu8CKrXIQpQ47QZIoDfNlo+mcPytqi4oAsBeM7Ec68WCwNZia1hdzHUArBiSYCD9gf7AKtUVkC4uMvho1YS9S6xlSndW0CgYBMDoFtoQ+6plgYXr0a+/y5BsunARRKAhxXBO+85/lZJefy0zaUdh9fnIS1zUutjKjxGzLJOoNMMNVeBD2oSkjpjZfnQWPU6apUA794ZaYaClpKoB+gq9wA9CqiSY6yvgE6DdojfOoD2Qf8p9TDcF1EAw2CiORgSAk2BcG1vJ8n0QKBgQCtmNAIbfsy5kEg8fSoddEgB6vlHRbUtwG6T27tCQKHJzXg6HHU08cVZsWqi2xQXYj7wTLvVGMPvoEoASAgTQ7ANVysmM3NbmVro5vhTCL4KVsDyZHLfdXUWp39lpxKYhppvSxBacQIIRL3XAAQ3LKw/NmfANrqLrgu+Kb1ZBuWvw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh4MKw66YjvD7shSRT5e5vO930BjEQbfoQkJfqx9HMqOPMhwbo4x6Uh2YJ6ctBOAHorOrOBxoO+WH6+iBZLjAb4ozcx/21sKUAXxe3UIBJfYxtkb5llA8hH9SSxz8BEagjbio7jDHIgzFWNjZx/P/svrJLO7YvOBcnKZl7/vyv+DptjGpufExcU78uS0rWi7DjnnKuuGmTmAf8STEWmeHDw/bGz3lbd/SeWMx51aSrsBpKuSMX8vRh57rW4O8u5wnkYaVHcpiIhRL/ht8TXv6A1e+hXwZ3KyQnQaB+T0Gcl9nip9QF2ohw9DYxOAt5QCloeqjMOZvORvZdoKdiec+fwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/#/success";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/#/success";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
