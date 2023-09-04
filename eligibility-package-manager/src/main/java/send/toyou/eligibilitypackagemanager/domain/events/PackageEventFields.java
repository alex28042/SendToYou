package send.toyou.eligibilitypackagemanager.domain.events;

import lombok.*;
import send.toyou.eligibilitypackagemanager.domain.valueObjects.Address;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class PackageEventFields {
    private String id;
    private String senderUserId;
    private String receipterUserId;
    private int packageSize;
    private String name;
    private String status;
    private LocalDateTime dateCreated;
    private Address addressDestination;

}
