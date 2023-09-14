package NaveenAutomationLabs.Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Data // for getter and setter
public class Customer {

	private String name;
	private int age;
	private String city;
	private boolean isActive;
	private String dob;
}
