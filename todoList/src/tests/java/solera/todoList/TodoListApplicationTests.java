package solera.todoList;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import solera.todoList.entity.Task;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;

@SpringBootTest
class TodoListApplicationTests {

	@Test
	void DescriptionNotEmpty() {
		Task task = new Task(1, "Deberes", "Hacer mis DBEBEROS");
		Assertions.assertNotEquals("", task.getDescription());
	}

	@Test
	void DescriptionStartingCharAt() {
		Task task = new Task(1, "Deberes", "");
		Assertions.assertNotEquals("@", task.getDescription().charAt(0));
	}

	@Test
	void DescriptionStartingCharHashtag() {
		Task task = new Task(1, "Deberes", "");
		Assertions.assertNotEquals("#", task.getDescription().charAt(0));
	}


	@Test
	void DescriptionCreationDatePresent() {
		Task task = new Task(1, "Deberes", "", LocalDate.of(2020, Month.JANUARY, 8) );
		Assertions.assertEquals(DateUtils.truncate(LocalDate.now(), Calendar.SECOND),
				DateUtils.truncate(LocalDate.of(2020, Month.JANUARY, 8) ,Calendar.SECOND));
	}

	@Test
	void DescriptionFinalizationDateDatePresent() {
		Task task = new Task(1, "Deberes", "", LocalDate.of(2020, Month.JANUARY, 8) );
		Assertions.assertEquals(DateUtils.truncate(LocalDate.now(), Calendar.SECOND),
				DateUtils.truncate(LocalDate.of(2020, Month.JANUARY, 8) ,Calendar.SECOND));
	}
}
