package com.db.anagramsdatabase;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.cursor.Cursor;


public interface AnagramsMapp {
    Cursor<Anagram> print();
    void export();
    void create();
    void sort();


}
