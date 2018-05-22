package eduardo.lab7

import android.content.Intent
import android.content.BroadcastReceiver
import android.content.Context
import android.util.Log


class AutoStart : BroadcastReceiver() {
    override fun onReceive(context: Context, arg1: Intent) {
        Log.i("AUTOSTART", "STARTED")
    }
}