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
  * @note JavaScript name: <code>plotOptions-gauge-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGaugePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsGaugePointEvents]] = js.undefined
}

object PlotOptionsGaugePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsGaugePointEvents]] = js.undefined): PlotOptionsGaugePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsGaugePointEvents]] = events
    new PlotOptionsGaugePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsGaugePointEvents]] = eventsOuter
    }
  }
}
