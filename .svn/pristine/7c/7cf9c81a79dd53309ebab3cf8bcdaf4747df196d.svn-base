package com.asiainfo.tfsPlatform.modules.metrics.exporter;

import com.asiainfo.tfsPlatform.modules.metrics.Counter;
import com.asiainfo.tfsPlatform.modules.metrics.Gauge;
import com.asiainfo.tfsPlatform.modules.metrics.Histogram;
import com.asiainfo.tfsPlatform.modules.metrics.Timer;

public interface MetricRegistryListener {

	void onGaugeAdded(String name, Gauge gauge);

	void onCounterAdded(String name, Counter counter);

	void onHistogramAdded(String name, Histogram histogram);

	void onTimerAdded(String name, Timer timer);

	void onGaugeRemoved(String name);

	void onCounterRemoved(String name);

	void onHistogramRemoved(String name);

	void onTimerRemoved(String name);
}
