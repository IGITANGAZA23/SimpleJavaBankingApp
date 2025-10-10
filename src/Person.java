
    import java.time.LocalDate;

    public class Person {
        private int id;
        private String name;
        private String identity;
        private LocalDate dob;

        public Person(int id, String name, String identity, LocalDate dob) {
            this.id = id;
            this.name = name;
            this.identity = identity;
            this.dob = dob;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getIdentity() { return identity; }
        public LocalDate getDob() { return dob; }

        @Override
        public String toString() {
            return "Your Info: {id=" + id + ", name='" + name + "', identity='" + identity + "', Date of Birth=" + dob + "}";
        }
    }
