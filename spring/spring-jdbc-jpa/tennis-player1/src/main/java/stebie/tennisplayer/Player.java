package stebie.tennisplayer;

import java.util.Date;

public class Player {
    private int id;
    private String name;
    private String nationality;
    private Date birthDate;
    private int titles;

    // no arg constructor required by BeanPropertyRowMapper
    public Player() {
    }

    public Player(int id, String name, String nationality, Date birthDate, int titles) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getTitles() {
        return titles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "\nPlayer [id= " + id + ", name= " + name + ", nationality= " + nationality + ", birthDate= " + birthDate
                + ", titles= " + titles + "]";
    }
}
