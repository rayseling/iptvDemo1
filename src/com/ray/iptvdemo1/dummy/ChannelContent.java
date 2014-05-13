package com.ray.iptvdemo1.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ChannelContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<ChannelItem> ITEMS = new ArrayList<ChannelItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, ChannelItem> ITEM_MAP = new HashMap<String, ChannelItem>();

	static {
		// Add 3 sample items.
		addItem(new ChannelItem("1", "CCTV-HD", "http://101.95.78.69/PLTV/88888888/224/3221225519/03.m3u8"));
//		addItem(new ChannelItem("2", "东方卫视HD", "http://101.95.78.69/PLTV/88888888/224/3221225542/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("3", "湖南卫视", "http://101.95.78.69/PLTV/88888888/224/3221225561/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("4", "浙江卫视", "http://101.95.78.69/PLTV/88888888/224/3221225544/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("5", "北京卫视", "http://101.95.78.69/PLTV/88888888/224/3221225545/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("6", "宁夏卫视", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("7", "江苏卫视", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("8", "旅游卫视", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("9", "广西卫视", "http://101.95.78.69/PLTV/88888888/224/3221225549/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("10", "四川卫视", "http://101.95.78.69/PLTV/88888888/224/3221225550/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("11", "山东卫视", "http://101.95.78.69/PLTV/88888888/224/3221225551/index.m3u8?servicetype=1"));
		
	}

	private static void addItem(ChannelItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class ChannelItem {
		public String id;
		public String name;
		public String url;

		public ChannelItem(String id, String name, String url) {
			this.id=id;
			this.name = name;
			this.url = url;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
