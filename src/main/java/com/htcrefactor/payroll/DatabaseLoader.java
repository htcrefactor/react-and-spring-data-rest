@Component (1)
public class DatabaseLoader implements CommandLineRunner { (2)

	private final EmployeeRepository repository;

	@Autowired (3)
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception { (4)
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
