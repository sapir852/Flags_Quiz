package com.sapir.flags_quiz;

import java.util.ArrayList;
import com.sapir.flags_quiz.Level;
import com.sapir.flags_quiz.R;


public class Data_Manager {
    private static Data_Manager dataManager = null;


    public static Data_Manager getData() {
        return dataManager;
    }
    public static ArrayList<Level> getLevel() {
        ArrayList<Level> levels1 = new ArrayList<>();

        levels1.add(new Level()
                .setLevels("Level 1")
                .setImage(R.drawable.flag_il));

        levels1.add(new Level()
                .setLevels("Level 2")
                .setImage(R.drawable.flag_br));

        levels1.add(new Level()
                .setLevels("Level 3")
                .setImage(R.drawable.flag_kr));

        levels1.add(new Level()
                .setLevels("Level 4")
                .setImage(R.drawable.flag_ge));

        levels1.add(new Level()
                .setLevels("Level 5")
                .setImage(R.drawable.flag_fr));

        levels1.add(new Level()
                .setLevels("Level 6")
                .setImage(R.drawable.flag_ca));



        return levels1;
    }
    public static ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question.Builder()
                .setId(1)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Germany")
                .setOption2("Spain")
                .setOption3("Albania")
                .setOption4("Italy")
                .setAnswer("Albania")
                .setImageRes(R.drawable.flag_al)
                .build());

        questions.add(new Question.Builder()
                .setId(2)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Austria")
                .setOption2("Spain")
                .setOption3("Brazil")
                .setOption4("Cuba")
                .setAnswer("Cuba")
                .setImageRes(R.drawable.flag_cu)
                .build());

        questions.add(new Question.Builder()
                .setId(3)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Egypt")
                .setOption2("Spain")
                .setOption3("Brazil")
                .setOption4("Cuba")
                .setAnswer("Egypt")
                .setImageRes(R.drawable.flag_eg)
                .build());

        questions.add(new Question.Builder()
                .setId(4)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Eswatini")
                .setOption2("Israel")
                .setOption3("Brazil")
                .setOption4("Cuba")
                .setAnswer("Israel")
                .setImageRes(R.drawable.flag_il)
                .build());

        questions.add(new Question.Builder()
                .setId(5)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("china")
                .setOption2("Korea")
                .setOption3("Japan")
                .setOption4("Italy")
                .setAnswer("china")
                .setImageRes(R.drawable.flag_jp)
                .build());

        questions.add(new Question.Builder()
                .setId(6)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("china")
                .setOption2("Korea")
                .setOption3("Japan")
                .setOption4("Mexico")
                .setAnswer("Korea")
                .setImageRes(R.drawable.flag_kr)
                .build());

        questions.add(new Question.Builder()
                .setId(7)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("France")
                .setOption2("Germany")
                .setOption3("Italy")
                .setOption4("Spain")
                .setAnswer("France")
                .setImageRes(R.drawable.flag_fr)
                .build());


        questions.add(new Question.Builder()
                .setId(8)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Brazil")
                .setOption2("Argentina")
                .setOption3("Chile")
                .setOption4("Mexico")
                .setAnswer("Brazil")
                .setImageRes(R.drawable.flag_br)
                .build());

// Question 3
        questions.add(new Question.Builder()
                .setId(9)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("New Zealand")
                .setOption2("Australia")
                .setOption3("Canada")
                .setOption4("United Kingdom")
                .setAnswer("Canada")
                .setImageRes(R.drawable.flag_ca)
                .build());

        questions.add(new Question.Builder()
                .setId(10)
                .setScore(10)
                .setQuestion("Which country does this flag symbolize?")
                .setOption1("Sri Lanka")
                .setOption2("Pakistan")
                .setOption3("Bangladesh")
                .setOption4("India")
                .setAnswer("India")
                .setImageRes(R.drawable.flag_in)
                .build());


        questions.add(new Question.Builder()
                .setId(11)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Australia")
                .setOption2("United States")
                .setOption3("Canada")
                .setOption4("Russia")
                .setAnswer("Russia")
                .setImageRes(R.drawable.flag_ru)
                .build());


        questions.add(new Question.Builder()
                .setId(12)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Kenya")
                .setOption2("South Africa")
                .setOption3("Nigeria")
                .setOption4("Egypt")
                .setAnswer("South Africa")
                .setImageRes(R.drawable.flag_za)
                .build());


         questions.add(new Question.Builder()
                .setId(13)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Chile")
                .setOption2("Mexico")
                .setOption3("Brazil")
                .setOption4("Argentina")
                .setAnswer("Argentina")
                .setImageRes(R.drawable.flag_ar)
                .build());


        questions.add(new Question.Builder()
                .setId(14)
                .setScore(10)
                .setQuestion("What is the country represented by this flag?")
                .setOption1("Germany")
                .setOption2("France")
                .setOption3("Italy")
                .setOption4("Spain")
                .setAnswer("Germany")
                .setImageRes(R.drawable.flag_de)
                .build());

        // Question 15
        questions.add(new Question.Builder()
                .setId(15)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Japan")
                .setOption2("China")
                .setOption3("South Korea")
                .setOption4("Vietnam")
                .setAnswer("Japan")
                .setImageRes(R.drawable.flag_jp)
                .build());

