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
  * @note JavaScript name: <code>plotOptions-gauge-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGaugeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsGaugeStatesHover]] = js.undefined
}

object PlotOptionsGaugeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsGaugeStatesHover]] = js.undefined): PlotOptionsGaugeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsGaugeStatesHover]] = hover
    new PlotOptionsGaugeStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsGaugeStatesHover]] = hoverOuter
    }
  }
}
