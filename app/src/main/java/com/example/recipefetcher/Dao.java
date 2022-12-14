package com.example.recipefetcher;

import androidx.lifecycle.LiveData;
import androidx.room.Query;
import androidx.room.Insert;
import androidx.room.Update;
import androidx.room.Delete;
import java.util.List;


@androidx.room.Dao
public interface Dao {

    @Insert
    void insert(ShoppingListItem listItem);

    @Update
    void update(ShoppingListItem listItem);

    @Delete
    void delete(ShoppingListItem listItem);

    @Query("SELECT * FROM shopping_list")
    LiveData<List<ShoppingListItem>> getAllItems();

    @Query("SELECT * FROM shopping_list WHERE id=:itemId")
    LiveData<ShoppingListItem> getItem(String itemId);
}
