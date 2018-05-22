package eduardo.lab7

import android.content.Context
import android.content.Intent
import android.util.Log
import android.content.BroadcastReceiver

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("ALARM", "AAAAAAAAAAAAAAAAAH")
    }
}