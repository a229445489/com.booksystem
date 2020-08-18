package com.booksystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description： 实体类，对应数据库books表
 * @Data
 * 使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去。
 *@AllArgsConstructor
 * 使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
 * @NoArgsConstructor
 * 使用后创建一个无参构造函数
 * @Author: chen
 * @Date: 2020/7/16-11:14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private Integer bookID;

    private String bookName;

    private int bookCounts;

    private String detail;


}
