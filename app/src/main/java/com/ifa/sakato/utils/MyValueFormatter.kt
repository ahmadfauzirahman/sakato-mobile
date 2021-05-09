package com.ifa.sakato.utils

import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.PercentFormatter
import java.text.DecimalFormat


class MyValueFormatter(val format: DecimalFormat, private val pieChart: PieChart?) : PercentFormatter() {

    override fun getFormattedValue(value: Float): String? {
        return format.format(value.toDouble()) + "%"
    }

    override fun getPieLabel(value: Float, pieEntry: PieEntry?): String? {
        return if (pieChart != null && pieChart.isUsePercentValuesEnabled) {
            // Converted to percent
            getFormattedValue(value)
        } else {
            // raw value, skip percent sign
            mFormat.format(value.toDouble())
        }
    }
}