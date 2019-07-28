package life.majiang.community.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String name;
    private String account_Id;
    private String token;
    private Long gmt_Create;
    private Long gmt_Modified;
    private Date insertTime;



}