// Question 16
        questions.add(new Question.Builder()
                .setId(16)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Russia")
                .setOption2("Romania")
                .setOption3("Monaco")
                .setOption4("Bulgaria")
                .setAnswer("Bulgaria")
                .setImageRes(R.drawable.flag_bg)
                .build());

// Question 17
        questions.add(new Question.Builder()
                .setId(17)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Norway")
                .setOption2("Sweden")
                .setOption3("Denmark")
                .setOption4("Finland")
                .setAnswer("Denmark")
                .setImageRes(R.drawable.flag_dk)
                .build());

// Question 18
        questions.add(new Question.Builder()
                .setId(18)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Saudi Arabia")
                .setOption2("United Arab Emirates")
                .setOption3("Qatar")
                .setOption4("Oman")
                .setAnswer("United Arab Emirates")
                .setImageRes(R.drawable.flag_ae)
                .build());

// Question 19
        questions.add(new Question.Builder()
                .setId(19)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Turkey")
                .setOption2("Greece")
                .setOption3("Egypt")
                .setOption4("Lebanon")
                .setAnswer("Turkey")
                .setImageRes(R.drawable.flag_tr)
                .build());

// Question 20
        questions.add(new Question.Builder()
                .setId(20)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Netherlands")
                .setOption2("Luxembourg")
                .setOption3("Belgium")
                .setOption4("Liechtenstein")
                .setAnswer("Netherlands")
                .setImageRes(R.drawable.flag_nl)
                .build());

// Question 21
        questions.add(new Question.Builder()
                .setId(21)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Switzerland")
                .setOption2("Sweden")
                .setOption3("Norway")
                .setOption4("Finland")
                .setAnswer("Sweden")
                .setImageRes(R.drawable.flag_se)
                .build());

// Question 22
        questions.add(new Question.Builder()
                .setId(22)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Poland")
                .setOption2("Indonesia")
                .setOption3("Monaco")
                .setOption4("Singapore")
                .setAnswer("Indonesia")
                .setImageRes(R.drawable.flag_id)
                .build());

// Question 23
        questions.add(new Question.Builder()
                .setId(23)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Argentina")
                .setOption2("Brazil")
                .setOption3("Chile")
                .setOption4("Peru")
                .setAnswer("Peru")
                .setImageRes(R.drawable.flag_pe)
                .build());

// Question 24
        questions.add(new Question.Builder()
                .setId(24)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("South Africa")
                .setOption2("Zimbabwe")
                .setOption3("Zambia")
                .setOption4("Kenya")
                .setAnswer("Zimbabwe")
                .setImageRes(R.drawable.flag_zw)
                .build());

// Question 25
        questions.add(new Question.Builder()
                .setId(25)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Australia")
                .setOption2("New Zealand")
                .setOption3("Fiji")
                .setOption4("Papua New Guinea")
                .setAnswer("New Zealand")
                .setImageRes(R.drawable.flag_nz)
                .build());

// Question 26
        questions.add(new Question.Builder()
                .setId(26)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Colombia")
                .setOption2("Ecuador")
                .setOption3("Venezuela")
                .setOption4("Panama")
                .setAnswer("Ecuador")
                .setImageRes(R.drawable.flag_ec)
                .build());

// Question 27
        questions.add(new Question.Builder()
                .setId(27)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Ireland")
                .setOption2("Scotland")
                .setOption3("Wales")
                .setOption4("United Kingdom")
                .setAnswer("Ireland")
                .setImageRes(R.drawable.flag_ie)
                .build());

// Question 28
        questions.add(new Question.Builder()
                .setId(28)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Austria")
                .setOption2("Hungary")
                .setOption3("Slovakia")
                .setOption4("Czech Republic")
                .setAnswer("Hungary")
                .setImageRes(R.drawable.flag_hu)
                .build());

