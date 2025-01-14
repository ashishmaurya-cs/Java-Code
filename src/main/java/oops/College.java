package oops;

public class College {
    private final String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                '}';
    }
}
