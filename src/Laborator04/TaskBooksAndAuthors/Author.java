package Laborator04.TaskBooksAndAuthors;

public class Author
{
    private String name;
    private String email;
    private Character gender;

    public Author(String name, String email, Character gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getGender()
    {
        return this.gender;
    }

    @Override
    public String toString() {
        return "\n          "+this.name;
    }
}
