public class User {
    private final String firstName;
    private final String lastName;
    private final int id;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getid() {
        return id;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int id;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public User build() {
            return new User(this);
        }
        public User getUser() {
            return new
                    User.UserBuilder("Jhon", "Doe")
                    .id(30)
                    .build();
        }
    }
}

/*
    8.
- zdefiniuj klasę User z 3 polami (id, firstName, lastName)
- zmodyfikuj ją w taki sposób, aby nie dało się do jegnego HashSetu
    włożyć dwóch userów o tych samych imionach i nazwiskach
- utwórz do niej Buildera
     */