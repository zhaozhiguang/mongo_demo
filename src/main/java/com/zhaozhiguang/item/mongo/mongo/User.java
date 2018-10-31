package com.zhaozhiguang.item.mongo.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class User {

    @Id
    private String id;

    @Indexed
    private String name;

    private String desc;

    private String sex;

    private Date birthday;

    @Version
    Long version;

}
