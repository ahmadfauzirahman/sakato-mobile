package com.ifa.sakato.ui.dashboard

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import com.ifa.sakato.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pieChart()
        barChart()
        groupBarChart()
    }

    private fun pieChart() {
        val pieChart = binding.pieChartReguDanRealisasiBelanjaSatker
        val entries: MutableList<PieEntry> = ArrayList()
        entries.add(PieEntry(25f, "Item 1"))
        entries.add(PieEntry(25f, "Item 2"))
        entries.add(PieEntry(25f, "Item 3"))
        entries.add(PieEntry(25f, "Item 4"))

        val set = PieDataSet(entries, "Results")
        with(set){
            colors = ColorTemplate.COLORFUL_COLORS.asList()
            valueTextSize = 10f
            valueFormatter = PercentFormatter(pieChart)
        }
        val data = PieData(set)

        with(pieChart){
            setData(data)
            setUsePercentValues(true)
            setEntryLabelColor(Color.BLACK)
            setEntryLabelTextSize(10f)
            description.isEnabled = false
            isDrawHoleEnabled = false
            legend.isEnabled = false
            invalidate()
            animate()
        }

        val pieChart2 = binding.pieChartReguDanRealisasiBelanjaSatker2
        val entries2: MutableList<PieEntry> = ArrayList()
        entries2.add(PieEntry(25f, "Item 5"))
        entries2.add(PieEntry(25f, "Item 6"))
        entries2.add(PieEntry(25f, "Item 7"))
        entries2.add(PieEntry(25f, "Item 8"))

        val set2 = PieDataSet(entries2, "Results2")
        with(set2){
            colors = ColorTemplate.COLORFUL_COLORS.asList()
            valueTextSize = 10f
            valueFormatter = PercentFormatter(pieChart)
        }
        val data2 = PieData(set2)

        with(pieChart2){
            setData(data2)
            setUsePercentValues(true)
            setEntryLabelColor(Color.BLACK)
            setEntryLabelTextSize(8f)
            description.isEnabled = false
            legend.isEnabled = false
            invalidate()
            holeRadius = 24f
            transparentCircleRadius = 0f
            animate()
        }
    }

    private fun barChart() {
        val barChart = binding.barChartTargetRealisasiBelajarStandar

        val entries: MutableList<BarEntry> = ArrayList()
        entries.add(BarEntry(0f, 10f))
        entries.add(BarEntry(1f, 20f))
        entries.add(BarEntry(2f, 30f))
        entries.add(BarEntry(3f, 40f))
        entries.add(BarEntry(4f, 50f))

        val xAxisLabel: ArrayList<String> = ArrayList()
        xAxisLabel.add("Item 1")
        xAxisLabel.add("Item 2")
        xAxisLabel.add("Item 3")
        xAxisLabel.add("Item 4")
        xAxisLabel.add("Item 5")

        val xAxis: XAxis = barChart.xAxis
        xAxis.valueFormatter = IndexAxisValueFormatter(xAxisLabel)
        xAxis.granularity = 1f
        xAxis.textSize = 6f
        xAxis.isGranularityEnabled = true
        xAxis.position = XAxis.XAxisPosition.BOTTOM


        val set = BarDataSet(entries, "BarDataSet")
        with(set){
            colors = ColorTemplate.COLORFUL_COLORS.asList()
        }

        val data = BarData(set)
        data.barWidth = 0.9f // set custom bar width
        with(barChart){
            setData(data)
            legend.isEnabled = false
            description.isEnabled = false
            axisRight.isEnabled = false
            setFitBars(true) // make the x-axis fit exactly all bars
            invalidate() // refresh
        }
    }

    private fun groupBarChart() {
        val groupBarChart = binding.horizontalBarChartMonitoringRekapitulasi

        val xAxisLabel: ArrayList<String> = ArrayList()
        xAxisLabel.add("Item 1")
        xAxisLabel.add("Item 2")
        xAxisLabel.add("Item 3")
        xAxisLabel.add("Item 4")
        xAxisLabel.add("Item 5")

        val entries: MutableList<BarEntry> = ArrayList()
        entries.add(BarEntry(0f, 10f))
        entries.add(BarEntry(1f, 20f))
        entries.add(BarEntry(2f, 30f))
        entries.add(BarEntry(3f, 40f))
        entries.add(BarEntry(4f, 50f))




        val xAxis: XAxis = groupBarChart.xAxis
        xAxis.valueFormatter = IndexAxisValueFormatter(xAxisLabel)
        xAxis.granularity = 1f
        xAxis.textSize = 6f
        xAxis.isGranularityEnabled = true
        xAxis.position = XAxis.XAxisPosition.BOTTOM

        val set = BarDataSet(entries, "BarDataSet")
        with(set){
            colors = ColorTemplate.COLORFUL_COLORS.asList()
        }

        val data = BarData(set)
        data.barWidth = 0.9f // set custom bar width
        with(groupBarChart){
            setData(data)
            legend.isEnabled = false
            description.isEnabled = false
            axisLeft.isEnabled = false

            setFitBars(true) // make the x-axis fit exactly all bars
            invalidate() // refresh
        }
    }
}