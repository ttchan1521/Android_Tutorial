package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmations
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapterSize() {
        val data = listOf(
            Affirmations(R.string.affirmation1, R.drawable.image1),
            Affirmations(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}