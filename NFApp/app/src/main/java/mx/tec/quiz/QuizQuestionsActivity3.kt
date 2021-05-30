package mx.tec.quiz


import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity3 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionList = Constants.getQuestions3()
        setQuestion()

        val option_one = findViewById<TextView>(R.id.tv_option_one)
        val option_two = findViewById<TextView>(R.id.tv_option_two)
        val option_three = findViewById<TextView>(R.id.tv_option_three)
        val option_four = findViewById<TextView>(R.id.tv_option_four)
        val button_submit = findViewById<Button>(R.id.btn_submit)

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        button_submit.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        val question = mQuestionList!!.get(mCurrentPosition-1)
        defaulOptionsView()

        val option_one = findViewById<TextView>(R.id.tv_option_one)
        val option_two = findViewById<TextView>(R.id.tv_option_two)
        val option_three = findViewById<TextView>(R.id.tv_option_three)
        val option_four = findViewById<TextView>(R.id.tv_option_four)
        val button_submit = findViewById<Button>(R.id.btn_submit)
        val progress = findViewById<TextView>(R.id.tv_progress)
        val pb = findViewById<ProgressBar>(R.id.progressBar)
        val tvQuestion = findViewById<TextView>(R.id.tv_question)

        if(mCurrentPosition == mQuestionList!!.size)
        {
            button_submit.text = "Terminar"
        }
        else
        {
            button_submit.text = "->"
        }

        pb.progress = mCurrentPosition
        progress.text = "$mCurrentPosition" + "/" + pb.max
        tvQuestion.text = question.question
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour

    }

    var incorrect = 0
    override fun onClick(v: View?){
        val sb = StringBuilder()
        if (v != null) {
            val option_one = findViewById<TextView>(R.id.tv_option_one)
            val option_two = findViewById<TextView>(R.id.tv_option_two)
            val option_three = findViewById<TextView>(R.id.tv_option_three)
            val option_four = findViewById<TextView>(R.id.tv_option_four)
            val button_submit = findViewById<Button>(R.id.btn_submit)
            when(v.id){
                R.id.tv_option_one -> {
                    selectedOptionView(option_one, 1)
                }
                R.id.tv_option_two -> {
                    selectedOptionView(option_two, 2)
                }
                R.id.tv_option_three -> {
                    selectedOptionView(option_three, 3)
                }
                R.id.tv_option_four -> {
                    selectedOptionView(option_four, 4)
                }

                R.id.btn_submit -> {
                    if(mSelectedOptionPosition == 0) {
                        mCurrentPosition++
                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                sb.append(incorrect).append(" respuestas incorrectas de 6 preguntas")
                                val finalMsgText = sb.toString()

                                val toast = Toast.makeText(this, finalMsgText, Toast.LENGTH_SHORT)
                                toast.show()
//                                Toast.makeText(
//                                        this,
//                                        "You've successfully completed the quiz.", Toast.LENGTH_SHORT
//                                ).show()
                                val intent = Intent(this, MainActivity::class.java)

                                startActivity(intent)

                            }
                        }
                    } else{
                        val question = mQuestionList?.get(mCurrentPosition-1)
                        if(question!!.correctOption != mSelectedOptionPosition){
                            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                            incorrect++
                        }
                        answerView(question.correctOption, R.drawable.correct_option_border_bg)
                        if(mCurrentPosition == mQuestionList!!.size){
                            button_submit.text = "Terminar"
                        } else{
                            button_submit.text = "Siguiente pregunta"
                        }
                        mSelectedOptionPosition=0
                    }
                }
            }
        }
    }


    private fun defaulOptionsView() {
        val options = ArrayList <TextView>()
        val option_one = findViewById<TextView>(R.id.tv_option_one)
        val option_two = findViewById<TextView>(R.id.tv_option_two)
        val option_three = findViewById<TextView>(R.id.tv_option_three)
        val option_four = findViewById<TextView>(R.id.tv_option_four)
        options.add(0,option_one)
        options.add(0,option_two)
        options.add(0,option_three)
        options.add(0,option_four)

        for(option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){

        defaulOptionsView()

        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg)

    }

    private fun answerView(answer: Int, drawableView: Int){
        val option_one = findViewById<TextView>(R.id.tv_option_one)
        val option_two = findViewById<TextView>(R.id.tv_option_two)
        val option_three = findViewById<TextView>(R.id.tv_option_three)
        val option_four = findViewById<TextView>(R.id.tv_option_four)

        when(answer){
            1 -> {
                option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }
}

