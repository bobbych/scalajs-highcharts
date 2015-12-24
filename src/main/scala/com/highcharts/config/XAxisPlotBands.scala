/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class XAxisPlotBands extends js.Object {
  
  /**
   * Border color for the plot band. Also requires <code>borderWidth</code> to be set.
   */
  var borderColor: String = null.asInstanceOf[String]
  
  /**
   * Border width for the plot band.  Also requires <code>borderColor</code> to be set.
   */
  var borderWidth: Double = 0
  
  /**
   * The color of the plot band.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Color band</a>
   */
  var color: UndefOr[String] = js.undefined
  
  /**
   * An object defining mouse events for the plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-events/" target="_blank">Mouse events demonstrated</a>
   * @since 1.2
   */
  var events: UndefOr[js.Object] = js.undefined
  
  /**
   * The start position of the plot band in axis units.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
   */
  var from: UndefOr[Double] = js.undefined
  
  /**
   * An id used for identifying the plot band in Axis.removePlotBand.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-id/" target="_blank">Remove plot band by id</a>
   */
  var id: UndefOr[String] = js.undefined
  
  /**
   * Text labels for the plot bands
   */
  var label: UndefOr[XAxisPlotBandsLabel] = js.undefined
  
  /**
   * The end position of the plot band in axis units.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
   */
  var to: UndefOr[Double] = js.undefined
  
  /**
   * The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Behind plot lines by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-zindex/" target="_blank">above plot lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/" target="_blank">above plot lines and series</a>.
   * @since 1.2
   */
  var zIndex: UndefOr[Double] = js.undefined
}