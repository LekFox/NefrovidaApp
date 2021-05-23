package mx.tec.quiz

object Constants {
    fun getQuestions(): ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Cuantos Litros de agua tomaste hoy?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            3
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "¿2?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litrosssss",
            2
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "¿3?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            3
        )
        questionList.add(question3)


        val question4 = Question(
            4,
            "¿4?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            4
        )
        questionList.add(question4)


        val question5 = Question(
            5,
            "¿5?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            1
        )
        questionList.add(question5)


        val question6 = Question(
            6,
            "¿6?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            2
        )
        questionList.add(question6)


        val question7 = Question(
            7,
            "¿7?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            3
        )
        questionList.add(question7)


        val question8 = Question(
            8,
            "¿8?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            3
        )
        questionList.add(question8)


        val question9 = Question(
            9,
            "¿9?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            4
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "¿10?",
            "1 Litro",
            "1.5 Litro",
            "2 Litro",
            "2.5 Litro",
            1
        )
        questionList.add(question10)

        return questionList
    }


}