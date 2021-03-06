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
  * @note JavaScript name: <code>series&lt;flags&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFlags extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers or bars.
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
    * @since 1.3
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/cursor/" target="_blank">Pointer on a line graph</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>flags</code> series type, points can be given in the following ways:
    *  <ol>
    *  <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<flags>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     x: 1,
    *     title: "A",
    *     text: "First event"
    * }, {
    *     x: 1,
    *     title: "B",
    *     text: "Second event"
    * }]</pre></li>
    *  </ol>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsData]]] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[SeriesFlagsDataLabels]] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesFlagsEvents]] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 2.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 1.2.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 2.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * The color of the line/border of the flag. Defaults to <code>"black"</code>.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel width of the candlestick line/border. Defaults to <code>1</code>.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 1.3
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/" target="_blank">Limited to 50</a>
    * @since 2.1.8
    */
  val maxPointWidth: js.UndefOr[Double] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * In case the flag is placed on a series, on what point key to place it. Line and columns have one key, <code>y</code>. In range or OHLC-type series, however, the flag can optionally be placed on the <code>open</code>, <code>high</code>, <code>low</code> or <code>close</code> key.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-onkey/" target="_blank">Range series, flag on high</a>.
    * @since 4.2.2
    */
  val onKey: js.UndefOr[String] = js.undefined

  /**
    * The id of the series that the flags should be drawn on. If no id is given, the flags are drawn on the x axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags/" target="_blank">Flags on series and on x axis</a>
    */
  val onSeries: js.UndefOr[String] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesFlagsPoint]] = js.undefined

  /**
    * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
    * @since 2.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The shape of the marker. Can be one of "flag", "circlepin", "squarepin", or an image on the format <code>url(/path-to-image.jpg)</code>. Individual shapes can also be set for each point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags/" target="_blank">Different shapes</a>
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>
    * 
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @since 2.1.9
    */
  val softThreshold: js.UndefOr[Boolean] = js.undefined

  /**
    * This option allows grouping series in a stacked chart. The stack option can be a string  or a number or anything else, as long as the grouped series' stack options match each other.
    */
  val stack: js.UndefOr[String] = js.undefined

  /**
    * When multiple flags in the same series fall on the same value, this number determines the vertical
    *  offset between them.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags-stackdistance/" target="_blank">A greater stack distance</a>
    */
  val stackDistance: js.UndefOr[Double] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * The text styles of the flag. Defaults to:
    * <pre>style: {
    * 	fontSize: '11px',
    * 	fontWeight: 'bold',
    * 	textAlign: 'center'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
    */
  val threshold: js.UndefOr[Double] = js.undefined

  /**
    * The text to display on each flag. This can be defined on series level, or  individually for each point. Defaults to <code>"A"</code>.
    */
  val title: js.Any = js.undefined

  /**
    * Specific tooltip options for flag series. Flag series tooltips are different from most other types in that a flag doesn't have a data value, so the tooltip rather displays the <code>text</code> option for each point.
    */
  val tooltip: js.UndefOr[CleanJsObject[SeriesFlagsTooltip]] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  val `type`: String = "flags"

  /**
    * Whether to use HTML to render the flag texts. Using HTML allows for advanced formatting, images and reliable bi-directional text rendering. Note that exported images won't respect the HTML, and that HTML won't respect Z-index settings.
    * @since 1.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-visibility/" target="_blank">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * The y position of the top left corner of the flag relative to either the series (if onSeries is defined), or the x axis. Defaults to <code>-30</code>.
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 2.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 2.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsZones]]] = js.undefined
}

object SeriesFlags {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the markers or bars.
    * @param color The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    * @param colors A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
    * @param cropThreshold When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param data An array of data points for the series. For the <code>flags</code> series type, points can be given in the following ways:.  <ol>.  <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<flags>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     title: "A",.     text: "First event". }, {.     x: 1,.     title: "B",.     text: "Second event". }]</pre></li>.  </ol>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param lineColor The color of the line/border of the flag. Defaults to <code>"black"</code>.
    * @param lineWidth The pixel width of the candlestick line/border. Defaults to <code>1</code>.
    * @param linkedTo The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param maxPointWidth The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param onKey In case the flag is placed on a series, on what point key to place it. Line and columns have one key, <code>y</code>. In range or OHLC-type series, however, the flag can optionally be placed on the <code>open</code>, <code>high</code>, <code>low</code> or <code>close</code> key.
    * @param onSeries The id of the series that the flags should be drawn on. If no id is given, the flags are drawn on the x axis.
    * @param point Properties for each single point
    * @param pointIntervalUnit On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param shape The shape of the marker. Can be one of "flag", "circlepin", "squarepin", or an image on the format <code>url(/path-to-image.jpg)</code>. Individual shapes can also be set for each point.
    * @param showCheckbox If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>. . <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param stack This option allows grouping series in a stacked chart. The stack option can be a string  or a number or anything else, as long as the grouped series' stack options match each other.
    * @param stackDistance When multiple flags in the same series fall on the same value, this number determines the vertical.  offset between them.
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    * @param style The text styles of the flag. Defaults to:. <pre>style: {. 	fontSize: '11px',. 	fontWeight: 'bold',. 	textAlign: 'center'. }</pre>
    * @param threshold The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
    * @param title The text to display on each flag. This can be defined on series level, or  individually for each point. Defaults to <code>"A"</code>.
    * @param tooltip Specific tooltip options for flag series. Flag series tooltips are different from most other types in that a flag doesn't have a data value, so the tooltip rather displays the <code>text</code> option for each point.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @param useHTML Whether to use HTML to render the flag texts. Using HTML allows for advanced formatting, images and reliable bi-directional text rendering. Note that exported images won't respect the HTML, and that HTML won't respect Z-index settings.
    * @param visible Set the initial visibility of the series.
    * @param xAxis When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    * @param y The y position of the top left corner of the flag relative to either the series (if onSeries is defined), or the x axis. Defaults to <code>-30</code>.
    * @param yAxis When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @param zIndex Define the visual z index of the series.
    * @param zoneAxis Defines the Axis on which the zones are applied.
    * @param zones An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, data: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsData]]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesFlagsDataLabels]] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesFlagsEvents]] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, maxPointWidth: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, onKey: js.UndefOr[String] = js.undefined, onSeries: js.UndefOr[String] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesFlagsPoint]] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stack: js.UndefOr[String] = js.undefined, stackDistance: js.UndefOr[Double] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, threshold: js.UndefOr[Double] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[CleanJsObject[SeriesFlagsTooltip]] = js.undefined, `type`: String = "flags", useHTML: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, xAxis: js.UndefOr[Double | String] = js.undefined, y: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsZones]]] = js.undefined): SeriesFlags = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val cursorOuter: js.UndefOr[String] = cursor
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsData]]] = data
    val dataLabelsOuter: js.UndefOr[CleanJsObject[SeriesFlagsDataLabels]] = dataLabels
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesFlagsEvents]] = events
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val maxPointWidthOuter: js.UndefOr[Double] = maxPointWidth
    val nameOuter: js.UndefOr[String] = name
    val onKeyOuter: js.UndefOr[String] = onKey
    val onSeriesOuter: js.UndefOr[String] = onSeries
    val pointOuter: js.UndefOr[CleanJsObject[SeriesFlagsPoint]] = point
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val stackOuter: js.UndefOr[String] = stack
    val stackDistanceOuter: js.UndefOr[Double] = stackDistance
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val styleOuter: js.UndefOr[js.Object] = style
    val thresholdOuter: js.UndefOr[Double] = threshold
    val titleOuter: js.Any = title
    val tooltipOuter: js.UndefOr[CleanJsObject[SeriesFlagsTooltip]] = tooltip
    val typeOuter: String = `type`
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val visibleOuter: js.UndefOr[Boolean] = visible
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yOuter: js.UndefOr[Double] = y
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsZones]]] = zones
    new SeriesFlags {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsData]]] = dataOuter
      override val dataLabels: js.UndefOr[CleanJsObject[SeriesFlagsDataLabels]] = dataLabelsOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[SeriesFlagsEvents]] = eventsOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val maxPointWidth: js.UndefOr[Double] = maxPointWidthOuter
      override val name: js.UndefOr[String] = nameOuter
      override val onKey: js.UndefOr[String] = onKeyOuter
      override val onSeries: js.UndefOr[String] = onSeriesOuter
      override val point: js.UndefOr[CleanJsObject[SeriesFlagsPoint]] = pointOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val stack: js.UndefOr[String] = stackOuter
      override val stackDistance: js.UndefOr[Double] = stackDistanceOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val threshold: js.UndefOr[Double] = thresholdOuter
      override val title: js.Any = titleOuter
      override val tooltip: js.UndefOr[CleanJsObject[SeriesFlagsTooltip]] = tooltipOuter
      override val `type`: String = typeOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val y: js.UndefOr[Double] = yOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[CleanJsObject[SeriesFlagsZones]]] = zonesOuter
    }
  }
}
