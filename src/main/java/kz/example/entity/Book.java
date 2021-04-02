package kz.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String author;
    private Boolean isIssued;
    private String title;

    @Column(name = "user_id")
    private Long myUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", updatable = false, insertable = false)
    private User user;

    public Book(String author, Boolean isIssued, String title) {
        this.author = author;
        this.isIssued = isIssued;
        this.title = title;
    }

    public Book() {
    }

    public Book(Boolean isIssued) {
        this.isIssued = isIssued;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIssued() {
        return isIssued;
    }

    public void setIssued(Boolean issued) {
        isIssued = issued;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(Long myUserId) {
        this.myUserId = myUserId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                ", title='" + title + '\'' +
                '}';
    }
}
