package de.thmWeb.demomicroservice.domain;

public class Person {

    private String idx;
    private String email;
    private BaseCredentials credentials;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BaseCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(BaseCredentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return idx.equals(person.idx);
    }

    @Override
    public int hashCode() {
        return idx.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "idx='" + idx + '\'' +
                ", email='" + email + '\'' +
                ", credentials=" + credentials +
                '}';
    }
}