// Question 29
        questions.add(new Question.Builder()
                .setId(29)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Algeria")
                .setOption2("Tunisia")
                .setOption3("Morocco")
                .setOption4("Libya")
                .setAnswer("Tunisia")
                .setImageRes(R.drawable.flag_tn)
                .build());

// Question 30
        questions.add(new Question.Builder()
                .setId(30)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Vietnam")
                .setOption2("Laos")
                .setOption3("Cambodia")
                .setOption4("Thailand")
                .setAnswer("Cambodia")
                .setImageRes(R.drawable.flag_kh)
                .build());
// Question 31
        questions.add(new Question.Builder()
                .setId(31)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Switzerland")
                .setOption2("Liechtenstein")
                .setOption3("Austria")
                .setOption4("Luxembourg")
                .setAnswer("Liechtenstein")
                .setImageRes(R.drawable.flag_li)
                .build());

// Question 32
        questions.add(new Question.Builder()
                .setId(32)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Finland")
                .setOption2("Estonia")
                .setOption3("Latvia")
                .setOption4("Lithuania")
                .setAnswer("Latvia")
                .setImageRes(R.drawable.flag_lv)
                .build());

// Question 33
        questions.add(new Question.Builder()
                .setId(33)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Croatia")
                .setOption2("Serbia")
                .setOption3("Bosnia and Herzegovina")
                .setOption4("Montenegro")
                .setAnswer("Croatia")
                .setImageRes(R.drawable.flag_hr)
                .build());

// Question 34
        questions.add(new Question.Builder()
                .setId(34)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Slovenia")
                .setOption2("Slovakia")
                .setOption3("Czech Republic")
                .setOption4("Bulgaria")
                .setAnswer("Slovakia")
                .setImageRes(R.drawable.flag_sk)
                .build());

// Question 35
        questions.add(new Question.Builder()
                .setId(35)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Malaysia")
                .setOption2("Singapore")
                .setOption3("Brunei")
                .setOption4("Indonesia")
                .setAnswer("Brunei")
                .setImageRes(R.drawable.flag_bn)
                .build());

// Question 36
        questions.add(new Question.Builder()
                .setId(36)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Angola")
                .setOption2("Mozambique")
                .setOption3("Guinea-Bissau")
                .setOption4("Cape Verde")
                .setAnswer("Mozambique")
                .setImageRes(R.drawable.flag_mz)
                .build());

// Question 37
        questions.add(new Question.Builder()
                .setId(37)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Iceland")
                .setOption2("Greenland")
                .setOption3("Faroe Islands")
                .setOption4("Norway")
                .setAnswer("Greenland")
                .setImageRes(R.drawable.flag_gl)
                .build());

// Question 38
        questions.add(new Question.Builder()
                .setId(38)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Liberia")
                .setOption2("Sierra Leone")
                .setOption3("Guinea")
                .setOption4("Gambia")
                .setAnswer("Sierra Leone")
                .setImageRes(R.drawable.flag_sl)
                .build());

// Question 39
        questions.add(new Question.Builder()
                .setId(39)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Nigeria")
                .setOption2("Ghana")
                .setOption3("Senegal")
                .setOption4("Cameroon")
                .setAnswer("Ghana")
                .setImageRes(R.drawable.flag_gh)
                .build());

// Question 40
        questions.add(new Question.Builder()
                .setId(40)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Morocco")
                .setOption2("Tunisia")
                .setOption3("Libya")
                .setOption4("Algeria")
                .setAnswer("Libya")
                .setImageRes(R.drawable.flag_ly)
                .build());

// Question 41
        questions.add(new Question.Builder()
                .setId(41)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Iran")
                .setOption2("Iraq")
                .setOption3("Saudi Arabia")
                .setOption4("Yemen")
                .setAnswer("Iran")
                .setImageRes(R.drawable.flag_ir)
                .build());

// Question 42
        questions.add(new Question.Builder()
                .setId(42)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Ethiopia")
                .setOption2("Eritrea")
                .setOption3("Djibouti")
                .setOption4("Somalia")
                .setAnswer("Djibouti")
                .setImageRes(R.drawable.flag_dj)
                .build());

// Question 43
        questions.add(new Question.Builder()
                .setId(43)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Uruguay")
                .setOption2("Paraguay")
                .setOption3("Bolivia")
                .setOption4("Argentina")
                .setAnswer("Paraguay")
                .setImageRes(R.drawable.flag_py)
                .build());

