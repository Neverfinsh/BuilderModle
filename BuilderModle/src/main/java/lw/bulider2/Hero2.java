package lw.bulider2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Data
public class Hero2 {
//	基本的属性
	private String name;
	private int age;
}
