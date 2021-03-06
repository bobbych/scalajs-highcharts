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
  * @note JavaScript name: <code>series&lt;gauge&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesGaugeStatesHover]] = js.undefined
}

object SeriesGaugeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesGaugeStatesHover]] = js.undefined): SeriesGaugeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesGaugeStatesHover]] = hover
    new SeriesGaugeStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesGaugeStatesHover]] = hoverOuter
    }
  }
}
