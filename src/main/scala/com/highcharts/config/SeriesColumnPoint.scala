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
  * @note JavaScript name: <code>series&lt;column&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesColumnPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesColumnPointEvents]] = js.undefined
}

object SeriesColumnPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesColumnPointEvents]] = js.undefined): SeriesColumnPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesColumnPointEvents]] = events
    new SeriesColumnPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesColumnPointEvents]] = eventsOuter
    }
  }
}
