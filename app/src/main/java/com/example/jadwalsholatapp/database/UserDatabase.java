package com.example.jadwalsholatapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jadwalsholatapp.model.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();
}
