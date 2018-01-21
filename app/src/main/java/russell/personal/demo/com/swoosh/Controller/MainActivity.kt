package russell.personal.demo.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import russell.personal.demo.com.swoosh.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            var leagueIntent : Intent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
