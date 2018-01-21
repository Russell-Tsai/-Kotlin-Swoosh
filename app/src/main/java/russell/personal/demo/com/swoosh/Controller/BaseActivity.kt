package russell.personal.demo.com.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    var TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} on Create")
        super.onCreate(savedInstanceState)
    }


    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} on Start")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} on Resume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} on Restart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} on Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} on Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} on Destroy")
        super.onDestroy()
    }
}
