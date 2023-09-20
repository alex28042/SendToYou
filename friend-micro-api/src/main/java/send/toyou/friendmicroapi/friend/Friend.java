package send.toyou.friendmicroapi.friend;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "friend")
@AllArgsConstructor
public class Friend {
    private String name;
    private final LocalDate creation = LocalDate.now();
    public Friend(Long id1, Long id2){
        this.name = id1 + "->" + id2;
    }
}
    /*@Id
    @SequenceGenerator(
            name = "friend_sequence",
            sequenceName = "friend_sequence",

            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "friend_sequence"
    )*/
