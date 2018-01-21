package russell.personal.demo.com.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import russell.personal.demo.com.swoosh.R
import russell.personal.demo.com.swoosh.Utilities.EXTRA_LEAGUE
import russell.personal.demo.com.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "looking for $league $skill league near you..."
    }
}