// Question 44
        questions.add(new Question.Builder()
                .setId(44)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Nicaragua")
                .setOption2("Costa Rica")
                .setOption3("Honduras")
                .setOption4("El Salvador")
                .setAnswer("Costa Rica")
                .setImageRes(R.drawable.flag_cr)
                .build());

// Question 45
        questions.add(new Question.Builder()
                .setId(45)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Dominican Republic")
                .setOption2("Haiti")
                .setOption3("Cuba")
                .setOption4("Jamaica")
                .setAnswer("Haiti")
                .setImageRes(R.drawable.flag_ht)
                .build());

// Question 46
        questions.add(new Question.Builder()
                .setId(46)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Bangladesh")
                .setOption2("Malaysia")
                .setOption3("Indonesia")
                .setOption4("Pakistan")
                .setAnswer("Bangladesh")
                .setImageRes(R.drawable.flag_bd)
                .build());

// Question 47
        questions.add(new Question.Builder()
                .setId(47)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Sri Lanka")
                .setOption2("Maldives")
                .setOption3("Bhutan")
                .setOption4("Nepal")
                .setAnswer("Maldives")
                .setImageRes(R.drawable.flag_mv)
                .build());

// Question 48
        questions.add(new Question.Builder()
                .setId(48)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Mauritius")
                .setOption2("Seychelles")
                .setOption3("Madagascar")
                .setOption4("Comoros")
                .setAnswer("Mauritius")
                .setImageRes(R.drawable.flag_mu)
                .build());

// Question 49
        questions.add(new Question.Builder()
                .setId(49)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Malta")
                .setOption2("Cyprus")
                .setOption3("Greece")
                .setOption4("Italy")
                .setAnswer("Cyprus")
                .setImageRes(R.drawable.flag_cy)
                .build());

// Question 50
        questions.add(new Question.Builder()
                .setId(50)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Trinidad and Tobago")
                .setOption2("Guyana")
                .setOption3("Barbados")
                .setOption4("Suriname")
                .setAnswer("Guyana")
                .setImageRes(R.drawable.flag_gy)
                .build());

// Question 51
        questions.add(new Question.Builder()
                .setId(51)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Fiji")
                .setOption2("Vanuatu")
                .setOption3("Solomon Islands")
                .setOption4("Samoa")
                .setAnswer("Vanuatu")
                .setImageRes(R.drawable.flag_vu)
                .build());

// Question 52
        questions.add(new Question.Builder()
                .setId(52)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Tonga")
                .setOption2("Kiribati")
                .setOption3("Tuvalu")
                .setOption4("Palau")
                .setAnswer("Kiribati")
                .setImageRes(R.drawable.flag_ki)
                .build());

// Question 53
        questions.add(new Question.Builder()
                .setId(53)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Nauru")
                .setOption2("Micronesia")
                .setOption3("Marshall Islands")
                .setOption4("Papua New Guinea")
                .setAnswer("Nauru")
                .setImageRes(R.drawable.flag_nr)
                .build());

// Question 54
        questions.add(new Question.Builder()
                .setId(54)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Bahamas")
                .setOption2("Jamaica")
                .setOption3("Trinidad and Tobago")
                .setOption4("Barbados")
                .setAnswer("Bahamas")
                .setImageRes(R.drawable.flag_bs)
                .build());

// Question 55
        questions.add(new Question.Builder()
                .setId(55)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Saint Lucia")
                .setOption2("Saint Kitts and Nevis")
                .setOption3("Saint Vincent and the Grenadines")
                .setOption4("Antigua and Barbuda")
                .setAnswer("Saint Lucia")
                .setImageRes(R.drawable.flag_lc)
                .build());

// Question 56
        questions.add(new Question.Builder()
                .setId(56)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Grenada")
                .setOption2("Dominica")
                .setOption3("Saint Kitts and Nevis")
                .setOption4("Saint Vincent and the Grenadines")
                .setAnswer("Grenada")
                .setImageRes(R.drawable.flag_gd)
                .build());

// Question 57
        questions.add(new Question.Builder()
                .setId(57)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Guatemala")
                .setOption2("Honduras")
                .setOption3("El Salvador")
                .setOption4("Nicaragua")
                .setAnswer("Guatemala")
                .setImageRes(R.drawable.flag_gt)
                .build());

// Question 58
        questions.add(new Question.Builder()
                .setId(58)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Belize")
                .setOption2("Costa Rica")
                .setOption3("Panama")
                .setOption4("Honduras")
                .setAnswer("Belize")
                .setImageRes(R.drawable.flag_bz)
                .build());

