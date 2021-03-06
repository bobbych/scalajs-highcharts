/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;polygon&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPolygonPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesPolygonPointEvents]] = js.undefined
}

object SeriesPolygonPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesPolygonPointEvents]] = js.undefined): SeriesPolygonPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesPolygonPointEvents]] = events
    new SeriesPolygonPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesPolygonPointEvents]] = eventsOuter
    }
  }
}
