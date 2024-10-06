import java.io.Serializable;

class Student implements Serializable{
	transient String name = "Ganesh";
	int age = 12;
}