// Question 59
        questions.add(new Question.Builder()
                .setId(59)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Saint Vincent and the Grenadines")
                .setOption2("Antigua and Barbuda")
                .setOption3("Barbados")
                .setOption4("Grenada")
                .setAnswer("Antigua and Barbuda")
                .setImageRes(R.drawable.flag_ag)
                .build());

// Question 60
        questions.add(new Question.Builder()
                .setId(60)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Saint Kitts and Nevis")
                .setOption2("Dominica")
                .setOption3("Saint Lucia")
                .setOption4("Grenada")
                .setAnswer("Dominica")
                .setImageRes(R.drawable.flag_dm)
                .build());

// Question 61
        questions.add(new Question.Builder()
                .setId(61)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Seychelles")
                .setOption2("Mauritius")
                .setOption3("Maldives")
                .setOption4("Sri Lanka")
                .setAnswer("Seychelles")
                .setImageRes(R.drawable.flag_sc)
                .build());

// Question 62
        questions.add(new Question.Builder()
                .setId(62)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Fiji")
                .setOption2("Tonga")
                .setOption3("Samoa")
                .setOption4("Vanuatu")
                .setAnswer("Tonga")
                .setImageRes(R.drawable.flag_to)
                .build());

// Question 63
        questions.add(new Question.Builder()
                .setId(63)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Solomon Islands")
                .setOption2("Papua New Guinea")
                .setOption3("Kiribati")
                .setOption4("Tuvalu")
                .setAnswer("Tuvalu")
                .setImageRes(R.drawable.flag_tv)
                .build());

// Question 64
        questions.add(new Question.Builder()
                .setId(64)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Marshall Islands")
                .setOption2("Micronesia")
                .setOption3("Nauru")
                .setOption4("Palau")
                .setAnswer("Palau")
                .setImageRes(R.drawable.flag_pw)
                .build());

// Question 65
        questions.add(new Question.Builder()
                .setId(65)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Antigua and Barbuda")
                .setOption2("Saint Kitts and Nevis")
                .setOption3("Saint Lucia")
                .setOption4("Saint Vincent and the Grenadines")
                .setAnswer("Saint Vincent and the Grenadines")
                .setImageRes(R.drawable.flag_vc)
                .build());

// Question 66
        questions.add(new Question.Builder()
                .setId(66)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Anguilla")
                .setOption2("British Virgin Islands")
                .setOption3("Montserrat")
                .setOption4("Turks and Caicos Islands")
                .setAnswer("Turks and Caicos Islands")
                .setImageRes(R.drawable.flag_tc)
                .build());

// Question 67
        questions.add(new Question.Builder()
                .setId(67)
                .setScore(10)
                .setQuestion("Identify the country by its flag.")
                .setOption1("Gibraltar")
                .setOption2("Jersey")
                .setOption3("Guernsey")
                .setOption4("Isle of Man")
                .setAnswer("Jersey")
                .setImageRes(R.drawable.flag_je)
                .build());

// Question 68
        questions.add(new Question.Builder()
                .setId(68)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Cook Islands")
                .setOption2("Niue")
                .setOption3("Tokelau")
                .setOption4("Samoa")
                .setAnswer("Niue")
                .setImageRes(R.drawable.flag_nu)
                .build());




// Question 70
        questions.add(new Question.Builder()
                .setId(69)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("American Samoa")
                .setOption2("Guam")
                .setOption3("Northern Mariana Islands")
                .setOption4("Puerto Rico")
                .setAnswer("Guam")
                .setImageRes(R.drawable.flag_gu)
                .build());




// Question 73
        questions.add(new Question.Builder()
                .setId(70)
                .setScore(10)
                .setQuestion("Which country does this flag belong to?")
                .setOption1("Pitcairn Islands")
                .setOption2("British Virgin Islands")
                .setOption3("Cayman Islands")
                .setOption4("Bermuda")
                .setAnswer("Bermuda")
                .setImageRes(R.drawable.flag_bm)
                .build());


        questions.add(new Question.Builder()
                .setId(71)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Anguilla")
                .setOption2("Montserrat")
                .setOption3("British Virgin Islands")
                .setOption4("Cayman Islands")
                .setAnswer("Anguilla")
                .setImageRes(R.drawable.flag_ai)
                .build());


        questions.add(new Question.Builder()
                .setId(72)
                .setScore(10)
                .setQuestion("What country does this flag represent?")
                .setOption1("Tokelau")
                .setOption2("Tuvalu")
                .setOption3("Wallis and Futuna")
                .setOption4("Samoa")
                .setAnswer("Tokelau")
                .setImageRes(R.drawable.flag_tk)
                .build());



        return questions;
    }










}
