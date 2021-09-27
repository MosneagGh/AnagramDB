package com.db.anagramsdatabase;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Controller {
    Reader reader = Resources.getResourceAsReader("Sql.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

    public void show(){
        try(SqlSession session = sqlSessionFactory.openSession()) {
            Cursor<Anagram> cursor = session.getMapper(AnagramsMapp.class).print();
            for (Anagram word: cursor) {
                System.out.println(word.toString());
            }
        }
    }
    public void methods(){
        try(SqlSession sql = sqlSessionFactory.openSession()) {
            AnagramsMapp mapper = (AnagramsMapp) sql.getMapper(AnagramsMapp.class);
            mapper.create();
            mapper.export();
            mapper.sort();
        }
    }

    Controller() throws IOException {
            methods();
            show();
            }
        }

