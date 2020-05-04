package com.example.bdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Repository {
/*
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int createGroup(int id){
        return jdbcTemplate.update("INSERT INTO \"Group\" (\"id\") VALUES (?)", id);
    }

    public int updateGroup(Group group){
        return jdbcTemplate.update("UPDATE \"Group\" SET \"id_of_desk\" = ? WHERE \"id\" = ?",
                group.getId(), group.getDesks());
    }

    public int deleteGroup(Integer id){
        return jdbcTemplate.update("DELETE FROM \"PERSONS\" WHERE \"ID\" = ?",id);
    }

 */
/*
    public Persons getPerson(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM \"PERSONS\" WHERE
                \"ID\"=?", new PersonsMapper(), id);
    }

 */
/*
    public List<Group> getGroups(Integer id){
        return jdbcTemplate.query("SELECT * FROM \"Person\" WHERE \"id\"=?", new GroupMapper(), id);
    }

 */

}
