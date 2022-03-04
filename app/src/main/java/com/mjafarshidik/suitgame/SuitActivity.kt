package com.mjafarshidik.suitgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mjafarshidik.suitgame.databinding.ActivitySuitBinding
import com.shashank.sony.fancytoastlib.FancyToast

class SuitActivity : AppCompatActivity() {
    private lateinit var suitBinding: ActivitySuitBinding
    private var statusRock1: Boolean = false
    private var statusPaper1: Boolean = false
    private var statusScissor1: Boolean = false
    private var statusRock2: Boolean = false
    private var statusPaper2: Boolean = false
    private var statusScissor2: Boolean = false
    private var optionP1 = 0
    private var optionP2 = 0
    private var finalResult = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        suitBinding = ActivitySuitBinding.inflate(layoutInflater)
        setContentView(suitBinding.root)
        pickOptionPlayerOne()
        pickOptionPlayerTwo()
        suitBinding.apply {
            btnFight.setOnClickListener {
                gameResult()
                clearAnswer()
            }
            btnBack.setOnClickListener {
                onBackPressed()
            }
        }
    }

    private fun gameResult() {
        if (optionP1 == 0 && optionP2 == 0) {
            finalResult = "Please select an option first"
        } else if (optionP2 == 0) {
            finalResult = "Please select an option first"
        } else if (optionP1 == 0) {
            finalResult = "Please select an option first"
        } else if (optionP1 == 1 && optionP2 == 1) {
            finalResult = "Draw"
        } else if (optionP1 == 2 && optionP2 == 2) {
            finalResult = "Draw"
        } else if (optionP1 == 3 && optionP2 == 3) {
            finalResult = "Draw"
        } else if (optionP1 == 1 && optionP2 == 3) {
            finalResult = "Player 1 wins!"
        } else if (optionP1 == 2 && optionP2 == 1) {
            finalResult = "Player 1 wins!"
        } else if (optionP1 == 3 && optionP2 == 2) {
            finalResult = "Player 1 wins!"
        } else if (optionP1 == 1 && optionP2 == 2) {
            finalResult = "Player 2 wins!"
        } else if (optionP1 == 3 && optionP2 == 1) {
            finalResult = "Player 2 wins!"
        } else if (optionP1 == 2 && optionP2 == 3) {
            finalResult = "Player 2 wins!"
        }
        
        FancyToast.makeText(this, finalResult, FancyToast.LENGTH_LONG, FancyToast.DEFAULT,true).show()
    }

    private fun pickOptionPlayerOne() {
        suitBinding.apply {
            rockP1.setOnClickListener {
                if (statusRock1) {
                    rockP1.setImageResource(R.drawable.rock_p1)
                    paperP1.setImageResource(R.drawable.paper_p1)
                    scissorP1.setImageResource(R.drawable.scissor_p1)
                    statusRock1 = false
                    statusPaper1 = false
                    statusScissor1 = false
                } else {
                    rockP1.setImageResource(R.drawable.rock_p1_selected)
                    paperP1.setImageResource(R.drawable.paper_p1)
                    scissorP1.setImageResource(R.drawable.scissor_p1)
                    statusRock1 = true
                    statusPaper1 = false
                    statusScissor1 = false
                    optionP1 = 1
                }
            }

            paperP1.setOnClickListener {
                if (statusPaper1) {
                    rockP1.setImageResource(R.drawable.rock_p1)
                    paperP1.setImageResource(R.drawable.paper_p1)
                    scissorP1.setImageResource(R.drawable.scissor_p1)
                    statusRock1 = false
                    statusPaper1 = false
                    statusScissor1 = false
                } else {
                    rockP1.setImageResource(R.drawable.rock_p1)
                    paperP1.setImageResource(R.drawable.paper_p1_selected)
                    scissorP1.setImageResource(R.drawable.scissor_p1)
                    statusPaper1 = true
                    statusRock1 = false
                    statusScissor1 = false
                    optionP1 = 2
                }
            }

            scissorP1.setOnClickListener {
                if (statusScissor1) {
                    rockP1.setImageResource(R.drawable.rock_p1)
                    paperP1.setImageResource(R.drawable.paper_p1)
                    scissorP1.setImageResource(R.drawable.scissor_p1)
                    statusRock1 = false
                    statusPaper1 = false
                    statusScissor1 = false
                } else {
                    rockP1.setImageResource(R.drawable.rock_p1)
                    paperP1.setImageResource(R.drawable.paper_p1)
                    scissorP1.setImageResource(R.drawable.scissor_p1_selected)
                    statusPaper1 = false
                    statusRock1 = false
                    statusScissor1 = true
                    optionP1 = 3
                }
            }
        }
    }

    private fun pickOptionPlayerTwo() {
        suitBinding.apply {
            rockP2.setOnClickListener {
                if (statusRock2) {
                    rockP2.setImageResource(R.drawable.rock_p2)
                    paperP2.setImageResource(R.drawable.paper_p2)
                    scissorP2.setImageResource(R.drawable.scissor_p2)
                    statusRock2 = false
                    statusPaper2 = false
                    statusScissor2 = false
                } else {
                    rockP2.setImageResource(R.drawable.rock_p2_selected)
                    paperP2.setImageResource(R.drawable.paper_p2)
                    scissorP2.setImageResource(R.drawable.scissor_p2)
                    statusRock2 = true
                    statusPaper2 = false
                    statusScissor2 = false
                    optionP2 = 1
                }
            }

            paperP2.setOnClickListener {
                if (statusPaper2) {
                    rockP2.setImageResource(R.drawable.rock_p2)
                    paperP2.setImageResource(R.drawable.paper_p2)
                    scissorP2.setImageResource(R.drawable.scissor_p2)
                    statusRock2 = false
                    statusPaper2 = false
                    statusScissor2 = false
                } else {
                    rockP2.setImageResource(R.drawable.rock_p2)
                    paperP2.setImageResource(R.drawable.paper_p2_selected)
                    scissorP2.setImageResource(R.drawable.scissor_p2)
                    statusPaper2 = true
                    statusRock2 = false
                    statusScissor2 = false
                    optionP2 = 2
                }
            }

            scissorP2.setOnClickListener {
                if (statusScissor2) {
                    rockP2.setImageResource(R.drawable.rock_p2)
                    paperP2.setImageResource(R.drawable.paper_p2)
                    scissorP2.setImageResource(R.drawable.scissor_p2)
                    statusRock2 = false
                    statusPaper2 = false
                    statusScissor2 = false
                } else {
                    rockP2.setImageResource(R.drawable.rock_p2)
                    paperP2.setImageResource(R.drawable.paper_p2)
                    scissorP2.setImageResource(R.drawable.scissor_p2_selected)
                    statusPaper2 = false
                    statusRock2 = false
                    statusScissor2 = true
                    optionP2 = 3
                }
            }
        }
    }

    private fun clearAnswer() {
        suitBinding.apply {
            rockP1.setImageResource(R.drawable.rock_p1)
            paperP1.setImageResource(R.drawable.paper_p1)
            scissorP1.setImageResource(R.drawable.scissor_p1)
            rockP2.setImageResource(R.drawable.rock_p2)
            paperP2.setImageResource(R.drawable.paper_p2)
            scissorP2.setImageResource(R.drawable.scissor_p2)
            statusRock1 = false
            statusPaper1 = false
            statusScissor1 = false
            statusRock2 = false
            statusPaper2 = false
            statusScissor2 = false
            optionP1 = 0
            optionP2 = 0
        }
    }
}