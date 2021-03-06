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
  * @note JavaScript name: <code>legend-title</code>
  */
@js.annotation.ScalaJSDefined
class LegendTitle extends js.Object {

  /**
    * Generic CSS styles for the legend title.
    * @since 3.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * A text or HTML string for the title. 
    * @since 3.0
    */
  val text: js.UndefOr[String] = js.undefined
}

object LegendTitle {
  /**
    * @param style Generic CSS styles for the legend title.
    * @param text A text or HTML string for the title. 
    */
  def apply(style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): LegendTitle = {
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    new LegendTitle {
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    }
  }
}
