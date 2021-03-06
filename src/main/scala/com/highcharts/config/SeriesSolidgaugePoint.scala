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
  * @note JavaScript name: <code>series&lt;solidgauge&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSolidgaugePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesSolidgaugePointEvents]] = js.undefined
}

object SeriesSolidgaugePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesSolidgaugePointEvents]] = js.undefined): SeriesSolidgaugePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugePointEvents]] = events
    new SeriesSolidgaugePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesSolidgaugePointEvents]] = eventsOuter
    }
  }
}
