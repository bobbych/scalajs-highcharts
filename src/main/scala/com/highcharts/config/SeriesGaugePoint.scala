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
  * @note JavaScript name: <code>series&lt;gauge&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesGaugePointEvents]] = js.undefined
}

object SeriesGaugePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesGaugePointEvents]] = js.undefined): SeriesGaugePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesGaugePointEvents]] = events
    new SeriesGaugePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesGaugePointEvents]] = eventsOuter
    }
  }
}
