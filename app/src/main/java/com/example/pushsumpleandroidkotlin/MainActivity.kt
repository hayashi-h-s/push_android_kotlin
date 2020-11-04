package com.example.pushsumpleandroidkotlin

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    val channelId = "NOTIFICATION_CHANNEL_ID_SAMPLE" // グループID
    val SUMMARY_ID = 0 // サマリーID
    val GROUP_KEY = "group_key" // チャンネルID


    // サマリーID → ここで通知のグループを指定している。
    val MAIL_GROUP = 0
    // → ここで、チャンネル名を指定している
    val MAIL_CHANNEL = "メール"
    // チャンネルID
    private val MAIL_CHANNEL_ID = "メール"

    val FAVORITE_CHANNEL = "いいね"
    val FAVORITE_CHANNEL_ID = "いいね"

    val FOOTPRINT_GROUP = 1
    val FOOTPRINT_CHANNEL = "足あと"
    val FOOTPRINT_CHANNEL_ID = "足あと"

    val IMPORTANT_INFO_CHANNEL = "重要なお知らせ"
    val IMPORTANT_INFO_CHANNEL_ID = "重要なお知らせ"

    val OTHER_CHANNEL = "その他"
    val OTHER_CHANNEL_ID = "その他"


    private val runnable = Runnable {
        // write code that you want to delay. for example,
        Log.d(",", "TAG")
//        addSummaryNotification()
    }

    private var pushAddBtn: Button? = null
    private var pushShowBtnBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 足跡の通知
        pushShowBtnBtn = findViewById(R.id.footPrint)
        pushAddBtn = findViewById(R.id.button2)


        // メールの通知
        pushAddBtn?.setOnClickListener {

            Handler().postDelayed(
                runnable, 2000
            )
            addSummaryNotification()
        }

        // 足跡を通知する
        pushShowBtnBtn?.setOnClickListener {
            addFootPrintSummaryNotification()
        }

    }


    // メール通知の表示メソッド
    fun addSummaryNotification() {
//


        val pref: SharedPreferences = getSharedPreferences(
            PreferenceKey.PREFERENCES_FILE,
            Context.MODE_PRIVATE
        )
        val edit = pref.edit()

        val pushId = pref.getInt(PreferenceKey.PREFERENCES_KEY_PUSH_ID, 0)

        val childNotification1 = createChildNotification(pushId)
        val childNotification2 = createChildNotification(pushId)
        val childNotification3 = createChildNotification(pushId)
        val childNotification4 = createChildNotification(pushId)
//
//        val summaryNotification = NotificationCompat.Builder(this@MainActivity, CHANNEL_ID)
//            .setContentTitle("Summary")
//            .setSmallIcon(R.drawable.ic_stat_name)
//            .setGroup(GROUP_KEY)
//            .setGroupSummary(true)
//            .build()
//        val notificationManager = NotificationManagerCompat.from(this)
//
//        Log.d("childNotification1", "TAG childNotification1= $childNotification1")

        with(NotificationManagerCompat.from(this)) {


            Log.d("TAG プリファレンス ID = ", "pushId=" + pushId)

            notify(pushId, childNotification1.build())

            edit.putInt(PreferenceKey.PREFERENCES_KEY_PUSH_ID, pushId + 1)
            edit.apply()

//            notify(1, childNotification1.build())
//            notify(2, childNotification1.build())
//            notify(3, childNotification1.build())
//            notify(4, childNotification1.build())
        }

//        notificationManager.notify(1, childNotification1)
//        notificationManager.notify(2, childNotification)
//        notificationManager.notify(SUMMARY_ID, summaryNotification)
    }


    // 足跡通知の表示メソッド
    fun addFootPrintSummaryNotification() {

        val pref: SharedPreferences = getSharedPreferences(
            PreferenceKey.PREFERENCES_FILE,
            Context.MODE_PRIVATE
        )
        val edit = pref.edit()

        val pushId = pref.getInt(PreferenceKey.PREFERENCES_KEY_PUSH_ID, 0)


        val FootPrintNotification1 = createFootPrintNotification(pushId)
        val FootPrintNotification2 = createFootPrintNotification(pushId)
        val FootPrintNotification3 = createFootPrintNotification(pushId)
        val FootPrintNotification4 = createFootPrintNotification(pushId)
//
//        val summaryNotification = NotificationCompat.Builder(this@MainActivity, CHANNEL_ID)
//            .setContentTitle("Summary")
//            .setSmallIcon(R.drawable.ic_stat_name)
//            .setGroup(GROUP_KEY)
//            .setGroupSummary(true)
//            .build()
//        val notificationManager = NotificationManagerCompat.from(this)
//
//        Log.d("childNotification1", "TAG childNotification1= $childNotification1")

        with(NotificationManagerCompat.from(this)) {

            Log.d("TAG プリファレンス ID = ", "pushId=" + pushId)

            notify(pushId, FootPrintNotification1.build())

            edit.putInt(PreferenceKey.PREFERENCES_KEY_PUSH_ID, pushId + 1)
            edit.apply()

//            notify(1, FootPrintNotification1.build())
//            notify(2, FootPrintNotification2.build())
//            notify(3, FootPrintNotification3.build())
//            notify(4, FootPrintNotification4.build())
        }

//        notificationManager.notify(1, childNotification1)
//        notificationManager.notify(2, childNotification)
//        notificationManager.notify(SUMMARY_ID, summaryNotification)
    }


    // メール通知の追加
    fun createChildNotification(num: Int): NotificationCompat.Builder {
//        val childNotification = NotificationCompat.Builder(this@MainActivity, CHANNEL_ID)
//                .setSmallIcon(R.drawable.ic_stat_name)
//                .setContentTitle("Content Title $num")
//                .setContentText("Content Text $num")
//                .setStyle(NotificationCompat.BigTextStyle()
//                        .setBigContentTitle("BigContentTitle $num")
//                        .setSummaryText("summary text $num")
//                        .bigText("Big Text $num"))
//                .setGroup(GROUP_KEY)
//                .build()
//        return childNotification


        val childNotification = NotificationCompat.Builder(this, MAIL_CHANNEL_ID).apply {
            setSmallIcon(R.drawable.ic_launcher_foreground)
            setContentTitle("MAIL_CHANNEL_ID")
            setContentText("メール内容を表示$num")
            setGroup(MAIL_CHANNEL_ID)
            priority = NotificationCompat.PRIORITY_DEFAULT
        }

// API 26 以上の場合は NotificationChannel に登録する
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "メール"
            val description = "メールの通知の説明文をここに記入できます。"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(MAIL_CHANNEL_ID, name, importance).apply {
                this.description = description
            }

            // システムにチャンネルを登録する
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }

        return childNotification
    }


    // 足跡の通知
    fun createFootPrintNotification(num: Int): NotificationCompat.Builder {

        val childNotification = NotificationCompat.Builder(this, FOOTPRINT_CHANNEL_ID).apply {
            setSmallIcon(R.drawable.ic_launcher_foreground)
            setContentTitle("足跡の通知")
            setContentText("足跡がつきました $num")
            priority = NotificationCompat.PRIORITY_DEFAULT
        }

        // API 26 以上の場合は NotificationChannel に登録する
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "足跡の通知"
            val description = "足跡の通知の説明文をここに記入できます。"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(FOOTPRINT_CHANNEL_ID, name, importance).apply {
                this.description = description
            }

            // システムにチャンネルを登録する
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }

        return childNotification
    }


    // メールのサマリー作成
    fun addMailSummaryNotification():  NotificationCompat.Builder {

//        val childNotification1 = createChildNotification(1)
//        val childNotification = createChildNotification(2)
//        NotificationCompat.Builder(this, FOOTPRINT_CHANNEL_ID).apply {
//        val summaryMailNotification = NotificationCompat.Builder(this@MainActivity, MAIL_CHANNEL_ID)
        //        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//
//        val notificationManager = NotificationManagerCompat.from(this)

        return NotificationCompat.Builder(this, MAIL_CHANNEL_ID).apply {
            setContentTitle("Summary")
            setSmallIcon(R.drawable.ic_stat_name)
            setGroup(MAIL_CHANNEL_ID)
            setGroupSummary(true)
            build()
        }

//        notificationManager.notify(SUMMARY_ID, summaryNotification)
    }

}