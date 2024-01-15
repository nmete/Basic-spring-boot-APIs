package bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Student {
    private int id;
    private String name;
    private  String lastname;

    public Student(int id, String name, String lastname){
        this.id =id;
        this.name =name;
        this.lastname =lastname;
    }
}
