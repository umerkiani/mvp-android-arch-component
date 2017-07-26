package com.quangnguyen.stackoverflowclient.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.quangnguyen.stackoverflowclient.data.Config

/**
 * @author QuangNguyen (quangctkm9207).
 */
@Entity(tableName = Config.QUESTION_TABLE_NAME)
data class Question(

    @SerializedName("question_id")
    @PrimaryKey
    var id: Long = 0,

    @SerializedName("owner")
    @Embedded(prefix = "owner_")
    var user: User? = null,

    @SerializedName("creation_date")
    @ColumnInfo(name = "creation_date")
    var creationDate: Long = 0,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("link")
    var link: String? = null
)
