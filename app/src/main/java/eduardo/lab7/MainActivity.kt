package eduardo.lab7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.PendingIntent
import android.app.AlarmManager
import android.content.BroadcastReceiver
import android.content.Context
import android.os.SystemClock
import android.content.Intent


class MainActivity : AppCompatActivity() {

    private var alarmMgr: AlarmManager? = null
    private var alarmIntent: PendingIntent? = null
    private val INTERVAL_IN_MILLISECONDS = 5000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alarmMgr = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        alarmMgr!!.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() + INTERVAL_IN_MILLISECONDS,
                INTERVAL_IN_MILLISECONDS, alarmIntent)
    }
}
