package com.raian.affirmations.data

import com.raian.affirmations.R
import com.raian.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation> {

        var list = mutableListOf<Affirmation>()

            var addList = listOf(
                Affirmation(R.string.affirmation1,R.drawable.messi),
                Affirmation(R.string.affirmation2,R.drawable.cr7),
                Affirmation(R.string.affirmation3,R.drawable.zidane),
                Affirmation(R.string.affirmation4,R.drawable.maradona),
                Affirmation(R.string.affirmation5,R.drawable.ronaldo),
                Affirmation(R.string.affirmation6,R.drawable.xavi),
//                Affirmation(R.string.affirmation7,R.drawable.messi),
//                Affirmation(R.string.affirmation8,R.drawable.cr7)
                )
            list.addAll(addList)

        return list
    }
}