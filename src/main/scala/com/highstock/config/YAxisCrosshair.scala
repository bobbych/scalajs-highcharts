/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-crosshair</code>
  */
@js.annotation.ScalaJSDefined
class YAxisCrosshair extends js.Object {

  /**
    * The color of the crosshair.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 2.1
    */
  val color: js.UndefOr[String] = js.undefined

  /**
    * The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/crosshair-dashed/" target="_blank">Dashed X axis crosshair</a>
    * @since 2.1
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * A label on the axis next to the crosshair.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-label/" target="_blank">Crosshair labels</a>
    * @since 2.1
    */
  val label: js.UndefOr[CleanJsObject[YAxisCrosshairLabel]] = js.undefined

  /**
    * Whether the crosshair should snap to the point or follow the pointer independent of points.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-snap-false/" target="_blank">True by default</a>
    * @since 2.1
    */
  val snap: js.UndefOr[Boolean] = js.undefined

  /**
    * The pixel width of the crosshair.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 2.1
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    * @since 2.1
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}