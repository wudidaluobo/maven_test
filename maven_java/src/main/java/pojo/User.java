package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer uid;
    private String name;
    private Integer age;
    private String address;
    private int add(int a,int b)
    {
        return a+b;
    }

}
