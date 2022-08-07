package com.example.cronmall.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
//    @TableId(type= IdType.AUTO)
    private Long id;// 设置id自增
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;// 设置自动填充
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableField(fill=FieldFill.INSERT)
    @Version
    private Integer version;
    @TableLogic
    @TableField(fill=FieldFill.INSERT)
    private Integer deleted;

}
