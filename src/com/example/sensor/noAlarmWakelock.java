package com.example.sensor;
//package com.example.sensor;
//
//ȭ�� ��װ� �Ѵ� Ŭ����������  ������ ��ġ�� ���ؼ� ���x
//
//import android.content.Context;
//import android.os.PowerManager;
//
//public class AlarmWakelock  {
//	/** Called when the activity is first created. */
//
//
// 
//		private static final String TAG = "AlarmWakelock";
//		private static PowerManager.WakeLock mWakeLock;
//
//		public static void wakeLock(Context context) {
//			if (mWakeLock != null) {
//				return;
//			}
//
//			PowerManager powerManager = (PowerManager) context
//					.getSystemService(context.POWER_SERVICE);
//			mWakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
//					TAG);
//			mWakeLock.acquire();
//		}
//
//		public static void releaseWakeLock() {
//			if (mWakeLock != null) {
//				mWakeLock.release();
//				mWakeLock = null;
//			}
//		}
//
//}
