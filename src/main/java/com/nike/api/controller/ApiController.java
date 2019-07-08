package com.nike.api.controller;


import com.nike.api.pojo.TradeVoucherUploadRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1.0")
public class ApiController {

    @ApiOperation(value="服务心跳接口", notes="用于检测服务是否启动的接口")
    @GetMapping("/echo")
    public Object echo() {
        log.info("echo........");
        Map<String, Object> map = new HashMap<>();
        map.put("result_code", 200);
        map.put("result_message", "imok");
        return map;
    }

    @PostMapping("tradeVoucherUpload")
    public Object doTradeVoucherUpload(@RequestBody TradeVoucherUploadRequest request) {

        log.info("requet====11111");

        Map<String, Object> resp = new HashMap<>();

        Map<String, Object> file = new HashMap<>();

        Map<String, Object> fObj = new HashMap<>();

        fObj.put("gmt_create", "2019-01-01 00:00:00");
        fObj.put("file_path", "http://img07.taobaocdn.com/imgextra/i7/22670458/T2dD0kXb4cXXXXXXXX_!!22670458.jpg");
        fObj.put("size", 100);
        fObj.put("status", "pass");
        fObj.put("deleted", "deleted");
        fObj.put("picture_pix", "100x100");

        file.put("file", fObj);

        resp.put("trade_voucher_upload_response", file);

        return resp;

    }

}
