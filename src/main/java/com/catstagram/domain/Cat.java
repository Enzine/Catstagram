package com.catstagram.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author sonjamak
 */
@Entity
public class Cat extends AbstractPersistable<Long> {
    
    private String name;
    private int age;
    @OneToMany
    private List<Account> followers;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.followers = new ArrayList();
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<Account> getFollowers() {
        return followers;
    }
    
    public void addFollower(Account a) {
        followers.add(a);
    }
    
}
