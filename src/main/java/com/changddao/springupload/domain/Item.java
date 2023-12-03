package com.changddao.springupload.domain;

import com.changddao.springupload.domain.UploadFile;
import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;

}
