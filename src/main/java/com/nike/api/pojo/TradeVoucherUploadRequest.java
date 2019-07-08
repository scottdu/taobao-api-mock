package com.nike.api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "com.nike.api.pojo.TradeVoucherUploadRequest", description = "上传淘宝交易凭证请求")
public class TradeVoucherUploadRequest {

    @ApiModelProperty(value = "上传文件的名称", required = true)
    @JsonProperty(value = "file_name")
    private String fileName;

    @ApiModelProperty(value="文件", required = true)
    @JsonProperty(value = "file_data")
    private String fileData;

    @ApiModelProperty(value="该笔订单的卖家Nick", required = true)
    @JsonProperty(value = "seller_nick")
    private String sellerNick;

    @ApiModelProperty(value="该笔订单的买家Nick（混淆nick）", required = true)
    @JsonProperty(value = "buyer_nick")
    private String buyerNick;

}
