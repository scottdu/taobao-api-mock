package com.nike.api.pojo;

import lombok.Data;

@Data
public class TradeVoucherUploadRequest {

    private String fileName;

    private String fileData;

    private String sellerNick;

    private String buyerNick;

}
