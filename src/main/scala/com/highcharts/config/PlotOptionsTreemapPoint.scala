/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-treemap-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsTreemapPointEvents]] = js.undefined
}

object PlotOptionsTreemapPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsTreemapPointEvents]] = js.undefined): PlotOptionsTreemapPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsTreemapPointEvents]] = events
    new PlotOptionsTreemapPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsTreemapPointEvents]] = eventsOuter
    }
  }
}
