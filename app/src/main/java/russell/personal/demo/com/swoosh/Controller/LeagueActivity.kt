package russell.personal.demo.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import russell.personal.demo.com.swoosh.Utilities.EXTRA_LEAGUE
import russell.personal.demo.com.swoosh.R

class LeagueActivity : BaseActivity() {

    var selectLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectLeague = "mens"
    }

    fun onWomensClicked(view:View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectLeague = "womens"

    }

    fun onCoedClicked(view:View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectLeague = "co-ed"

    }

    fun leagueNextClicked(view: View){

        if (selectLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }


}
