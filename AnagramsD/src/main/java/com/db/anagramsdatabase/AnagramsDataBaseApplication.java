package com.db.anagramsdatabase;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.Reader;

public class AnagramsDataBaseApplication {

    public AnagramsDataBaseApplication() {
    }

    public static void main(String[] args) throws IOException {
       Controller controller = new Controller();
    }
}
