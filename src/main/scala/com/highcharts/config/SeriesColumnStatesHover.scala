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
  * @note JavaScript name: <code>series&lt;column&gt;-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesColumnStatesHover extends js.Object {

  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @example Disable hover on <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/" target="_blank">line</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/" target="_blank">pie</a>
    * @since 1.2
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/halo/" target="_blank">Halo options</a>
    * @since 4.0
    */
  val halo: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverHalo]] = js.undefined

  /**
    * Pixel with of the graph line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/" target="_blank">5px line on hover</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The additional line width for the graph of a hovered series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels wider</a>
    * @since 4.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  val marker: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverMarker]] = js.undefined
}

object SeriesColumnStatesHover {
  /**
    * @param enabled Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @param halo Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
    * @param lineWidth Pixel with of the graph line.
    * @param lineWidthPlus The additional line width for the graph of a hovered series.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, halo: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverHalo]] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverMarker]] = js.undefined): SeriesColumnStatesHover = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val haloOuter: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverHalo]] = halo
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverMarker]] = marker
    new SeriesColumnStatesHover {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val halo: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverHalo]] = haloOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesColumnStatesHoverMarker]] = markerOuter
    }
  }
}
