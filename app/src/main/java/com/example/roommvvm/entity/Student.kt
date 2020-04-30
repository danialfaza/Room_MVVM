package com.example.roommvvm.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

//query untuk menghapus instance/database tetapi dalam program aplikasi ini tidak digunakan
data class Student (
    @PrimaryKey(autoGenerate = true) var id: Int? = null,
//ntuk mendeklarasikan struktur tabel
    @ColumnInfo var name: String = ""
)