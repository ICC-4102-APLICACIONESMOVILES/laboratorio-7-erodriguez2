package eduardo.lab7

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.util.Log
import android.content.BroadcastReceiver
import android.support.v4.app.NotificationCompat
import android.support.v4.app.TaskStackBuilder

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("ALARM", "AAAAAAAAAAAAAAAAAH")

        GenerateNotification(context)
    }

    private fun GenerateNotification(context: Context) {
        val stackBuilder = TaskStackBuilder.create(context)

        val builder = NotificationCompat.Builder(context, "channelId")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Nueva Notificacion")
                .setContentText("Contenido")

        builder.setAutoCancel(true)

        val mNotificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(0, builder.build())
    }
}