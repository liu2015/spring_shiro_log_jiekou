package com.example.demo.Utils;

import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.Utils
 * @ClassName: jsoncli
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/1 9:06
 * @Version: 1.0
 */
public class jsoncli {

    public  Response run() throws IOException {


        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "{\"data\":{\"orderId\":286768723,\"extId\":\"7075711076748767\",\"orderNo\":\"1305721721371681684\",\"storeId\":10035415,\"extStoreId\":\"GZ00029\",\"storeName\":\"广州番禺万达广场店\",\"brandId\":10006695,\"brandName\":\"周黑鸭\",\"currencyType\":1,\"counts\":3,\"name\":\"陈(先生)\",\"phone\":\"13002013584_7399\",\"address\":\"万科·欧泊 (万科欧泊A4栋3303 \\u2028陈先生 18588579276)\",\"reviewStatus\":1,\"sendType\":1,\"sendTime\":\"2019-10-27 19:13:57\",\"fromType\":21,\"payType\":2,\"isPayed\":true,\"isInvoice\":false,\"invoiceType\":0,\"price\":43.9,\"productPrice\":75.9,\"deliveryFee\":5.0,\"deliveryCheapFee\":0.0,\"deliveryCheapRequire\":0.0,\"orderStatus\":10,\"orderDate\":\"2019-10-27 18:28:57\",\"userNote\":\"电话 18588579276\\n不用拨打预留那个\\n打这个 收餐人隐私号 13002013584_7399，手机号 131****0294 ,备份隐私号：[\\\"18620409760_2306\\\",\\\"18620463872_1789\\\"]\",\"preferentialPrice\":-37.0,\"longitude\":\"113.355955\",\"latitude\":\"23.010753\",\"teaFee\":0.0,\"peopleNum\":0,\"isThirdDistribute\":true,\"meiTuanId\":\"7075711076748767\",\"sn\":\"#49 20191027\",\"products\":[{\"pid\":12621899,\"typeId\":10329050,\"name\":\"卤香干\",\"aliasName\":\"广深新规格\",\"price\":15.9,\"thirdPrice\":15.9,\"sysPrice\":15.9,\"totalPrice\":15.9,\"realTimePrice\":15.9,\"realTimeTotalPrice\":15.9,\"excludeExtraTotalPrice\":15.9,\"num\":1,\"isCombination\":false,\"editType\":0,\"extId\":\"110121\",\"isRecommend\":false,\"isScore\":false,\"isStockZero\":false,\"mealFee\":0.0,\"mulMealFee\":0.0,\"part\":0,\"mealFeeType\":0,\"printTag\":0,\"productTagUid\":0,\"bagNo\":\"1\",\"productNo\":0,\"attribute\":{\"length\":0.0,\"width\":0.0,\"high\":0.0,\"weight\":180.0}},{\"pid\":12620395,\"typeId\":10330945,\"name\":\"卤鸭翅（不辣）\",\"aliasName\":\"广深新\",\"price\":28.0,\"thirdPrice\":28.0,\"sysPrice\":28.0,\"totalPrice\":28.0,\"realTimePrice\":28.0,\"realTimeTotalPrice\":28.0,\"excludeExtraTotalPrice\":28.0,\"num\":1,\"isCombination\":false,\"editType\":0,\"extId\":\"110102\",\"isRecommend\":false,\"isScore\":false,\"isStockZero\":false,\"mealFee\":0.0,\"mulMealFee\":0.0,\"part\":0,\"mealFeeType\":0,\"printTag\":0,\"productTagUid\":0,\"bagNo\":\"1\",\"productNo\":0,\"attribute\":{\"length\":0.0,\"width\":0.0,\"high\":0.0,\"weight\":180.0}},{\"pid\":12608661,\"typeId\":10329049,\"name\":\"卤鸭脖\",\"aliasName\":\"广深新\",\"price\":32.0,\"thirdPrice\":32.0,\"sysPrice\":32.0,\"totalPrice\":32.0,\"realTimePrice\":32.0,\"realTimeTotalPrice\":32.0,\"excludeExtraTotalPrice\":32.0,\"num\":1,\"isCombination\":false,\"editType\":0,\"extId\":\"110076\",\"isRecommend\":false,\"isScore\":false,\"isStockZero\":false,\"mealFee\":0.0,\"mulMealFee\":0.0,\"part\":0,\"mealFeeType\":0,\"printTag\":0,\"productTagUid\":0,\"bagNo\":\"1\",\"productNo\":0,\"attribute\":{\"length\":0.0,\"width\":0.0,\"high\":0.0,\"weight\":250.0}}],\"wallet\":0.0,\"weixin\":0.0,\"zhifubao\":0.0,\"redEnvelope\":0.0,\"paypal\":0.0,\"thirdCouponId\":\"\",\"discountTotalPrice\":-37.0,\"deliveryDisTotalPrice\":0.0,\"discounts\":[{\"preferentialId\":0,\"preferentialContent\":\"满69.0元减30.0元\",\"preferentialPrice\":-30.0,\"thirdPreferentialType\":2,\"thirdSubsidy\":5.0,\"merchantSubsidy\":25.0,\"preferentialType\":1,\"preferentialTypeName\":\"第三方优惠\",\"discountType\":0,\"isAddToProducts\":false,\"preferentialOfPids\":{},\"productDisList\":[],\"preProducts\":[],\"thirdRealPreferentialType\":\"2\"},{\"preferentialId\":274839715,\"preferentialContent\":\"用户使用了美团红包减7元\",\"preferentialPrice\":-7.0,\"thirdPreferentialType\":1,\"thirdSubsidy\":3.5,\"merchantSubsidy\":3.5,\"preferentialType\":1,\"preferentialTypeName\":\"第三方优惠\",\"discountType\":0,\"isAddToProducts\":false,\"preferentialOfPids\":{},\"productDisList\":[],\"preProducts\":[],\"thirdRealPreferentialType\":\"9\"}],\"merchantPrice\":40.29,\"merchantBearPrice\":28.5,\"thirdPlatformBearPrice\":8.5,\"commission\":7.11,\"mealFee\":0.0,\"isNeedTableware\":0,\"isStoreFirstOrder\":false,\"isBrandFirstOrder\":false,\"thirdSn\":\"39\",\"realTimeProductPrice\":75.9,\"sendBySelf\":false,\"driverStatus\":0,\"userId\":70229603,\"tablewareRecycling\":false,\"registerPhone\":\"99999999999\",\"nickName\":\"陈小龙(先生)\",\"hiddenPhone\":\"131****0294\",\"driveDistance\":1.5,\"distributeTypeCode\":\"1001\",\"tablewareNote\":\"0\"},\"sign\":\"b6c034f606a80b00fc1fc3e90e463f3d\"}\r\n");
        Request request = new Request.Builder()
//                .url("http://omniapi2.zhouheiya.cn:9001/hepwebservices/candao/order/create")
                .url( "http://localhost:8080/jsons-service/v2" )
                .post(body)
                // 添加头 文本类型,是json
                .addHeader("Content-Type", "application/json")
                // 添加头的类型 是不是可以缓存 不能缓存
                .addHeader("cache-control", "no-cache")
                // 添加postman 令牌,令牌内容
                .addHeader("Postman-Token", "7ab6368b-e0b0-452e-88c1-fd6c29004b1e")
                .build();


        Response response = client.newCall(request).execute();

        int code =response.code();
        System.out.println( code+".........." );
        String body1=response.body().string();

// 返回信息

        return response;

    }


}
