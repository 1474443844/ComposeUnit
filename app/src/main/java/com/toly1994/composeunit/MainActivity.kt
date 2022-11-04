package com.toly1994.composeunit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.room.Room
import com.toly1994.composeunit.app.ComposeUnitApp
import com.toly1994.composeunit.repository.database.ComposeUnitDB
import com.toly1994.composeunit.repository.database.entity.WidgetPo
import com.toly1994.composeunit.repository.memory.MemoryWidgetDataStore


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(this,ComposeUnitDB::class.java,"compose_unit").allowMainThreadQueries().build()
        db.widgetDao().insertAll(MemoryWidgetDataStore.allWidget.first().toPo())
        setContent {
            ComposeUnitApp(
                onShare = {
                    share(it)
                }
            )
        }
    }

    private fun share(content: String) {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
        shareIntent.putExtra(Intent.EXTRA_TEXT, content)
        startActivity(Intent.createChooser(shareIntent, "代码分享"))
    }
}
