package mx.tec.quiz

object Constants {
    fun getQuestions(): ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Cuántas porciones de frutas o verduras debe comer al día?",
            "1",
            "2",
            "3",
            "5",
            4
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "¿Cuántos minutos de ejercicio o actividad necesita cada día?",
            "20 minutos",
            "0 minutos",
            "30 minutos o más",
            "10 minutos",
            3
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "¿Qué mantendrá sus huesos fuertes y saludables?",
            "Vegetales",
            "Carne",
            "Huevo",
            "Leche, yogur y queso",
            4
        )
        questionList.add(question3)


        val question4 = Question(
            4,
            "¿Al menos cuántas horas debe dormir cada día?",
            "8 horas",
            "5 horas",
            "6 horas",
            "10 horas",
            1
        )
        questionList.add(question4)


        val question5 = Question(
            5,
            "¿Al menos cuántas comidas tiene que comer al día?",
            "1",
            "2",
            "3",
            "4",
            3
        )
        questionList.add(question5)


        val question6 = Question(
            6,
            "¿Cuántos vasos de agua debes beber al día?",
            "10-12",
            "8-10",
            "6-8",
            "4-6",
            3
        )
        questionList.add(question6)

        return questionList
    }

    fun getQuestions2(): ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Cuánto ejercicio hace en promedio al día?",
            "20-30 minutos",
            "10-20 minutos",
            "",
            "",
            1
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "¿Le gusta hacer ejercicio?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "¿Te mantienes en forma?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question3)


        val question4 = Question(
            4,
            "¿Come sano?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question4)


        val question5 = Question(
            5,
            "¿Juegas un deporte de fin de semana?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question5)

        return questionList
    }

    fun getQuestions3(): ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Qué grupo de alimentos debería comer más cada día?",
            "Vegetal",
            "Grano",
            "Fruta",
            "Carne",
            2
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "¿Qué nutriente te ayuda a crecer y desarrollar músculos fuertes?",
            "Lípidos",
            "Proteína",
            "Minerales",
            "Creatina",
            2
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "¿A qué grupo de alimentos pertenece una fresa?",
            "Vegetal",
            "Fruta",
            "Fructosa",
            "Banana",
            2
        )
        questionList.add(question3)


        val question4 = Question(
            4,
            "¿Qué grasa es la grasa \"saludable\"?",
            "Grasa saturada",
            "Grasas trans",
            "Grasa no saturada",
            "Grasa animal",
            3
        )
        questionList.add(question4)


        val question5 = Question(
            5,
            "¿Qué nutriente te proporciona tu primera fuente de energía?",
            "Proteína",
            "Vitaminas B",
            "Lípidos",
            "Carbohidratos",
            4
        )
        questionList.add(question5)


        val question6 = Question(
            6,
            "¿A qué grupo de alimentos pertenece el cereal?",
            "Grano",
            "Trigo",
            "Vegetal",
            "Leche",
            1
        )
        questionList.add(question6)


        val question7 = Question(
            7,
            "¿Qué nutriente constituye la mayor parte de su cuerpo?",
            "Vitaminas",
            "Minerales",
            "Sangre",
            "Agua",
            4
        )
        questionList.add(question7)


        val question8 = Question(
            8,
            "¿La proteína nutritiva se puede encontrar principalmente en qué grupo de alimentos?",
            "Vegetal",
            "Fruta",
            "Granos",
            "Carnes y frijoles",
            4
        )
        questionList.add(question8)


        val question9 = Question(
            9,
            "¿Cuál de los siguientes minerales ayuda a formar huesos y dientes fuertes?",
            "Calcio",
            "Zinc",
            "Folato",
            "Hierro",
            1
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "¿Qué alimento es una buena fuente de vitamina C?",
            "Pan de grano entero",
            "Tocino",
            "Naranja",
            "Nueces",
            3
        )
        questionList.add(question10)

        return questionList
    }

    fun getQuestions4(): ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Durmió 8 horas?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "¿Comió saludablemente??",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "¿Ejercitó su mente leyendo o realizando ejercicios mentales como sudoku?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question3)


        val question4 = Question(
            4,
            "¿Se relajó 15 minutos al día y no pensó en sus problemas, se concentró en su respiración y su cuerpo?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question4)


        val question5 = Question(
            5,
            "¿Presentó cambios de humor repentinos o ansiedad o sentimientos de culpa o preocupación o desconexión de la realidad o pensamientos suicidas?",
            "Si",
            "No",
            "-",
            "-",
            1
        )
        questionList.add(question5)

        return questionList
    }


}