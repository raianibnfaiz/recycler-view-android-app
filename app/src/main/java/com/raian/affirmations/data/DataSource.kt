package com.raian.affirmations.data

import com.raian.affirmations.R
import com.raian.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation> {

        var list = mutableListOf<Affirmation>()

            var addList = listOf(
                Affirmation(R.string.affirmation1, R.string.affirmation11,R.drawable.messi),
                Affirmation(R.string.affirmation2,R.string.affirmation12,R.drawable.cr7),
                Affirmation(R.string.affirmation3,R.string.affirmation13,R.drawable.messi),
                Affirmation(R.string.affirmation4,R.string.affirmation14,R.drawable.cr7),
                Affirmation(R.string.affirmation5,R.string.affirmation15,R.drawable.messi),
                Affirmation(R.string.affirmation6,R.string.affirmation16,R.drawable.cr7),
                Affirmation(R.string.affirmation7,R.string.affirmation17,R.drawable.messi),
                Affirmation(R.string.affirmation8,R.string.affirmation18,R.drawable.cr7)


                )
            list.addAll(addList)

        return list
    }
}