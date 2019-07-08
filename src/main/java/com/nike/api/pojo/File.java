package com.nike.api.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class File {

    private Date gmtCreate;

    private String filePath;

    private int size;

    private String status;

    private String deleted;

    private String picturePix;
}
